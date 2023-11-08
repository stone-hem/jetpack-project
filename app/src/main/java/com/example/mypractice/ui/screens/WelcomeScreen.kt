package com.example.mypractice.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun WelcomeScreen(){
    Surface (modifier = Modifier.fillMaxSize()){
        Text(text = Routes.WELCOME_SCREEN, modifier = Modifier.fillMaxWidth().height(50.dp))
    }
}