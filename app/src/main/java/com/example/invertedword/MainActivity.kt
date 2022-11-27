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



    // Collects the inverted word
    private fun wordTurn(){
        var listSize = listRevers.size
        var check = true

        while (check) {
            if (listSize >= 0) {
                listSize--

                if (listSize > -1) {
                    for ((a, b) in exclusionsValues) {
                        if (a == finalValue.size) {
                            finalValue.add(b)
                            break
                        }
                    }
                    finalValue.add(listRevers[listSize])
                }
            } else { check = false}
        }
    }

    private val listExclusions = arrayListOf<Char>()

    private val listRevers = arrayListOf<Char>()
    private val exclusionsValues = HashMap<Int, Char>()
    val finalValue = arrayListOf<Char>()

    // This function will convert the entered value into an array
    fun wordArray(word: String): String {

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


        // Deletes and write exceptions
        while (check) {
            if ( listSize >= 0) {
                listSize--
                if (listSize != -1) {
                    for (exclusionElement in listExclusions) {
                        if (exclusionElement == listRevers[listSize]) {
                            exclusionsValues[listSize] = listRevers[listSize]
                            listRevers.removeAt(listSize)
                        }
                    }
                }
            } else {
                check = false
                wordTurn()
            }
        }

        return finalValue.toString()
    }




    // in developing
    // fun clearArray(){
    //    listRevers.clear()
    //   listExclusions.clear()
    // }

}






