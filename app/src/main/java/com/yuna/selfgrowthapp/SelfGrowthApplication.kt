package com.yuna.selfgrowthapp

import android.app.Application
import com.nmb.logging.AppLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SelfGrowthApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "Application Launched")
    }

}

