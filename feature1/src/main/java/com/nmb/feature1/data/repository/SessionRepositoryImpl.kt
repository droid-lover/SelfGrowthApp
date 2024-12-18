package com.nmb.feature1.data.repository

import android.content.Context
import com.google.gson.Gson
import com.nmb.feature1.data.dto.SessionDetailsDto
import com.nmb.feature1.domain.repository.ISessionRepository
import com.nmb.logging.AppLogger
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