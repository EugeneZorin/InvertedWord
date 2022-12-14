package com.example.invertedword

import com.example.invertedword.mainсode.WordArray
import com.example.invertedword.screens.exclusionsTexts

class InputCheck() {

    private val wordArray = WordArray()

    // Checking for the same input in both lines
    fun inputCheck(word: String): String{

        val finalValue: String = if (word == exclusionsTexts){
            word

        } else { wordArray.wordArray(word) }

        return finalValue
    }

}