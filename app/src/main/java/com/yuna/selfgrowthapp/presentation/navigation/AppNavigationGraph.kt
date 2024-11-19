package com.yuna.selfgrowthapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yuna.selfgrowthapp.presentation.screens.Screen
import com.yuna.selfgrowthapp.presentation.screens.session_details.SessionDetailsScreen

@Composable
fun AppNavigationGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.SessionDetailsScreen.route) {

        composable(route = Screen.SessionDetailsScreen.route) {
            SessionDetailsScreen()
        }
    }

}