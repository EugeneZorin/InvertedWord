package com.example.invertedword.mainсode

import com.example.invertedword.screens.exclusionsTexts

class WordArray{

    private val wordTurn = WordTurn()
    private var indentationCheck = false

    // This is the main function where other functions are called.
    // write word in hashmap
    fun wordArray(word: String, exclusionsTexts: String): String {

        var purifiedWord: String = removingExceptionsWord(word, exclusionsTexts)

        var keyWordNumber: Int = 0
        var singleWordString: String = ""

        for (char in purifiedWord){
            if(char != ' '){
                singleWordString += char.toString()
            } else {
                dataStore.mapRevers.put(keyWordNumber, singleWordString)
                singleWordString = " "
                keyWordNumber++
                indentationCheck = true
            }
        }

        dataStore.mapRevers.put(keyWordNumber, singleWordString)

        return wordTurn.wordTurn()
    }

    // Records the exception number
    fun searchExceptionNumber(word: String, exclusionsTexts: String){

        val exceptions = exclusionsTexts
        var keyExclusionsValues: Int = 0

         for(index in word){
             for (char in exceptions){
                 if (index == char){
                     dataStore.exclusionsValues.put(keyExclusionsValues, char)
                 }
             }
             keyExclusionsValues++
         }
    }

    // Removing an exception from a word
    fun removingExceptionsWord(word: String, exclusionsTexts: String): String{

        var wordWithoutException: String = word
        val exceptions = exclusionsTexts

        exceptions.forEach { wordWithoutException = wordWithoutException.replace(it.toString(), "")}

        return wordWithoutException
    }
}