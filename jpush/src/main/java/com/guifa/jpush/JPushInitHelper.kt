package com.guifa.jpush

import android.content.Context
import cn.jpush.android.api.JPushInterface

class JPushInitHelper private constructor() {

    companion object {
        val instance: JPushInitHelper by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            JPushInitHelper()
        }
    }

    fun init(context: Context, openDebug: Boolean, channel: String) {
        JPushInterface.setDebugMode(openDebug)
        JPushInterface.init(context)
        JPushInterface.setChannel(context, channel)
    }
}