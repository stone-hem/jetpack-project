package com.example.mypractice.ui.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mypractice.R

@Composable
fun TopBar(value: String) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        ReusableText(
            value = value,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xff097969),
            letterSpacing = 2.sp
        )
        Image(
            modifier = Modifier.size(50.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = ""
        )
    }
}

@Composable
fun ReusableText(
    value: String,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    color: Color,
    letterSpacing: TextUnit
) {
    Text(
        text = value,
        fontSize = fontSize,
        fontWeight = fontWeight,
        color = color,
        letterSpacing = letterSpacing
    )
}

@Composable
fun ReusableTextField(onTextChanged: (name: String) -> Unit) {
    var currentValue by remember {
        mutableStateOf("")
    }
    val localFocusManager = LocalFocusManager.current
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = currentValue,
        placeholder = {
            ReusableText(
                value = "Enter Your Name",
                fontSize = 18.sp,
                fontWeight = FontWeight.Light,
                color = Color.Gray,
                letterSpacing = 3.sp
            )
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions { localFocusManager.clearFocus() },
        onValueChange = {
            currentValue = it
            onTextChanged(it)
        })
}

@Composable
fun ReusableImageCard(
    image: Int,
    isSelected: Boolean,
    animalSelected: (animalName: String) -> Unit
) {
    val localFocusManager = LocalFocusManager.current
    Card(modifier = Modifier.size(130.dp), elevation = CardDefaults.cardElevation(4.dp)) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(12.dp),
                    color = if (isSelected) Color.Green else Color.Transparent
                )
        ) {
            Image(
                modifier = Modifier
                    .padding(10.dp)
                    .clickable {
                        val animalName = if (image == R.drawable.clear) "clear" else "tick"
                        animalSelected(animalName)
                        localFocusManager.clearFocus()
                    },
                painter = painterResource(id = image), contentDescription = ""
            )
        }
    }
}

@Composable
fun ReusableButton(goToDetailsScreen: () -> Unit) {
    Button(modifier = Modifier.fillMaxWidth(),
        onClick = { goToDetailsScreen() }) {
        ReusableText(
            value = "Go To Details Screen",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.White,
            letterSpacing = 3.sp
        )
    }
}

@Composable
fun ReusableFact(value: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        ReusableText(
            value = value,
            fontSize = 30.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            letterSpacing = 8.sp
        )
    }
}

