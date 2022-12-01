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
import com.example.invertedword.ReverseActivity
import com.example.invertedword.mainсode.DataStore
import com.example.invertedword.mainсode.WordArray
import com.example.invertedword.mainсode.dataStore

val reverseActivity = ReverseActivity()
val wordArray = WordArray()

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
            .offset(x = 127.dp, y = 150.dp)
        ) {
            Text(wordArray.wordArray(reversTexts),
                fontSize = 50.sp, textAlign = TextAlign.Center) }

        Box(modifier = Modifier
            .width(123.dp)
            .height(51.dp)
            .offset(x = 136.dp, y = 380.dp)
        ) {
            ButtonBack()
        }
    }


}

// Button to open MainActivity
@Composable
fun ButtonBack(){
    val context = LocalContext.current
    Button(onClick = {

        reverseActivity.buttonBack(context)

    }) {
        Text("Назад", fontSize = 25.sp)
    }
}

