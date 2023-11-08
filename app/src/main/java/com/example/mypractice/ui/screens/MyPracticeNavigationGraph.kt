package com.example.mypractice.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyPracticeNavigationGraph() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Routes.INPUT_SCREEN) {
        composable(Routes.WELCOME_SCREEN) {
            WelcomeScreen()
        }
        composable(Routes.INPUT_SCREEN) {
            InputScreen(navHostController)
        }
    }
}