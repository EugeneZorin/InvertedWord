package com.example.invertedword

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.invertedword.mainсode.DataStore
import com.example.invertedword.screens.MainScreen
import com.example.invertedword.ui.theme.InvertedWordTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InvertedWordTheme {
                MainScreen()
            }
        }
    }

    // Button to open ReverseActivity
    fun buttonRevers(context: Context) {
        intent = Intent(context, ReverseActivity::class.java)
        context.startActivity(intent)
    }



    // in developing
    // fun clearArray(){
    //    listRevers.clear()
    //   listExclusions.clear()
    // }

}






