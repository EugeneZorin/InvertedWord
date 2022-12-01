package com.example.invertedword.mainсode

import com.example.invertedword.screens.exclusionsTexts

val dataStore = DataStore()
val assemblingSingleWord = AssemblingSingleWord()

class WordArray{

    private val wordTurn = WordTurn()

    // This function will convert the entered value into an array
    fun wordArray(word: String): String {

        // Clearing Arrays
        dataStore.clearArray()

        // Загрузка исключения в массив
        for (char in exclusionsTexts){
            dataStore.listExclusions.add(char)
        }

        // Загрузка слова в массив
        for (char in word){
            dataStore.listRevers.add(char)
        }

        arrayEqualityCheck(word)

        return assemblingSingleWord.world
    }

    fun removingExceptionsArray(){

        var listSize = dataStore.listRevers.size
        var check = true

        // Deletes and write exceptions
        while (check) {
            if ( listSize >= 0) {
                listSize--
                if (listSize != -1) {
                    for (exclusionElement in dataStore.listExclusions) {
                        if (exclusionElement == dataStore.listRevers[listSize]) {
                            dataStore.exclusionsValues[listSize] = dataStore.listRevers[listSize]
                            dataStore.listRevers.removeAt(listSize)
                        }
                    }
                }
            } else {
                check = false
                wordTurn.wordTurn()
                assemblingSingleWord.assemblingSingleWord()
            }

        }
    }

    // The function checks if the values in the listExclusions and listRevers.
    fun arrayEqualityCheck(word: String) {
        if (dataStore.listExclusions.equals(dataStore.listRevers)) {
            dataStore.finalValue.clear()
            for (char in word) {
                dataStore.finalValue.add(char)
            }
            assemblingSingleWord.assemblingSingleWord()
        } else { removingExceptionsArray() }
    }
}