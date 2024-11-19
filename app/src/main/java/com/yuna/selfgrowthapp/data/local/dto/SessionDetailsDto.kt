package com.yuna.selfgrowthapp.data.local.dto

import com.yuna.selfgrowthapp.common.AppLogger
import com.yuna.selfgrowthapp.domain.model.SessionDetails

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