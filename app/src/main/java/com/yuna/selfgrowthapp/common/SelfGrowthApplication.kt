package com.yuna.selfgrowthapp.common

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SelfGrowthApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "Application Launched")
    }

}

