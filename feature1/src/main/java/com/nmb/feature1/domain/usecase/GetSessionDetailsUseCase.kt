package com.nmb.feature1.domain.usecase

import com.nmb.feature1.data.dto.toSessionDetails
import com.nmb.feature1.domain.model.SessionDetails
import com.nmb.feature1.domain.repository.ISessionRepository
import com.nmb.logging.Resource
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