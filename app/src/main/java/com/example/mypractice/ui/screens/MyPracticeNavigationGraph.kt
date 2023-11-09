package com.example.mypractice.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mypractice.ui.UserInputViewModel

@Composable
fun MyPracticeNavigationGraph(userInputViewModel: UserInputViewModel= viewModel()) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Routes.INPUT_SCREEN) {
        composable(Routes.WELCOME_SCREEN+"/{username}/{animal}", arguments = listOf(
            navArgument(name = "username"){type= NavType.StringType},
            navArgument(name = "animal"){type= NavType.StringType}
        )) {backStackEntry->
            val username=backStackEntry.arguments?.getString("username")
            val animal=backStackEntry.arguments?.getString("animal")
            WelcomeScreen(username,animal)
        }
        composable(Routes.INPUT_SCREEN) {
            InputScreen(userInputViewModel,navHostController)
        }
    }
}