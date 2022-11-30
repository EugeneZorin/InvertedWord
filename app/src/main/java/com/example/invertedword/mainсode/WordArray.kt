package com.example.invertedword.mainсode

import com.example.invertedword.screens.exclusionsTexts

val dataStore = DataStore()

class WordArray{

    private val wordTurn = WordTurn()

    // This function will convert the entered value into an array
    fun wordArray(word: String): String {

        // Загрузка исключения в массив
        for (char in exclusionsTexts){
            dataStore.listExclusions.add(char)
        }

        // Загрузка слова в массив
        for (char in word){
            dataStore.listRevers.add(char)
        }

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
            }

        }

        return dataStore.finalValue.toString()
    }
}