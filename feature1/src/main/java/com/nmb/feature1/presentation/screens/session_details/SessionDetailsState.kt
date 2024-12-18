package com.nmb.feature1.presentation.screens.session_details

import com.nmb.feature1.domain.model.SessionDetails


data class SessionDetailsState(
    val isLoading: Boolean = false,
    val sessionDetails: SessionDetails? = null,
    val error: String = ""
)
