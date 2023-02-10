package org.matrix.dma.gchat.lib

import android.util.Base64
import android.util.Log
import com.google.protobuf.ByteString
import com.google.protobuf.GeneratedMessageV3
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import org.matrix.dma.gchat.proto.*
import java.io.BufferedInputStream
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.Charset
import java.util.concurrent.TimeUnit

const val CHANNEL_URL = "https://chat.google.com/webchannel"
val CHANNEL_CLIENT = OkHttpClient.Builder()
    .cookieJar(JavaNetCookieJar(makeCookieManager()))
    .readTimeout(30L, TimeUnit.MINUTES)
    .build()

class BrowserChannel(val gchat: GChat) {
    private var ackId = 0
    private var reqId = 0
    private var sessionId = ""
    private var ofs = 0
    private val chunks = ChunkBuffer()

    public fun start() {
        val csessionId = this.register()
        while (true) {
            this.reqId = 0
            this.poll()
        }
    }

    private fun register(): String {
        val req = Request.Builder()
            .url("$CHANNEL_URL/register")
            .addHeader("Authorization", "Bearer ${this.gchat.token.accessToken}")
            .addHeader("X-Goog-Encode-Response-If-Executable", "base64")
//            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")
            .addHeader("Connection", "Keep-Alive")
            .post("".toRequestBody(PROTOBUF))
            .build()
        val res = CHANNEL_CLIENT.newCall(req).execute()
        this.sessionId = ""
        this.ackId = 0
        this.ofs = 0

        if (!res.isSuccessful || res.code != 200) {
            throw java.lang.RuntimeException("Failed to register with web channel")
        }

        // TODO: Extract csession ID, if present

        return ""
    }

    private fun poll() {
        Log.d("DMA", "Starting poll")
        this.chunks.buf = ByteArray(0)
        val url = HttpUrl.Builder()
            .scheme("https")
            .host("chat.google.com")
            .addPathSegment("webchannel")
            .addPathSegment("events_encoded")
            .setQueryParameter("VER", "8")
            .setQueryParameter("CVER",  "22") // client type
            .setQueryParameter("AID", "${this.ackId}")
            .setQueryParameter("t", "1") // trial
        if (this.sessionId.isNotEmpty()) {
            Log.d("DMA", "Using session ID: ${this.sessionId}")
            url.setQueryParameter("CI", "0")
                .setQueryParameter("RID", "rpc")
                .setQueryParameter("SID", this.sessionId)
                .setQueryParameter("TYPE", "xmlhttp")
        } else {
            url.setQueryParameter("\$req", "count=0") // noop
                .setQueryParameter("RID", "0")
                .setQueryParameter("SID", "null")
                .setQueryParameter("TYPE", "init")
        }
        this.reqId++
        val conn = url.build().toUrl().openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.setRequestProperty("Authorization", "Bearer ${this.gchat.token.accessToken}")
        conn.setRequestProperty("X-Goog-Encode-Response-If-Executable", "base64")
//        conn.setRequestProperty("User-Agent",  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")
        conn.setRequestProperty("Connection", "Keep-Alive")
        conn.readTimeout = 30 * 60 * 1000
        conn.doOutput = false
        conn.doInput = true

        try {
            val initHeaders = conn.headerFields["X-HTTP-Initial-Response"]
            if (initHeaders != null && initHeaders.isNotEmpty()) {
                val initResponse = initHeaders[0]
                val parsed = JSONArray(initResponse)
                val sid = parsed.getJSONArray(0).getJSONArray(1).getString(1)
                if (sid != this.sessionId) {
                    this.sessionId = sid
                    this.ackId = 0
                    this.ofs = 0
                    this.sendPing()
                }
            }

            val stream = BufferedInputStream(conn.inputStream)
            while (true) {
                val buf = ByteArray(1024)
                val read = stream.read(buf)
                if (read > 0) {
                    this.chunks.addData(buf.sliceArray(0 until read))
                    this.chunks.removeChunks()
                    val str = this.chunks.buf.toString(Charset.forName("UTF-8"))
//                    if (str.contains("[[2,[\"close\"]]]")) {
//                        return
//                    }
                    Log.d("DMA", "Buffer: $str")
                }
            }
        } catch (e: Exception) {
            Log.e("DMA", e.toString())
        } finally {
            conn.disconnect()
        }

        Log.d("DMA", "Done")
    }

    private fun sendPing() {
        val gids = this.gchat.listDmsAndSpaces().map { s -> s.groupId }
        val res = this.sendStreamData(streamEventsRequest {
            pingEvent = pingEvent {
                state = PingEvent.State.ACTIVE
                applicationFocusState = PingEvent.ApplicationFocusState.FOCUS_STATE_FOREGROUND
                clientInteractiveState = PingEvent.ClientInteractiveState.INTERACTIVE
                clientNotificationsEnabled = true
            }
        })
//        val d = StreamEventsResponse.parseFrom(ByteString.copyFrom(res))
//        Log.d("DMA", d.toString())

        // now subscribe to things
//        this.sendStreamData(streamEventsRequest {
//            groupSubscriptionEvent = groupSubscriptionEvent {
//                groupIds.addAll(gids)
//            }
//        })
    }

    private fun sendStreamData(pb: GeneratedMessageV3): ByteArray {
        val url = HttpUrl.Builder()
            .scheme("https")
            .host("chat.google.com")
            .addPathSegment("webchannel")
            .addPathSegment("events_encoded")
            .setQueryParameter("VER", "8")
            .setQueryParameter("AID", "${this.ackId}")
            .setQueryParameter("t", "1") // trial
            .setQueryParameter("RID", "${this.reqId}")
            .setQueryParameter("CI", "0") // use streaming/chunks
            .setQueryParameter("SID", this.sessionId)
        val form = FormBody.Builder()
            .add("count", "1")
            .add("ofs", this.ofs.toString())
            .add("req0___data__", JSONObject().put("data", Base64.encodeToString(pb.toByteString().toByteArray(), Base64.DEFAULT)).toString())
            .build()
        val req = Request.Builder()
            .url(url.build())
            .addHeader("Authorization", "Bearer ${this.gchat.token.accessToken}")
            .addHeader("X-Goog-Encode-Response-If-Executable", "base64")
//            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")
            .addHeader("Connection", "Keep-Alive")
            .addHeader("Content-Type", "application/x-www-form-urlencoded")
            .post(form)
            .build()
        this.reqId++
        this.ofs++
        val res = CHANNEL_CLIENT.newCall(req).execute()
        return res.body!!.bytes()
    }
}