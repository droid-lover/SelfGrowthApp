package com.yuna.selfgrowthapp.common

import android.util.Log
import com.yuna.selfgrowthapp.BuildConfig

class AppLogger {

    companion object {
        private const val TAG = "AppLogger"

        fun d(tag: String = TAG, message: String) {
            if (BuildConfig.DEBUG) {
                Log.d(tag, message)
            }
        }

        fun e(tag: String = TAG, message: String) {
            if (BuildConfig.DEBUG) {
                Log.e(tag, message)
            }
        }
    }
}