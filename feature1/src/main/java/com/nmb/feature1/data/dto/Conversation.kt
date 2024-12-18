package com.nmb.feature1.data.dto

data class Conversation(
    val createdAt: String,
    val id: String,
    val pastSummaries: List<PastSummary>,
    val title: String,
    val updatedAt: String
)