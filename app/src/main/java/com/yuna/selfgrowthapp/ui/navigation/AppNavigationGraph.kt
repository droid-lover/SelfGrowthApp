package com.yuna.selfgrowthapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nmb.feature1.presentation.screens.Screen

@Composable
fun AppNavigationGraph() {

    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Screen.SessionDetailsScreen.route) {

        composable(route = Screen.SessionDetailsScreen.route) {
            com.nmb.feature1.presentation.screens.session_details.SessionDetailsScreen()
        }
    }
}