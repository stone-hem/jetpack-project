package com.example.mypractice.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(username: String?, animal: String?) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
            TopBar(value = "Welcome to DFB")
            Spacer(modifier = Modifier.height(20.dp))
            ReusableText(
                value = "Welcome $username",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(20.dp))
            ReusableText(
                value = "Thank You For Letting me Learn!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Light,
                color = Color.Gray
            )
        }
    }
}