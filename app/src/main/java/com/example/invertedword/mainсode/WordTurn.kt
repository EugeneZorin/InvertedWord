package com.example.invertedword.mainсode

class WordTurn {

    // Inverts and collects a word
    fun wordTurn(): String{

        var numberWordsHashmap: Int = dataStore.mapRevers.size
        var elementKey: Int = 0
        var elementNumberCounter: Int = 0
        var wordTurn: String = ""
        var oneElementHashmap: String

        while (numberWordsHashmap > 0) {
            oneElementHashmap = dataStore.mapRevers.get(elementKey).toString()

            for(char in oneElementHashmap.reversed()){
                for((key, word) in dataStore.exclusionsValues){
                    if(elementNumberCounter == key){
                        wordTurn += word
                        elementNumberCounter++
                    }
                }
                elementNumberCounter++
                wordTurn += char
            }

            if (numberWordsHashmap > 1) {
                wordTurn += " "
                elementNumberCounter++
            }

            numberWordsHashmap--
            elementKey++
        }

        return wordTurn
    }

}