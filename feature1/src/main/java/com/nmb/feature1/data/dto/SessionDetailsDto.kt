package com.nmb.feature1.data.dto

import com.nmb.feature1.domain.model.SessionDetails
import com.nmb.logging.AppLogger

data class SessionDetailsDto(
    val conversation: Conversation
)

fun SessionDetailsDto.toSessionDetails(): SessionDetails {
    AppLogger.d(message = "SessionDetailsDto converted to SessionDetails")
    return SessionDetails(
        sessionId = conversation.id,
        sessionTitle = conversation.title,
        pastSummaries = conversation.pastSummaries
    )
}