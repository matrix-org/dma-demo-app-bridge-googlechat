package org.matrix.dma.gchat.lib

import android.util.Log
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.Date
import java.util.concurrent.TimeUnit

const val CLIENT_ID = "936475272427.apps.googleusercontent.com"
const val CLIENT_SECRET = "KWsJlkaMn1jGLxQpWxMnOox-"
val SCOPES = arrayOf(
    "https://www.google.com/accounts/OAuthLogin",
    "https://www.googleapis.com/auth/userinfo.email",
)
const val REQUEST_URL = "https://accounts.google.com/o/oauth2/token"
val LOGIN_URL = "https://accounts.google.com/o/oauth2/programmatic_auth?client_id=$CLIENT_ID&device_name=DMA_Bridge&scope=" + SCOPES.joinToString("+")

inline fun makeCookieManager(): CookieManager {
    return CookieManager(null, CookiePolicy.ACCEPT_ALL)
}
val HTTP_CLIENT = OkHttpClient.Builder().cookieJar(JavaNetCookieJar(makeCookieManager()))
    .readTimeout(30L, TimeUnit.SECONDS)
    .build()
val JSON = "application/json; charset=utf-8".toMediaType()

class TokenAuth {
    companion object {
        fun exchangeToken(token: String) : Token? {
            val body = JSONObject()
                .put("client_id", CLIENT_ID)
                .put("client_secret", CLIENT_SECRET)
                .put("grant_type", "authorization_code")
                .put("redirect_url", "urn:ietf:wg:oauth:2.0:oob")
                .put("code", token)
                .toString().toRequestBody(JSON)
            val request = Request.Builder().url(REQUEST_URL).post(body).build()
            try {
                val response = HTTP_CLIENT.newCall(request).execute()
                val tokenObj = JSONObject(response.body!!.string())
                return Token(tokenObj.getString("access_token"), tokenObj.getString("refresh_token"), Date(Date().time + (tokenObj.getInt("expires_in") * 1000)))
            } catch (exception: Exception) {
                exception.message?.let { Log.e("DMA", it) }
            }
            return null
        }

        fun refreshToken(refreshToken: String) : Token? {
            val body = JSONObject()
                .put("client_id", CLIENT_ID)
                .put("client_secret", CLIENT_SECRET)
                .put("grant_type", "refresh_token")
                .put("refresh_token", refreshToken)
                .toString().toRequestBody(JSON)
            val request = Request.Builder().url(REQUEST_URL).post(body).build()
            try {
                val response = HTTP_CLIENT.newCall(request).execute()
                val tokenObj = JSONObject(response.body!!.string())
                return Token(tokenObj.getString("access_token"), refreshToken, Date(Date().time + (tokenObj.getInt("expires_in") * 1000)))
            } catch (exception: Exception) {
                exception.message?.let { Log.e("DMA", it) }
            }
            return null
        }
    }
}

data class Token(val accessToken: String, val refreshToken: String, val expiresAt: Date)