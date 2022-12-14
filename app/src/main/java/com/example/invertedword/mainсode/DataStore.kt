package com.example.invertedword.mainсode

class DataStore {

    val exclusionsValues = HashMap<Int, Char>()
    val mapRevers = HashMap<Int, String>()

    // clears arrays so text doesn't overlap
    fun clearArray(){
        exclusionsValues.clear()
        mapRevers.clear()

    }
}