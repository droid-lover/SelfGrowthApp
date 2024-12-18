package com.nmb.feature1.domain.repository

import com.nmb.feature1.data.dto.SessionDetailsDto


interface ISessionRepository {

    suspend fun getSessionDetails() : SessionDetailsDto?

}