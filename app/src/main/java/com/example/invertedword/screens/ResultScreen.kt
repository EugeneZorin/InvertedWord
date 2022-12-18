package com.example.invertedword.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.invertedword.mainсode.InputCheck
import com.example.invertedword.ReverseActivity
import com.example.invertedword.mainсode.DataStore


val reverseActivity = ReverseActivity()
val inputCheck = InputCheck()

@Preview(showBackground = true)
@Composable
fun ResultScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(5.dp)
    ) {
        Box(modifier = Modifier
            .width(200.dp)
            .height(55.dp)
            .offset(x = 100.dp, y = 150.dp)
        ) {
            Text(inputCheck.inputCheck(reversTexts, exclusionsTexts),
                fontSize = 50.sp, textAlign = TextAlign.Center) }

        Box(modifier = Modifier
            .width(123.dp)
            .height(51.dp)
            .offset(x = 140.dp, y = 380.dp)
        ) {
            ButtonBack()
        }
    }


}

// Button to open MainActivity
@Composable
fun ButtonBack(){
    val dataStore = DataStore()
    val context = LocalContext.current
    Button(onClick = {

        reverseActivity.buttonBack(context)
        dataStore.clearArray()

    }) {
        Text("Назад", fontSize = 25.sp)
    }
}

