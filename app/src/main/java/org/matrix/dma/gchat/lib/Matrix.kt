package org.matrix.dma.gchat.lib

import android.util.Log
import org.json.JSONObject
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import java.util.*

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

    public fun createRoom(name: String): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/createRoom")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .post(JSONObject()
                .put("preset", "private_chat")
                .put("name", name)
                .put("initial_state", JSONArray().put(JSONObject()
                    .put("type", "m.room.encryption")
                    .put("state_key", "")
                    .put("content", JSONObject()
                        .put("algorithm", "m.megolm.v1.aes-sha2")
                    )
                ))
                .toString().toRequestBody(JSON)
            ).build()
        return this.doRequest(req)?.getString("room_id")
    }

    public fun sendEvent(event: MatrixEvent, roomId: String): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/rooms/$roomId/send/${event.eventType}/m${Date().time}")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .put(event.content.toString().toRequestBody(JSON))
            .build()
        return this.doRequest(req)?.getString("event_id")
    }

    public fun makeTextEvent(text: String): MatrixEvent {
        return MatrixEvent(
            "m.room.message",
            JSONObject()
                .put("msgtype", "m.text")
                .put("body", text),
            null
        )
    }

    public fun getJoinedUsers(roomId: String): List<String>? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/rooms/$roomId/joined_members")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .get()
            .build()
        val list = ArrayList<String>()
        for (i in this.doRequest(req)?.getJSONObject("joined")?.keys()!!) {
            list.add(i)
        }
        return list
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

data class MatrixEvent(val eventType: String, val content: JSONObject, val stateKey: String?)