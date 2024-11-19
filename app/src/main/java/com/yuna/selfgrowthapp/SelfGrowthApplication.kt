package com.yuna.selfgrowthapp

import android.app.Application
import android.util.Log

class SelfGrowthApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"Application Launched")
    }

    companion object {
        const val TAG = "SelfGrowthApplication"
    }

}

