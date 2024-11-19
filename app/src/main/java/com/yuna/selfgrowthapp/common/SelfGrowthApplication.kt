package com.yuna.selfgrowthapp.common

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SelfGrowthApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"Application Launched")
    }

    companion object {
        const val TAG = "SelfGrowthApplication"
    }

}

