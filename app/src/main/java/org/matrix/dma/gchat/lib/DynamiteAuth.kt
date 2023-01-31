package org.matrix.dma.gchat.lib

import android.util.Log
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.util.*

class DynamiteAuth {
    companion object {
        public fun exchangeToken(accessToken: String): DynamiteToken? {
            val body = JSONObject()
                .put("app_id", "com.google.Dynamite")
                .put(
                    "client_id",
                    "redacted"
                )
                .put("passcode_present", "YES")
                .put("response_type", "token")
                .put(
                    "scope", arrayOf(
                        "https://www.googleapis.com/auth/dynamite",
                        "https://www.googleapis.com/auth/drive",
                        "https://www.googleapis.com/auth/mobiledevicemanagement",
                        "https://www.googleapis.com/auth/notifications",
                        "https://www.googleapis.com/auth/supportcontent",
                        "https://www.googleapis.com/auth/chat.integration",
                        "https://www.googleapis.com/auth/peopleapi.readonly"
                    ).joinToString(" ")
                )
                .toString().toRequestBody(JSON)
            val request = Request.Builder()
                .url("https://oauthaccountmanager.googleapis.com/v1/issuetoken")
                .addHeader("Authorization", "Bearer $accessToken")
                .post(body)
                .build()
            try {
                val response = HTTP_CLIENT.newCall(request).execute()
                val tokenObj = JSONObject(response.body!!.string())
                return DynamiteToken(
                    tokenObj.getString("token"), Date(
                        Date().time + (tokenObj.getInt("expiresIn") * 1000)
                    )
                )
            } catch (exception: Exception) {
                exception.message?.let { Log.e("DMA", it) }
            }
            return null
        }
    }
}

data class DynamiteToken(val accessToken: String, val expiresAt: Date)