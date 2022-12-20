package com.example.invertedword.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.invertedword.MainActivity

var exclusionsTexts: String = ""
var reversTexts: String = ""


@Preview(showBackground = true)
@Composable
fun MainScreen() {

    var visible by remember { mutableStateOf(false) }
    var revers by remember { mutableStateOf("") }
    var exclusions by remember { mutableStateOf("") }

    val mainActivity = MainActivity()
    val context = LocalContext.current
    val maxChar = 15


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
        ) {
            OutlinedTextField(
                value = revers,
                onValueChange = {
                    if (it.length <= maxChar){
                        revers = it
                    }
                },
                label = { Text("Инверсия")},
                placeholder = { Text(text = "Введите символы")},
                maxLines = 1,
            )
            reversTexts = revers

        }

        Box(
            modifier = Modifier
                .width(250.dp)
                .height(30.dp)
                .offset(x = 80.dp, y = 150.dp)
        ){
            Column {
                AnimatedVisibility(
                    visible = visible,

                    ) {
                    // Content that needs to appear/disappear goes here:
                    Text(
                        color = Color.Red,
                        fontSize = 12.sp,
                        text = "Ошибка! Вы ввели меньше 3 букв",
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .width(250.dp)
                .height(60.dp)
                .offset(x = 70.dp, y = 170.dp)
        ) {
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

        Box(
            modifier = Modifier
                .width(123.dp)
                .height(51.dp)
                .offset(x = 130.dp, y = 250.dp)
        ) {
            Button(modifier = Modifier.clickable {  }, onClick = {
                if(reversTexts.length > 2){
                    mainActivity.buttonRevers(context)
                } else {
                    visible = true
                }
            }) {
                Text("Реверс", fontSize = 25.sp)
            }
        }

    }
}












