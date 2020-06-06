package org.tcncoalition

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle


val context: Context by lazy { App.ctx!! }

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
    }


    companion object {
        @SuppressLint("StaticFieldLeak")
        var ctx: Context? = null
            private set
    }

}