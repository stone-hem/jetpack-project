package com.example.mypractice.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mypractice.ui.UserInputViewModel

@Composable
fun MyPracticeNavigationGraph(userInputViewModel: UserInputViewModel= viewModel()) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Routes.INPUT_SCREEN) {
        composable(Routes.WELCOME_SCREEN) {
            WelcomeScreen()
        }
        composable(Routes.INPUT_SCREEN) {
            InputScreen(userInputViewModel)
        }
    }
}