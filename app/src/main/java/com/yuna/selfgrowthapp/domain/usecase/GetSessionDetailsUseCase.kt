package com.yuna.selfgrowthapp.domain.usecase

import com.yuna.selfgrowthapp.common.Resource
import com.yuna.selfgrowthapp.data.local.dto.toSessionDetails
import com.yuna.selfgrowthapp.domain.model.SessionDetails
import com.yuna.selfgrowthapp.domain.repository.ISessionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetSessionDetailsUseCase @Inject constructor(
    private val iSessionRepository: ISessionRepository
) {

    operator fun invoke(): Flow<Resource<SessionDetails>> = flow {
        try {
            emit(Resource.Loading())
            val sessionDetail = iSessionRepository.getSessionDetails()
            sessionDetail?.let {
                emit(Resource.Success(it.toSessionDetails()))
            } ?: emit(Resource.Error("Couldn't get session details"))
        } catch (e: Exception) {
            emit(Resource.Error("Couldn't get session details"))
        }
    }
}