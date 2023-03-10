package org.matrix.dma.gchat.lib

import org.json.JSONObject
import org.matrix.dma.gchat.proto.*

typealias ChatID = GroupId
typealias UserID = String // .user.id

const val HARDCODED_LOCALPART = "demo"
const val HARDCODED_NAMESPACE_PREFIX = "gchat_"
const val HARDCODED_APPSERVICE_ID = "googlechat"
const val MATRIX_NAMESPACE = "org.matrix.dma.gchat"

fun getLocalpartForChatId(chatId: ChatID): String {
    return if (chatId.spaceIdOrNull != null) "${HARDCODED_NAMESPACE_PREFIX}space_${chatId.spaceId.spaceId}"
    else if (chatId.dmIdOrNull != null) "${HARDCODED_NAMESPACE_PREFIX}dm_${chatId.dmId.dmId}"
    else throw java.lang.RuntimeException("invalid chat ID: unknown type")
}

fun getLocalpartForUserId(userId: UserID): String {
    return "$HARDCODED_NAMESPACE_PREFIX$userId"
}

fun getIdEventContent(chatId: ChatID): JSONObject {
    return JSONObject()
        .put("space_id", chatId.spaceIdOrNull?.spaceId)
        .put("dm_id", chatId.dmIdOrNull?.dmId)
}

fun stateIdToChatId(id: JSONObject): ChatID {
    val mxDmId = id.optString("dm_id")
    val mxSpaceId = id.optString("space_id")
    if (mxDmId.isNotEmpty()) {
        return groupId {
            dmId = dmId { dmId = mxDmId }
        }
    } else {
        return groupId {
            spaceId = spaceId { spaceId = mxSpaceId }
        }
    }
}