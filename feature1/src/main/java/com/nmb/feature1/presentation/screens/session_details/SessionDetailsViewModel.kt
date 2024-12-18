package com.nmb.feature1.presentation.screens.session_details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nmb.feature1.domain.usecase.GetSessionDetailsUseCase
import com.nmb.logging.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
open class SessionDetailsViewModel @Inject constructor(
    private val sessionDetailsUseCase: GetSessionDetailsUseCase
) : ViewModel() {

    private val _state = mutableStateOf(SessionDetailsState())
    val state: State<SessionDetailsState> = _state


    init {
        getSessionDetails()
    }

    private fun getSessionDetails() {
        sessionDetailsUseCase().onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    _state.value = SessionDetailsState(isLoading = true)
                }

                is Resource.Success -> {
                    _state.value = SessionDetailsState(sessionDetails = result.data)
                }

                is Resource.Error -> {
                    _state.value = SessionDetailsState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}