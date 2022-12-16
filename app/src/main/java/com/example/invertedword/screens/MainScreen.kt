package com.example.invertedword.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.invertedword.MainActivity

var exclusionsTexts: String = ""
var reversTexts: String = ""


@Preview(showBackground = true)
@Composable
fun MainScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
    ) {

        Box(
            modifier = Modifier
                .width(250.dp)
                .height(60.dp)
                .offset(x = 70.dp, y = 150.dp)
        ) { ReversText() }

        Box(
            modifier = Modifier
                .width(250.dp)
                .height(60.dp)
                .offset(x = 70.dp, y = 250.dp)
        ) { ExclusionsText() }

        Box(
            modifier = Modifier
                .width(123.dp)
                .height(51.dp)
                .offset(x = 130.dp, y = 350.dp)
        ) {
            ButtonRevers()
        }

    }
}


// Button to open ReverseActivity
@Composable
fun ButtonRevers(){

    val mainActivity = MainActivity()
    val context = LocalContext.current

    Button(onClick = {

        mainActivity.buttonRevers(context)

    }) {
        Text("Реверс", fontSize = 25.sp)
    }
}

@Composable
fun ReversText() {
    var revers by remember { mutableStateOf("") }
    val maxChar = 15


    OutlinedTextField(
        value = revers,
        onValueChange = {
            if (it.length <= maxChar){
                revers = it
            }
        },
        label = { Text("Инверсия")},
        placeholder = { Text(text = "Введите символы")},
        maxLines = 1

    )
    reversTexts = revers
}


@Composable
fun ExclusionsText() {
    var exclusions by remember { mutableStateOf("") }
    val maxChar = 15

    OutlinedTextField(
        value = exclusions,
        onValueChange = {
            if (it.length <= maxChar){
                exclusions = it
            }
        },
        label = { Text("Исключения") },
        placeholder = { Text(text = "Введите исключения")},
    )

    exclusionsTexts = exclusions
}



