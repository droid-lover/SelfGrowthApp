package com.yuna.selfgrowthapp.data.local.dto

data class Conversation(
    val createdAt: String,
    val id: String,
    val pastSummaries: List<PastSummary>,
    val title: String,
    val updatedAt: String
)