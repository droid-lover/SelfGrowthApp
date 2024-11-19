package com.yuna.selfgrowthapp.domain.repository

import com.yuna.selfgrowthapp.data.local.dto.SessionDetailsDto

interface ISessionRepository {

    suspend fun getSessionDetails() : SessionDetailsDto?

}