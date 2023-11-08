package com.example.mypractice.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun InputScreen(navHostController: NavHostController) {
    Surface(modifier = Modifier
        .fillMaxSize()
        .clickable { navHostController.navigate(Routes.WELCOME_SCREEN) }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            TopBar(value = "Dairy Farm Benchmark")
            Spacer(modifier = Modifier.height(20.dp))
            ReusableText(
                value = "Let's Learn About You!",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(20.dp))
            ReusableText(
                value = "The the application will provide suggestions according to your input",
                fontSize = 24.sp,
                fontWeight = FontWeight.Light,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(60.dp))
            ReusableTextField()
        }
    }
}