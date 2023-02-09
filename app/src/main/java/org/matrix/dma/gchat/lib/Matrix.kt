package org.matrix.dma.gchat.lib

import android.util.Log
import org.json.JSONObject
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.matrix.dma.gchat.proto.GroupId
import org.matrix.dma.gchat.proto.dmIdOrNull
import org.matrix.dma.gchat.proto.spaceIdOrNull
import java.util.*

const val HARDCODED_LOCALPART = "demo"
const val HARDCODED_LOCALPART_PREFIX = "gchat_"

class Matrix(var accessToken: String?, val homeserverUrl: String, val asToken: String) {
    public var actingUserId: String? = null

    public fun createUser(id: String, name: String): String {
        val localpart = "$HARDCODED_LOCALPART_PREFIX$id"
        var req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/register${this.getImpersonationQuery("?")}")
            .addHeader("Authorization", "Bearer ${this.asToken}")
            .post(JSONObject()
                .put("type", "m.login.application_service")
                .put("username", localpart)
                .toString().toRequestBody(JSON)
            )
            .build()
        this.doRequest(req)!! // ignore response - we just want to know it happened

        val userId = "@$localpart:${this.getDomain()!!}"

        req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/profile/$userId/displayname?user_id=$userId")
            .addHeader("Authorization", "Bearer ${this.asToken}")
            .put(JSONObject()
                .put("displayname", name)
                .toString().toRequestBody(JSON)
            )
            .build()
        this.doRequest(req)!! // ignore response - not important if it fails

        return userId
    }

    public fun appserviceJoin(userId: String, roomId: String) {
        var req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/rooms/$roomId/invite${this.getImpersonationQuery("?")}")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .post(JSONObject()
                .put("user_id", userId)
                .toString().toRequestBody(JSON)
            )
            .build()
        this.doRequest(req)!! // ignore response - not important if it fails (probably because they're already invited)

        req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/rooms/$roomId/join?user_id=$userId")
            .addHeader("Authorization", "Bearer ${this.asToken}")
            .post(JSONObject().toString().toRequestBody(JSON))
            .build()
        this.doRequest(req)!! // ignore response - it'll probably be fine
    }

    public fun getDomain(): String? {
        val whoami = this.whoAmI() ?: return null

        val parts = whoami.split(":")
        return parts.slice(1 until parts.size).joinToString(":")
    }

    public fun getLocalpart(): String? {
        val whoami = this.whoAmI() ?: return null

        val parts = whoami.split(":")
        return parts[0].substring(1)
    }

    public fun ensureRegistered(): String? {
        if (this.accessToken !== null) {
            val whoami = this.whoAmI()
            if (whoami != null && whoami.startsWith("@$HARDCODED_LOCALPART:")) {
                return this.accessToken
            }

            val domain = this.getDomain()

            // Do an appservice registration
            var req = Request.Builder()
                .url("${this.homeserverUrl}/_matrix/client/v3/register${this.getImpersonationQuery("?")}")
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
                    .url("${this.homeserverUrl}/_matrix/client/v3/login${this.getImpersonationQuery("?")}")
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

    public fun appserviceLogin(userId: String): Matrix {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/login${this.getImpersonationQuery("?")}")
            .addHeader("Authorization", "Bearer ${this.asToken}")
            .post(JSONObject()
                .put("type", "m.login.application_service")
                .put("identifier", JSONObject()
                    .put("type", "m.id.user")
                    .put("user", userId)
                )
                .toString().toRequestBody(JSON)
            )
            .build()
        val res = this.doRequest(req)!!
        return Matrix(res.getString("access_token"), this.homeserverUrl, this.asToken)
    }

    public fun whoAmI(): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/account/whoami${this.getImpersonationQuery("?")}")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .get()
            .build()
        return this.doRequest(req)?.getString("user_id")
    }

    public fun whichDeviceAmI(): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/account/whoami${this.getImpersonationQuery("?")}")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .get()
            .build()
        return this.doRequest(req)?.getString("device_id")
    }

    public fun createRoom(name: String, chatId: GroupId): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/createRoom${this.getImpersonationQuery("?")}")
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
                ).put(JSONObject()
                    .put("type", "org.matrix.dma.gchat")
                    .put("state_key", "")
                    .put("content", JSONObject()
                        .put("space_id", chatId.spaceIdOrNull?.spaceId)
                        .put("dm_id", chatId.dmIdOrNull?.dmId)
                    )
                ).put(JSONObject()
                    .put("type", "m.room.topic")
                    .put("state_key", "")
                    .put("content", JSONObject()
                        .put("topic", "Debugging: ${chatId.toString()}")
                    )
                ))
                .toString().toRequestBody(JSON)
            ).build()
        return this.doRequest(req)?.getString("room_id")
    }

    public fun sendEvent(event: MatrixEvent, roomId: String): String? {
        val req = Request.Builder()
            .url("${this.homeserverUrl}/_matrix/client/v3/rooms/$roomId/send/${event.eventType}/m${Date().time}${this.getImpersonationQuery("?")}")
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
            .url("${this.homeserverUrl}/_matrix/client/v3/rooms/$roomId/joined_members${this.getImpersonationQuery("?")}")
            .addHeader("Authorization", "Bearer ${this.accessToken}")
            .get()
            .build()
        val list = ArrayList<String>()
        for (i in this.doRequest(req)?.getJSONObject("joined")?.keys()!!) {
            list.add(i)
        }
        return list
    }

    public fun getImpersonationQuery(leadChar: String): String {
        if (this.actingUserId != null) {
            return "${leadChar}user_id=${this.actingUserId}"
        }
        return leadChar
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