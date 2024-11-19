package com.yuna.selfgrowthapp.domain.model

import com.yuna.selfgrowthapp.data.local.dto.PastSummary

data class SessionDetails(
    val sessionId: String,
    val sessionTitle: String,
    val pastSummaries: List<PastSummary>
)
