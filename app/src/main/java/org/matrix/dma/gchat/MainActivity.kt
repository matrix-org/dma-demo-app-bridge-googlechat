package org.matrix.dma.gchat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject
import org.matrix.dma.gchat.lib.*
import org.matrix.dma.gchat.proto.*
import java.util.*

// Buckets
const val PREF_TOKEN = "token" // Matrix or Google tokens
const val PREF_DYNAMITE = "dynamite"
const val PREF_HOMESERVER = "homeserver"

// Values
const val PREF_ACCESS_TOKEN = "access_token"
const val PREF_APPSERVICE_TOKEN = "as_token"
const val PREF_REFRESH_TOKEN = "refresh_token"
const val PREF_EXPIRES_TS = "expires_at"
const val PREF_HOMESERVER_URL = "homeserver_url"

// Constants
const val REFRESH_AT_MS_LEFT: Long = 60000

class MainActivity : AppCompatActivity() {
    private val tokenTimer = Timer()
    private var gchat: GChat? = null
    private var myId: UserId? = null
    internal var matrix: Matrix? = null
    internal var mxCrypto: MatrixCrypto? = null

    override fun onDestroy() {
        Log.d("DMA", "Destroying everything...")
        super.onDestroy()
        this.tokenTimer.cancel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cookieBox = findViewById<EditText>(R.id.txtOauthCode)
        val continueBtn = findViewById<Button>(R.id.btnContinue)
        continueBtn.setOnClickListener {
            val cookie = cookieBox.text.toString()
            if (cookie.trim().isEmpty()) {
                Toast.makeText(this, R.string.toast_missing_auth_code, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Thread {
                Log.d("DMA", "Exchanging cookie for token (hopefully)")
                val token = TokenAuth.exchangeToken(cookie)
                if (token != null) {
                    this.storeToken(token)
                    this.refreshDynamite(token.accessToken)

                    Handler(this.mainLooper).post {
                        moveToHomeserverSetup(this)
                        val thiz = this
                        this.tokenTimer.schedule(object : TimerTask() {
                            override fun run() {
                                thiz.checkToken()
                            }
                        }, REFRESH_AT_MS_LEFT, REFRESH_AT_MS_LEFT)
                    }
                } else {
                    Handler(this.mainLooper).post {
                        Toast.makeText(this, R.string.toast_invalid_auth_code, Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }.start()
        }

        val shareBtn = findViewById<Button>(R.id.btnShare)
        shareBtn.setOnClickListener {
            val shareIntent = Intent.createChooser(Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, LOGIN_URL)
                type = "text/plain"
            }, null)
            startActivity(shareIntent)
            cookieBox.visibility = View.VISIBLE
            continueBtn.visibility = View.VISIBLE
            shareBtn.visibility = View.INVISIBLE
        }

        val prefs = this.getSharedPreferences(PREF_TOKEN, MODE_PRIVATE)
        if (prefs.getString(PREF_ACCESS_TOKEN, null) != null) {
            Log.d("DMA", "Starting refresh token loop - app started with token")
            moveToHomeserverSetup(this)
            val thiz = this
            this.tokenTimer.schedule(object : TimerTask() {
                override fun run() {
                    thiz.checkToken()
                }
            }, 0, REFRESH_AT_MS_LEFT)
        }
    }

    internal fun createRemoteClient() {
        this.gchat = GChat(this.readDynamiteToken()!!)
    }

    internal fun bridgeRemoteToMatrix() {
        val txtStatus = this.findViewById<TextView>(R.id.txtStatus)
        val toBridge = this.gchat!!.listDmsAndSpaces()
        txtStatus.text = resources.getString(R.string.bridging_x_chats, toBridge.size)
        this.myId = this.gchat!!.getSelfUserId()
        for (gspace in toBridge) {
            if (!gspace.hasGroupId()) continue
            val roomId = getOrMakeRoom(this, gspace.groupId, gspace.roomName)

            val memberships = this.gchat!!.getChatMembers(gspace.groupId)
            val joinedNotUs = memberships.toList().filter { m -> m.membershipState == MembershipState.MEMBER_JOINED && !m.id.memberId.userId.equals(myId!!) }
            for (membership in joinedNotUs) {
                val member = this.gchat!!.getMember(membership.id.memberId)
                bridgeUserTo(this, member.user.userId.id, roomId, member.user.name)
            }
        }
    }

    internal fun setUpRemoteSync() {
        this.gchat!!.ch.onTextMessage = { ev, groupId ->
            val senderId = ev.message.creator.userId
            val text = ev.message.textBody
            sendMatrixMessage(this, ev.message.id.messageId, groupId, senderId.id, senderId.equals(myId!!), text)
        }
        this.gchat!!.startLoop()
    }

    internal fun sendToRemote(chatId: ChatID, text: String, mxEventId: String) {
        this.gchat?.sendMessage(chatId, text, mxEventId)
    }

    internal fun createRoomOnRemote(name: String): ChatID {
        return this.gchat!!.createSpace(name)
    }

    private fun storeToken(token: Token) {
        val prefs = this.getSharedPreferences(PREF_TOKEN, MODE_PRIVATE)
        prefs.edit()
            .putString(PREF_ACCESS_TOKEN, token.accessToken)
            .putString(PREF_REFRESH_TOKEN, token.refreshToken)
            .putLong(PREF_EXPIRES_TS, token.expiresAt.time)
            .commit()
    }

    private fun storeDynamiteToken(token: DynamiteToken) {
        val prefs = this.getSharedPreferences(PREF_DYNAMITE, MODE_PRIVATE)
        prefs.edit()
            .putString(PREF_ACCESS_TOKEN, token.accessToken)
            .putLong(PREF_EXPIRES_TS, token.expiresAt.time)
            .commit()
    }

    private fun readDynamiteToken(): DynamiteToken? {
        val prefs = this.getSharedPreferences(PREF_DYNAMITE, MODE_PRIVATE)
        val accessToken = prefs.getString(PREF_ACCESS_TOKEN, null)
        val expiresTs = prefs.getLong(PREF_EXPIRES_TS, 0)
        if (accessToken != null) {
            return DynamiteToken(accessToken, Date(expiresTs))
        }
        return null
    }

    private fun checkToken() {
        Log.d("DMA", "Checking token validity")
        var prefs = this.getSharedPreferences(PREF_TOKEN, MODE_PRIVATE)
        var accessToken = prefs.getString(PREF_ACCESS_TOKEN, null)
        val refreshToken = prefs.getString(PREF_REFRESH_TOKEN, null)
        var expiresTs = prefs.getLong(PREF_EXPIRES_TS, 0)
        if (accessToken == null || refreshToken == null) {
            return
        }
        var expiresIn = expiresTs - Date().time
        if (expiresIn <= REFRESH_AT_MS_LEFT || expiresTs <= 0) {
            Thread {
                Log.d("DMA", "Refreshing token")
                val token = TokenAuth.refreshToken(refreshToken)
                if (token != null) {
                    this.storeToken(token)
                    this.refreshDynamite(token.accessToken)
                    accessToken = token.accessToken
                }
            }.start()
        }

        if (accessToken == null) {
            return
        }

        // Check the dynamite token
        prefs = this.getSharedPreferences(PREF_DYNAMITE, MODE_PRIVATE)
        val dynAccessToken = prefs.getString(PREF_ACCESS_TOKEN, null)
        expiresTs = prefs.getLong(PREF_EXPIRES_TS, 0)
        expiresIn = expiresTs - Date().time
        if (dynAccessToken == null || expiresIn <= REFRESH_AT_MS_LEFT || expiresTs <= 0) {
            Thread {
                this.refreshDynamite(accessToken!!)
            }.start()
        }
    }

    private fun refreshDynamite(accessToken: String) {
        Log.d("DMA", "Refreshing dynamite token")
        val token = DynamiteAuth.exchangeToken(accessToken)
        if (token != null) {
            this.storeDynamiteToken(token)
            Log.d("DMA", "Got dynamite token")
            if (this.gchat != null) {
                this.gchat!!.token = token
            }
        }
    }

}

data class TempUser(val client: Matrix, val crypto: MatrixCrypto)
