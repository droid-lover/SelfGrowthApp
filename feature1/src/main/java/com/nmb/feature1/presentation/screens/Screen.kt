package com.nmb.feature1.presentation.screens

sealed class Screen (val route : String) {
    data object SessionDetailsScreen : Screen("session_details_screen")
}