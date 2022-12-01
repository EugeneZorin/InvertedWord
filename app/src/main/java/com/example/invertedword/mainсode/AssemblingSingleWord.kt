package com.example.invertedword.mainсode

// Collects a single word from an array
class AssemblingSingleWord {

    var world: String = ""

    fun assemblingSingleWord() {
        for(letter in dataStore.finalValue){
            world += letter
        }
    }


}