package com.guifa.demo.jpush

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cn.jpush.android.api.JPushInterface

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val registrationID = JPushInterface.getRegistrationID(this)
        Log.d("RegistrationID", registrationID)
    }
}