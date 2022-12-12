package com.example.invertedword.mainсode

import com.example.invertedword.screens.exclusionsTexts

val dataStore = DataStore()

class WordArray{

    private val wordTurn = WordTurn()
    private var indentationCheck = false

    // This is the main function where other functions are called.
    // write word in hashmap
    fun wordArray(word: String): String {

        searchExceptionNumber(word)

        var purifiedWord: String = removingExceptionsWord(word)

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
    fun searchExceptionNumber(word: String){

        var keyExclusionsValues: Int = 0

         for(index in word){
             for (char in exclusionsTexts){
                 if (index == char){
                     dataStore.exclusionsValues.put(keyExclusionsValues, char)
                 }
             }
             keyExclusionsValues++
         }
    }

    // Removing an exception from a word
    // Doesn't work as it should
    fun removingExceptionsWord(word: String): String{

        var wordWithoutException: String = ""

        exclusionsTexts.forEach { wordWithoutException = word.replace(it.toString(), "")}

        return wordWithoutException
    }

}