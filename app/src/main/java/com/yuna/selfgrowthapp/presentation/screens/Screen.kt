package com.yuna.selfgrowthapp.presentation.screens

sealed class Screen (val route : String) {
    object SessionDetailsScreen : Screen ("session_details_screen")
}