package com.example.mypractice.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mypractice.R
import com.example.mypractice.data.UserDataUiEvents
import com.example.mypractice.ui.UserInputViewModel

@Composable
fun InputScreen(userInputViewModel: UserInputViewModel) {
    Surface(modifier = Modifier
        .fillMaxSize()
       ) {
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
            ReusableText(value = "Name", fontSize = 20.sp, fontWeight = FontWeight.Normal, color = MaterialTheme.colorScheme.onPrimary)
            Spacer(modifier = Modifier.height(10.dp))
            ReusableTextField(onTextChanged = {userInputViewModel.onEvent(UserDataUiEvents.UserNameEntered(it))})
            Spacer(modifier = Modifier.height(30.dp))
            ReusableText(value = "What Do you Like?", fontSize = 20.sp, fontWeight = FontWeight.Normal, color = MaterialTheme.colorScheme.onPrimary)
            Spacer(modifier = Modifier.height(30.dp))
            Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround){
                ImageCard(image = R.drawable.logo)
                ImageCard(image = R.drawable.ic_launcher_background)
            }

        }
    }
}