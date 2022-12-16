package com.example.invertedword.mainсode

import com.example.invertedword.screens.exclusionsTexts

class InputCheck() {

    // Checking for the same input in both lines
    fun inputCheck(word: String): String{

        val finalValue: String = if (word == exclusionsTexts){
            word

        } else {
            wordArray.searchExceptionNumber(word, exclusionsTexts)
            wordArray.wordArray(word, exclusionsTexts) }

        return finalValue
    }

}