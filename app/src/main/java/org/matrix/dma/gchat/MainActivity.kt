package org.matrix.dma.gchat

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.matrix.dma.gchat.lib.*
import org.matrix.rustcomponents.sdk.crypto.OlmMachine
import java.security.SecureRandom
import java.util.*
import org.json.JSONObject
import org.matrix.dma.gchat.proto.*

// Buckets
const val PREF_TOKEN = "token";
const val PREF_DYNAMITE = "dynamite"
const val PREF_HOMESERVER = "homeserver"

// Values
const val PREF_ACCESS_TOKEN = "access_token"
const val PREF_APPSERVICE_TOKEN = "as_token"
const val PREF_REFRESH_TOKEN = "refresh_token"
const val PREF_EXPIRES_TS = "expires_at"
const val PREF_HOMESERVER_URL = "homeserver_url"

// Constants
const val REFRESH_AT_MS_LEFT : Long = 60000

class MainActivity : AppCompatActivity() {

    private val tokenTimer = Timer()
    private var gchat: GChat? = null
    private var matrix: Matrix? = null
    private var mxCrypto: MatrixCrypto? = null

    override fun onDestroy() {
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
                        this.moveToHomeserverSetup()
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
            this.moveToHomeserverSetup()
            val thiz = this
            this.tokenTimer.schedule(object : TimerTask() {
                override fun run() {
                    thiz.checkToken()
                }
            }, 0, REFRESH_AT_MS_LEFT)
        }
    }

    private fun moveToHomeserverSetup() {
        // At this stage, we should be able to set up a GChat client
        this.gchat = GChat(this.readDynamiteToken()!!)

//        moveToBridgeSync()
//        return

        // Quickly make sure we're not having to skip a step
        val hsPrefs = getSharedPreferences(PREF_HOMESERVER, MODE_PRIVATE);
        if (hsPrefs.getString(PREF_ACCESS_TOKEN, null) !== null) {
            moveToAppserviceTest();
            return
        }

        setContentView(R.layout.homeserver_setup_layout)

        val downloadRegistrationButton = findViewById<Button>(R.id.btnDownloadRegistration)
        downloadRegistrationButton.setOnClickListener {
            val attributes = ContentValues()
            attributes.put(MediaStore.MediaColumns.DISPLAY_NAME, "googlechat.yaml")
            attributes.put(MediaStore.MediaColumns.MIME_TYPE, "text/yaml")

            val asToken = this.randomString(32)
            val hsToken = this.randomString(32) // unused in the app

            val prefs = getSharedPreferences(PREF_HOMESERVER, MODE_PRIVATE)
            prefs.edit()
                .putString(PREF_ACCESS_TOKEN, asToken)
                .putString(PREF_APPSERVICE_TOKEN, asToken)
                .commit()

            val uri = contentResolver.insert(MediaStore.Files.getContentUri("external"), attributes)!!
            val stream = contentResolver.openOutputStream(uri)!!
            stream.write("id: googlechat\nas_token: '$asToken'\nhs_token: '$hsToken'\nurl: null\nrate_limited: false\nsender_localpart: gchat_bot\nnamespaces:\n  users: [{exclusive: true, regex: '@gchat_.+'}, {exclusive: false, regex: '@demo:.+'}]\n  aliases: [{exclusive: true, regex: '#gchat_.+'}]\n  rooms: []\n".toByteArray())
            stream.close()

            val shareIntent = Intent.createChooser(Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_STREAM, uri)
                putExtra(Intent.EXTRA_SUBJECT, "googlechat.yaml")
                type = "text/plain"
            }, null)
            startActivity(shareIntent)

            moveToAppserviceTest()
        }
    }

    private fun moveToAppserviceTest() {
        val hsPrefs = getSharedPreferences(PREF_HOMESERVER, MODE_PRIVATE)
        val hsStoredUrl = hsPrefs.getString(PREF_HOMESERVER_URL, null)
        if (hsStoredUrl != null) {
            moveToBridgeSync()
            return
        }

        setContentView(R.layout.appservice_test_layout)

        val hsUrlBox = findViewById<TextView>(R.id.txtHsUrl)
        val testButton = findViewById<Button>(R.id.btnTestConnection)
        testButton.setOnClickListener {
            val hsUrl = hsUrlBox.text.toString()
            if (hsUrl.trim().isEmpty()) {
                Toast.makeText(this, R.string.toast_missing_homeserver_url, Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            Thread {
                val prefs = getSharedPreferences(PREF_HOMESERVER, MODE_PRIVATE)
                val accessToken = prefs.getString(PREF_ACCESS_TOKEN, null)!!
                val asToken = prefs.getString(PREF_APPSERVICE_TOKEN, accessToken)!!

                val client = Matrix(accessToken, hsUrl, asToken)
                try {
                    val realAccessToken = client.ensureRegistered()
                    client.accessToken = realAccessToken
                    val whoami = client.whoAmI()
                    if (whoami != null) {
                        prefs.edit()
                            .putString(PREF_HOMESERVER_URL, hsUrl)
                            .putString(PREF_ACCESS_TOKEN, realAccessToken).commit()
                    } else {
                        this.showInvalidHomeserverUrlToast()
                        return@Thread
                    }
                } catch (exception: java.lang.Exception) {
                    this.showInvalidHomeserverUrlToast()
                    return@Thread
                }

                Log.d("DMA", "Bridging as ${client.whoAmI()} (${client.whichDeviceAmI()}) / ${client.accessToken}")
                Handler(this.mainLooper).post {
                    moveToBridgeSync()
                }
            }.start()
        }
    }

    private fun moveToBridgeSync() {
        setContentView(R.layout.initial_sync_layout)

        val prefs = getSharedPreferences(PREF_HOMESERVER, MODE_PRIVATE)
//        prefs.edit()
//            .putString(PREF_HOMESERVER_URL, "http://172.16.0.111:8338")
//            .putString(PREF_ACCESS_TOKEN, "syt_ZXhhbXBsZV91c2VyXzE2NzYwNjYxOTAxOTI_QAibkboWXqAQGNtXIFTV_18nJ8F")
//            .putString(PREF_APPSERVICE_TOKEN, "5620tl97s4w28fqngt3u5zjb3g6ejr51")
//            .commit()
        val homeserverUrl = prefs.getString(PREF_HOMESERVER_URL, null)!!
        val accessToken = prefs.getString(PREF_ACCESS_TOKEN, null)!!
        val asToken = prefs.getString(PREF_APPSERVICE_TOKEN, accessToken)!!
        this.matrix = Matrix(
            "syt_ZXhhbXBsZV91c2VyXzE2NzYwNjYxOTAxOTI_QAibkboWXqAQGNtXIFTV_18nJ8F",
            homeserverUrl,
            asToken
        )

        val txtStatus = findViewById<TextView>(R.id.txtStatus)
        txtStatus.text = resources.getText(R.string.sync_from_google)
        Thread {
            this.mxCrypto = MatrixCrypto(this.matrix!!, applicationInfo.dataDir + "/crypto")
            this.mxCrypto!!.runOnce()

            val toBridge = this.gchat!!.listDmsAndSpaces()
            txtStatus.text = resources.getString(R.string.bridging_x_chats, toBridge.size)
            val myId = this.gchat!!.getSelfUserId()
            for (gspace in toBridge) {
                if (!gspace.hasGroupId()) continue
                val existingRoomId = this.matrix!!.findRoomByChatId(gspace.groupId)
                if (existingRoomId != null && existingRoomId.isNotEmpty()) {
                    Log.d("DMA", "${gspace.groupId} already has room: $existingRoomId")
                    continue
                }
                val roomId = this.matrix!!.createRoom(gspace.roomName, gspace.groupId)!!
                val memberships = this.gchat!!.getChatMembers(gspace.groupId)
                val joinedNotUs = memberships.toList().filter { m -> m.membershipState == MembershipState.MEMBER_JOINED && !m.id.memberId.userId.equals(myId) }
                for (membership in joinedNotUs) {
                    val member = this.gchat!!.getMember(membership.id.memberId)
                    val mxid = this.matrix!!.createUser(member.user.userId.id, member.user.name)
                    this.matrix!!.appserviceJoin(mxid, roomId)

                    // Create the crypto stuff for that user too
                    val tempAccessToken = prefs.getString(mxid, null)
                    var tempClient: Matrix?
                    if (tempAccessToken == null) {
                        tempClient = this.matrix!!.appserviceLogin(mxid)
                        prefs.edit().putString(mxid, tempClient.accessToken!!).commit()
                    } else {
                        tempClient = Matrix(tempAccessToken, this.matrix!!.homeserverUrl, this.matrix!!.asToken)
                    }
                    val tempCrypto = MatrixCrypto(tempClient, applicationInfo.dataDir + "/appservice_users/" + tempClient.getLocalpart())
                    tempCrypto.runOnce()
                    tempCrypto.cleanup()
                }
            }

            txtStatus.text = resources.getString(R.string.syncing_gchat)
            this.gchat!!.startLoop()

            txtStatus.text = resources.getString(R.string.syncing_matrix)
            this.matrix!!.startSyncLoop(this.mxCrypto!!, { ev, id ->
                Log.d("DMA", "Got message: $ev\n\n$id")
                val chatId = this.stateIdToChatId(id)
                val senderInfo = ev.getJSONObject("X-sender")
                var text = ev.getJSONObject("content").getString("body")
                if (senderInfo.getString("X-myUserId") != ev.getString("sender")) {
                    val displayName = senderInfo.optString("displayname")
                    text = (if (displayName.isNotEmpty()) "<$displayName>: " else  "<${ev.getString("sender")}>: ") + text
                }
                this.gchat?.sendMessage(chatId, text)
            }, { roomId, state ->
                Log.d("DMA", "Got room: $roomId\n\n$state")
                return@startSyncLoop JSONObject()
            })
        }.start()
    }

    private fun stateIdToChatId(id: JSONObject): GroupId {
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

    private fun showInvalidHomeserverUrlToast() {
        Handler(this.mainLooper).post {
            Toast.makeText(this, R.string.toast_invalid_homeserver_url, Toast.LENGTH_SHORT).show()
        }
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

    private fun randomString(length: Int) : String {
        val random = SecureRandom()
        val characters = "abcdefghijklmnopqrstuvwxyz0123456789"
        val builder = StringBuilder()
        for (i in 0 until length) {
            builder.append(characters[random.nextInt(characters.length)])
        }
        return builder.toString()
    }
}