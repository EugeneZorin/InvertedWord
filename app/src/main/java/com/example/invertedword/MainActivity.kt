package com.example.invertedword

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.invertedword.screens.MainScreen
import com.example.invertedword.screens.exclusionsTexts
import com.example.invertedword.ui.theme.InvertedWordTheme


class MainActivity : ComponentActivity() {

    private val listRevers = arrayListOf<Char>()
    private val listExclusions = arrayListOf<Char>()
    private val exclusionsValues = arrayListOf<Int>()

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

    // This function will convert the entered value into an array
    fun wordToArray(word: String): String {

        // Загрузка исключения в массив
        for (char in exclusionsTexts){
            listExclusions.add(char)
        }

        // Загрузка слова в массив
        for (char in word){
            listRevers.add(char)
        }

        var listSize = listRevers.size
        var check = true
        var exceptionNumber = 0

        // Deletes and write exceptions
        while (check) {
            if ( listSize >= 0) {
                listSize--
                if (listSize != -1) {
                    for (exclusionElement in listExclusions) {
                        if (exclusionElement == listRevers[listSize]) {
                            listRevers.removeAt(listSize)
                            exclusionsValues.add(listSize)
                        }
                    }
                }
                exceptionNumber++
            } else {
                check = false
            }
        }

        return listRevers.toString()
    }

    fun clearArray(){
        listRevers.clear()
        listExclusions.clear()
    }

}
