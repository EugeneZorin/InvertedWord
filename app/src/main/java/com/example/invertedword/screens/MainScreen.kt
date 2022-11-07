package com.example.invertedword.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun MainScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
            ) {

        Box(modifier = Modifier
            .width(250.dp)
            .height(60.dp)
            .offset(x = 73.dp, y = 150.dp)
        ) { ReversText()}

        Box(modifier = Modifier
            .width(250.dp)
            .height(60.dp)
            .offset(x = 73.dp, y = 250.dp)
        ) { ExclusionsText() }

        Box(modifier = Modifier
            .width(123.dp)
            .height(51.dp)
            .offset(x = 125.dp, y = 350.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text("Реверс", fontSize = 25.sp)
            }
        }

    }
}

@Composable
fun ReversText() {
    var revers by remember { mutableStateOf("") }

    OutlinedTextField(
        value = revers,
        onValueChange = { revers = it },
        label = { Text("Инверсия") }
    )
}

@Composable
fun ExclusionsText(){
    var exclusions by remember { mutableStateOf("") }

    OutlinedTextField(
        value = exclusions,
        onValueChange = {exclusions = it},
        label = { Text("Исключения")}
    )
}