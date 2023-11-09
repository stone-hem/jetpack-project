package com.example.mypractice.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            TopBar(value = "Welcome to DFB")
            Spacer(modifier = Modifier.height(20.dp))
            ReusableText(
                value = "Welcome $username",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                letterSpacing = 3.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                ReusableText(
                    value = if (animal == "tick") "You are a Successful!" else "You Have Failed The Test!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray,
                    letterSpacing = 3.sp
                )
                Icon(
                    imageVector = if (animal == "tick") Icons.Filled.Check else Icons.Filled.Clear,
                    contentDescription = ""
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            ReusableFact(value = "The One Fact About Masters is that They Never Disappoint")

        }
    }
}