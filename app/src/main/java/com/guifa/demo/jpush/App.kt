package com.guifa.demo.jpush

import androidx.multidex.MultiDexApplication
import com.guifa.jpush.JPushInitHelper

class App : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        JPushInitHelper.instance.init(this, true, "test")
    }
}