package com.example.mypractice.ui.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
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
            color = Color(0xff097969)
        )
        Image(
            modifier = Modifier.size(50.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = ""
        )
    }
}

@Composable
fun ReusableText(value: String, fontSize: TextUnit, fontWeight: FontWeight, color: Color) {
    Text(
        text = value,
        fontSize = fontSize,
        fontWeight = fontWeight,
        color = color
    )
}

@Composable
fun ReusableTextField(onTextChanged:(name:String)->Unit) {
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
                color = Color.Gray
            )
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions { localFocusManager.clearFocus() },
        onValueChange = {
            currentValue=it
            onTextChanged(it)
        })
}

@Composable
fun ImageCard(image: Int){
    Card (modifier = Modifier.size(130.dp)){
        Image(
            modifier = Modifier.padding(10.dp),
            painter = painterResource(id = image), contentDescription = "")
    }
}

