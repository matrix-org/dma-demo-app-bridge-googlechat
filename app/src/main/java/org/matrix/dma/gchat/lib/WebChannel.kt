package org.matrix.dma.gchat.lib

import android.util.Base64
import android.util.Log
import okhttp3.FormBody
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.json.JSONArray
import org.json.JSONObject
import org.matrix.dma.gchat.proto.*
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URLEncoder
import java.nio.charset.Charset

class WebChannel(val gChat: GChat) {
    private var sid: String? = null
    private var aid = 0
    private var ofs = 0
    private var cookies: MutableMap<String, String> = mutableMapOf()
    private val buffer = ChunkBuffer()

    public var onTextMessage: ((e: MessageEvent, groupId: GroupId) -> Unit)? = null

    public fun register() {
        val url = "https://chat.google.com/webchannel/register".toHttpUrl().newBuilder()
//            .addQueryParameter("ignore_compass_cookie", "1") // from the web app
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        try {
            conn.requestMethod = "POST"
            conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
            conn.setRequestProperty("Content-Type", "application/x-protobuf")
            //        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 14_7_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) FxiOS/36.0  Mobile/15E148 Safari/605.1.15")
            //        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")

            addCookiesToRequest(conn)
            conn.connect()
            parseSetCookies(conn)

            if (conn.responseCode != 200) {
                throw java.lang.RuntimeException("Failed to register with WebChannel")
            }


            // TODO: Is there supposed to be a cookie here?
            // no cookie is set for mautrix-googlechat
            // conn.headerFields["Set-Cookie"]

            /*
                // https://github.com/EionRobb/purple-googlechat/blob/master/googlechat_connection.c#L497
                GoogleChatAccount *ha = user_data;
                gchar *compass_cookie = purple_http_cookie_jar_get(ha->cookie_jar, "COMPASS");

                if (g_str_has_prefix(compass_cookie, "dynamite=")) {
                    const gchar *csessionid = &compass_cookie[9];
                    if (*csessionid) {
                        g_free(ha->csessionid_param);
                        ha->csessionid_param = g_strdup(csessionid);
                    }
                }
             */
        } finally {
            conn.disconnect()
        }
    }

    private fun parseSetCookies(conn: HttpURLConnection) {
        val setCookieHeaders = conn.headerFields["Set-Cookie"]

        if (setCookieHeaders == null) {
            return
        }
        for (cookieHeader in setCookieHeaders) {
            val cookieName = cookieHeader.split("=")[0]
            val cookieValue = cookieHeader.substring(cookieName.length + 1).split(";")[0]
            cookies.put(cookieName, cookieValue)
        }
    }

    private fun addCookiesToRequest(conn: HttpURLConnection) {
        for (cookie in cookies) {
            conn.addRequestProperty("Cookie", "${cookie.key}=${cookie.value}")
        }
    }

    public fun fetchSessionId() {
        val url = "https://chat.google.com/webchannel/events_encoded".toHttpUrl().newBuilder()
            .addQueryParameter("VER", "8")
            .addQueryParameter("CVER", "22")
            .addQueryParameter("AID", "0")
            .addQueryParameter("t", "1")
            .addQueryParameter("$" + "req", "count=0")
            .addQueryParameter("RID", "0")
            .addQueryParameter("SID", "null")
            .addQueryParameter("TYPE", "init")
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        try {
            conn.requestMethod = "GET"
            conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
            conn.setRequestProperty("Accept", "*/*")

            addCookiesToRequest(conn)
            conn.connect()
            parseSetCookies(conn)

            // we have something useful to do! (hopefully)
            val init = conn.headerFields["X-HTTP-Initial-Response"]
                ?: throw java.lang.RuntimeException("Should never happen: missing init header")

            val arr = JSONArray(init[0])
            val sid = arr.getJSONArray(0).getJSONArray(1).getString(1)
            if (this.sid != sid) {
                this.sid = sid
                this.aid = 0
                this.ofs = 0
                this.sendMaps()
            }
            this.handleChunks(conn.inputStream)
        } finally {
            conn.inputStream?.close()
        }
    }

    public fun sendMaps() {
        val ping = pingEvent {
            state = PingEvent.State.ACTIVE
            applicationFocusState = PingEvent.ApplicationFocusState.FOCUS_STATE_FOREGROUND
            clientInteractiveState = PingEvent.ClientInteractiveState.INTERACTIVE
            clientNotificationsEnabled = true
        }
        val streamEvent = streamEventsRequest {
            pingEvent = ping
        }
        this.doStream(streamEvent)
    }

