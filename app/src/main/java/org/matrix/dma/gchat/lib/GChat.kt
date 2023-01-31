package org.matrix.dma.gchat.lib

import android.util.Log
import com.google.protobuf.ByteString
import com.google.protobuf.GeneratedMessageV3
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import org.matrix.dma.gchat.proto.*
import java.util.*

const val CHAT_API_URL = "https://chat.google.com"
const val CHAT_API_KEY = "AIzaSyD7InnYR3VKdb4j2rMUEbTCIr2VyEazl6k"
val PROTOBUF = "application/x-protobuf".toMediaType()

val CHAT_REQUEST_HEADER = requestHeader {
    clientType = RequestHeader.ClientType.IOS
    clientVersion = 2440378181258
    clientFeatureCapabilities = clientFeatureCapabilities {
        spamRoomInvitesLevel = ClientFeatureCapabilities.CapabilityLevel.FULLY_SUPPORTED
    }
}

class GChat(public var token: DynamiteToken) {
    public fun listTopics() {
        val request = paginatedWorldRequest {
            requestHeader = CHAT_REQUEST_HEADER
            fetchFromUserSpaces = true
            fetchOptions.add(PaginatedWorldRequest.FetchOptions.EXCLUDE_GROUP_LITE)
        }
        val raw = this.pbRequest("paginated_world", request)
        val response = PaginatedWorldResponse.parseFrom(ByteString.copyFrom(raw))
        Log.d("DMA", response.toString())
    }

    private fun pbRequest(name: String, request: GeneratedMessageV3) : ByteArray? {
        val httpRequest = Request.Builder()
            .url("$CHAT_API_URL/api/${name}?rt=b&alt=proto&key=$CHAT_API_KEY")
//            .addHeader("Content-Type", "application/x-protobuf")
//            .addHeader("Connection", "Keep-Alive")
            .addHeader("Authorization", "Bearer ${this.token.accessToken}")
            .addHeader("X-Goog-Encode-Response-If-Executable", "base64")
            .post(request.toByteArray().toRequestBody())
            .build()
        try {
            val response = HTTP_CLIENT.newCall(httpRequest).execute()
            return response.body!!.bytes()
        } catch (exception: Exception) {
            exception.message?.let { Log.e("DMA", it) }
        }
        return null
    }
}