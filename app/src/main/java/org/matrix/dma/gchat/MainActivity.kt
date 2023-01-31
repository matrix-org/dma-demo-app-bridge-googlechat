package org.matrix.dma.gchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.matrix.dma.gchat.lib.*
import java.util.*

// Buckets
const val PREF_TOKEN = "token";
const val PREF_DYNAMITE = "dynamite"

// Values
const val PREF_ACCESS_TOKEN = "access_token"
const val PREF_REFRESH_TOKEN = "refresh_token"
const val PREF_EXPIRES_TS = "expires_at"

// Constants
const val REFRESH_AT_MS_LEFT : Long = 60000

class MainActivity : AppCompatActivity() {

    private val tokenTimer = Timer()

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

                    Thread {
                        val dynPrefs = this.getSharedPreferences(PREF_DYNAMITE, MODE_PRIVATE)
                        val client = GChat(DynamiteToken(dynPrefs.getString(PREF_ACCESS_TOKEN, null)!!, Date()))
                        client.listTopics()
                    }.start()
                    Handler(this.mainLooper).post {
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
            shareBtn.visibility = View.INVISIBLE
            val thiz = this
            this.tokenTimer.schedule(object : TimerTask() {
                override fun run() {
                    thiz.checkToken()
                }
            }, 0, REFRESH_AT_MS_LEFT)

            Thread {
                val dynPrefs = this.getSharedPreferences(PREF_DYNAMITE, MODE_PRIVATE)
                val client = GChat(DynamiteToken(dynPrefs.getString(PREF_ACCESS_TOKEN, null)!!, Date()))
                client.listTopics()
            }.start()
        }
    }

    private fun storeToken(token: Token) {
        val prefs = this.getSharedPreferences(PREF_TOKEN, MODE_PRIVATE)
        prefs.edit()
            .putString(PREF_ACCESS_TOKEN, token.accessToken)
            .putString(PREF_REFRESH_TOKEN, token.refreshToken)
            .putLong(PREF_EXPIRES_TS, token.expiresAt.time)
            .apply()
    }

    private fun storeDynamiteToken(token: DynamiteToken) {
        val prefs = this.getSharedPreferences(PREF_DYNAMITE, MODE_PRIVATE)
        prefs.edit()
            .putString(PREF_ACCESS_TOKEN, token.accessToken)
            .putLong(PREF_EXPIRES_TS, token.expiresAt.time)
            .apply()
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
        }
    }
}