    public fun doStream(ev: StreamEventsRequest) {
        val b64 = Base64.encodeToString(ev.toByteString().toByteArray(), Base64.DEFAULT)
        val url = "https://chat.google.com/webchannel/events_encoded".toHttpUrl().newBuilder()
            .addQueryParameter("VER", "8")
            .addQueryParameter("RID", "1")
            .addQueryParameter("t", "1")
            .addQueryParameter("SID", this.sid)
            .addQueryParameter("AID", this.aid.toString())
            .addQueryParameter("CI", "0")
        val form = FormBody.Builder()
            .add("count", "1")
            .add("ofs", this.ofs.toString())
            // this has an extra \n in it so we strip it forcefully:
            // req0___data__: {"data": "EggIARgBKAEwAQ=="} vs req0___data__: {"data":"EggIARgBKAEwAQ==\n"}
            .add("req0___data__", URLEncoder.encode(JSONObject().put("data", b64).toString().replace("\\n", "")))
            .build()
        this.ofs++
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        try {
            conn.requestMethod = "POST"
            conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            conn.setRequestProperty("Accept", "*/*")

            // need to set headers before we start writing the body
            addCookiesToRequest(conn)

            for (i in 0 until form.size) {
                if (i > 0) conn.outputStream.write('&'.toInt())
                conn.outputStream.write(form.name(i).toByteArray(Charset.forName("UTF-8")))
                conn.outputStream.write('='.toInt())
                conn.outputStream.write(form.value(i).toByteArray(Charset.forName("UTF-8")))
            }

            conn.outputStream.close()
            conn.connect()
            parseSetCookies(conn)
            // TODO: Even with a 200 OK, is this behaving correctly? Are we sending corrupt data?
            if (conn.responseCode != 200) {
                throw java.lang.RuntimeException("Failed to ping WebChannel")
            }
        } finally {
            conn.inputStream?.close()
        }
    }

    public fun doLongPoll() {
        Log.d("DMA", "Starting new longpoll request")
        val url = "https://chat.google.com/webchannel/events_encoded".toHttpUrl().newBuilder()
            .addQueryParameter("VER", "8")
            .addQueryParameter("CVER", "22")
            .addQueryParameter("AID", this.aid.toString())
            .addQueryParameter("t", "1")
            .addQueryParameter("CI", "0")
            .addQueryParameter("RID", "rpc")
            .addQueryParameter("SID", this.sid)
            .addQueryParameter("TYPE", "xmlhttp")
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        try {
            conn.requestMethod = "GET"
            conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
            conn.setRequestProperty("Accept", "*/*")

            addCookiesToRequest(conn)
            conn.connect()
            parseSetCookies(conn)

            this.handleChunks(conn.inputStream)
        } finally {
            conn.inputStream?.close()
        }
    }

    private fun handleChunks(stream: InputStream) {
        val buf = ByteArray(1024)
        var streamEnded = false
        val currentAid = this.aid
        while (!streamEnded) {
            val read = stream.read(buf)
            if (read > 0) {
                this.buffer.addData(buf.slice(0 until read).toByteArray())

                var chunk = this.buffer.readChunk()
                while (chunk != null) {
                    // Example chunk = [[1,["noop"]]]
                    // [[4,[{"data":"CgRCAmAh"}]]]
                    val withoutOuter = JSONArray(chunk).getJSONArray(0)
                    // Example withoutOuter: 1,["noop"]
                    // 4,[{"data":"CgRCAmAh"}]
                    this.aid = withoutOuter.getInt(0) // TODO: Safer handling...
                    Log.d("WebChannel", "Got chunk: $chunk with chunk ID ${this.aid}")
                    val payload = withoutOuter.getJSONArray(1).get(0)
                    if (payload is String && payload == "noop") {
                        // noop
                    } else if (payload is JSONObject && payload.has("data")) {
                        val data = payload.getString("data")
                        StreamEventsResponse.parseFrom(Base64.decode(data, Base64.DEFAULT)).let {
                            this.handleStreamEventsResponse(it)
                        }
                    } else {
                        Log.d("WebChannel", "Got unknown payload: $payload")
                    }
                    chunk = this.buffer.readChunk()
                }
            } else if (read == -1) {
                Log.d("WebChannel", "Stream closed having read ${this.aid - currentAid} chunks")
                streamEnded = true
            }
            // otherwise wait for more data
        }
        // the aid should be set to the most recent PDU
    }

    private fun handleStreamEventsResponse(it: StreamEventsResponse) {
        Log.d("handleStreamEventsResponse", "Got response: $it")
        if (!it.hasEvent() || it.event.bodiesCount < 1 || this.onTextMessage == null) return
        for (i in 0 until it.event.bodiesCount) {
            val body = it.event.getBodies(i)
            if (body.hasMessagePosted()) {
                this.onTextMessage!!(body.messagePosted, it.event.groupId)
            }
        }
    }
}