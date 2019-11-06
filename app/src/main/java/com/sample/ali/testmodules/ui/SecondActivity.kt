package com.sample.ali.testmodules.ui

import android.content.SharedPreferences
import android.os.Bundle
import com.sample.ali.testmodules.R
import com.sample.ali.testmodules.datamodels.UserDataModel
import dagger.android.AndroidInjector
import dagger.android.DaggerActivity
import org.jetbrains.anko.toast
import javax.inject.Inject

class SecondActivity : DaggerActivity() {
//    @Inject
//    lateinit var sharedPreferences: SharedPreferences
    @Inject
    lateinit var user: UserDataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        toast(user.company.name)
//        toast(sharedPreferences.getString("savedName", "default").toString())
    }
}
