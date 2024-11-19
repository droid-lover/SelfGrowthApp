package com.yuna.selfgrowthapp.presentation.screens.session_details

import com.yuna.selfgrowthapp.domain.model.SessionDetails

data class SessionDetailsState(
    val isLoading: Boolean = false,
    val sessionDetails: SessionDetails? = null,
    val error: String = ""
)
