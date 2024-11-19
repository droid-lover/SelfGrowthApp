package com.yuna.selfgrowthapp.data.repository

import android.content.Context
import android.util.Log
import androidx.compose.ui.input.key.type
import com.google.gson.Gson
import com.yuna.selfgrowthapp.common.AppLogger
import com.yuna.selfgrowthapp.data.local.dto.SessionDetailsDto
import com.yuna.selfgrowthapp.domain.repository.ISessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SessionRepositoryImpl @Inject constructor(
    private val context: Context
) : ISessionRepository {

    override suspend fun getSessionDetails(): SessionDetailsDto? {
        return withContext(Dispatchers.IO) {
            try {
                val jsonString = context.assets.open("response.json").bufferedReader().use { it.readText() }
                AppLogger.d( message = "session details JSON response read successfully")
                val gson = Gson()
                gson.fromJson(jsonString, SessionDetailsDto::class.java)
            } catch (e: Exception) {
                AppLogger.e( message = "Error reading session details JSON: ${e.message}") // Log the exception
                null
            }
        }
    }
}