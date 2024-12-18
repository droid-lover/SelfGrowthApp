package com.nmb.feature1.domain.model

import com.nmb.feature1.data.dto.PastSummary


data class SessionDetails(
    val sessionId: String,
    val sessionTitle: String,
    val pastSummaries: List<PastSummary>
)
