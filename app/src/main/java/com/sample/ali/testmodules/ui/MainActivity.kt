package com.sample.ali.testmodules.ui

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import dagger.android.DaggerActivity
import org.jetbrains.anko.toast
import javax.inject.Inject
import android.app.KeyguardManager
import android.content.Context
import android.R
import android.app.Activity


class MainActivity : DaggerActivity() {

    private val LOCK_REQUEST_CODE: Int = 123

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.sample.ali.testmodules.R.layout.activity_main)

        toast(sharedPreferences.getString("savedName", "default").toString())
    }

    fun onNextClick(v: View) {
        val keyguardManager = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager

        val isSecure = keyguardManager.isKeyguardSecure

        if (isSecure) {
            val screenLockIntent = keyguardManager.createConfirmDeviceCredentialIntent(
                "HBL Security Check",
                "Provide your phone unlock code to proceed"
            )
            startActivityForResult(screenLockIntent, LOCK_REQUEST_CODE)
        } else {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode != RESULT_CANCELED) {
            if (LOCK_REQUEST_CODE === requestCode) {
                if (resultCode == Activity.RESULT_OK) {
                    //Authentication is successful
                    startActivity(Intent(this, SecondActivity::class.java))
                } else {
                    //Authentication failed
                    toast("WRONG LOCK CODE ENTERED")
                }
            }
        }
    }

}
