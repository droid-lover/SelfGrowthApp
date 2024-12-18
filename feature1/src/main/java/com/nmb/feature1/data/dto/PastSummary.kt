package com.nmb.feature1.data.dto

data class PastSummary(
    val createdAt: String,
    val emotions: List<Emotion>,
    val highlights: List<String>,
    val id: String,
    val quote: String
)