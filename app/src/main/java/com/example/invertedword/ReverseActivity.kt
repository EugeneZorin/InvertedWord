package com.example.invertedword


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.invertedword.screens.ResultScreen
import com.example.invertedword.ui.theme.InvertedWordTheme


class ReverseActivity: ComponentActivity() {

    val mainActivity = MainActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InvertedWordTheme {
                ResultScreen()
            }
        }
    }

    // Button to open MainActivity
    fun buttonBack(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }





}
