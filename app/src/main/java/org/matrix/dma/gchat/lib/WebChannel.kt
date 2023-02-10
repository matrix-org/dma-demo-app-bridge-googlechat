package org.matrix.dma.gchat.lib

import android.annotation.SuppressLint
import android.util.Base64
import android.util.Log
import okhttp3.FormBody
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import org.matrix.dma.gchat.proto.PingEvent
import org.matrix.dma.gchat.proto.StreamEventsRequest
import org.matrix.dma.gchat.proto.pingEvent
import org.matrix.dma.gchat.proto.streamEventsRequest
import java.net.HttpURLConnection
import java.nio.charset.Charset

class WebChannel(val gChat: GChat) {
    private var sid: String? = null
    private var aid = 0
    private var ofs = 0

    public fun register() {
        val url = "https://chat.google.com/webchannel/register".toHttpUrl().newBuilder()
            .addQueryParameter("ignore_compass_cookie", "1")
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        conn.requestMethod = "POST"
        conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
        conn.setRequestProperty("Content-Type", "application/x-protobuf")
        conn.connect()

        Log.d("DMA-R", conn.inputStream.readAllBytes().toString(Charset.forName("UTF-8")))

        if (conn.responseCode != 200) {
            throw java.lang.RuntimeException("Failed to register with WebChannel")
        }

        // TODO: Is there supposed to be a cookie here?

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
    }

    public fun fetchSessionId() {
        val url = "https://chat.google.com/webchannel/events_encoded".toHttpUrl().newBuilder()
            .addQueryParameter("VER", "8")
            .addQueryParameter("RID", "0")
            .addQueryParameter("CVER", "22")
            .addQueryParameter("TYPE", "init")
            .addQueryParameter("$" + "req", "count=1")
            .addQueryParameter("SID", "null")
            .addQueryParameter("t", "1")
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
        conn.connect()

        val firstRead = conn.inputStream.read()

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

        var chunker = ByteArray(1)
        chunker[0] = firstRead.toByte()
        val buf = ByteArray(1024)
        while(true) {
            val read = conn.inputStream.read(buf)
            if (read > 0) {
                val original = chunker
                chunker = ByteArray(original.size + read)
                for (i in original.indices) {
                    chunker[i] = original[i]
                }
                for (i in 0 until read) {
                    chunker[i + original.size] = buf[i]
                }
                if (chunker.toString(Charset.forName("UTF-8")).contains("[\"close\"]")) {
                    conn.disconnect()
                    this.doLongPoll()
                }
            }
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
            .addQueryParameter("RID", "1234")
            .addQueryParameter("SID", this.sid)
            .addQueryParameter("AID", this.aid.toString())
            .addQueryParameter("CI", "0")
            .addQueryParameter("t", "1")
        val form = FormBody.Builder()
            .add("count", "1")
            .add("ofs", this.ofs.toString())
            .add("req0___data__", JSONObject().put("data", b64).toString())
            .build()
        this.ofs++
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        conn.requestMethod = "POST"
        conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        for (i in 0 until form.size) {
            if (i > 0) conn.outputStream.write('&'.toInt())
            conn.outputStream.write(form.name(i).toByteArray(Charset.forName("UTF-8")))
            conn.outputStream.write('='.toInt())
            conn.outputStream.write(form.value(i).toByteArray(Charset.forName("UTF-8")))
        }
        conn.connect()

        if (conn.responseCode != 200) {
            throw java.lang.RuntimeException("Failed to ping WebChannel")
        }
    }

    public fun doLongPoll() {
        val url = "https://chat.google.com/webchannel/events_encoded".toHttpUrl().newBuilder()
            .addQueryParameter("VER", "8")
            .addQueryParameter("RID", "rpc")
            .addQueryParameter("SID", this.sid)
            .addQueryParameter("AID", this.aid.toString())
            .addQueryParameter("CI", "0")
            .addQueryParameter("t", "1")
            .addQueryParameter("TYPE", "xmlhttp")
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.setRequestProperty("Authorization", "Bearer ${this.gChat.token.accessToken}")
        conn.connect()

        var chunker = ByteArray(0)
        val buf = ByteArray(1024)
        while(true) {
            val read = conn.inputStream.read(buf)
            if (read > 0) {
                val original = chunker
                chunker = ByteArray(original.size + read)
                for (i in original.indices) {
                    chunker[i] = original[i]
                }
                for (i in 0 until read) {
                    chunker[i + original.size] = buf[i]
                }
                Log.d("DMA-D", chunker.toString(Charset.forName("UTF-8")))
            }
        }
    }
}