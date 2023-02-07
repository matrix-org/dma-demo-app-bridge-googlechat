package org.matrix.dma.gchat.lib

import android.util.Log
import org.json.JSONObject
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

const val HARDCODED_LOCALPART = "demo"

class Matrix(var accessToken: String?, val homeserverUrl: String) {
    public fun ensureRegistered(): String? {
        if (this.accessToken !== null) {
            val whoami = this.whoAmI()
            if (whoami != null && whoami.startsWith("@$HARDCODED_LOCALPART:")) {
                return this.accessToken
            }

            val parts = whoami!!.split(":")
            val domain = parts.slice(1 until parts.size).joinToString(":")

            // Do an appservice registration
            var req = Request.Builder()
                .url("${this.homeserverUrl}/_matrix/client/v3/register")
                .addHeader("Authorization", "Bearer ${this.accessToken}")
                .post(JSONObject()
                    .put("type", "m.login.application_service")
                    .put("username", HARDCODED_LOCALPART)
                    .toString().toRequestBody(JSON)
                )
                .build()
            var res = this.doRequest(req)!!
            if (res.getString("errcode") == "M_USER_IN_USE") {
                // Okay, try to log in
                req = Request.Builder()
                    .url("${this.homeserverUrl}/_matrix/client/v3/login")
                    .addHeader("Authorization", "Bearer ${this.accessToken}")
                    .post(JSONObject()
                        .put("type", "m.login.application_service")
                        .put("identifier", JSONObject()
                            .put("type", "m.id.user")
                            .put("user", "@$HARDCODED_LOCALPART:$domain")
                        )
                        .toString().toRequestBody(JSON)
                    )
                    .build()
                res = this.doRequest(req)!!
                return res.getString("access_token")
            } else {
                return res.getString("access_token")
            }
        } else {
            throw java.lang.RuntimeException("UIA wasn't considered for the demo")
        }
    }

    public fun whoAmI(): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/account/whoami")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .get()
            .build()
        return this.doRequest(req)?.getString("user_id")
    }

    public fun whichDeviceAmI(): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/account/whoami")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .get()
            .build()
        return this.doRequest(req)?.getString("device_id")
    }

    public fun doRequest(request: Request): JSONObject? {
        try {
            val response = HTTP_CLIENT.newCall(request).execute()
            return JSONObject(response.body!!.string())
        } catch (exception: Exception) {
            exception.message?.let { Log.e("DMA", it) }
        }
        return null
    }
}