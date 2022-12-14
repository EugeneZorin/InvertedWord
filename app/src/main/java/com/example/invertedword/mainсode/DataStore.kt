package com.example.invertedword.mainсode

class DataStore {

    val exclusionsValues = HashMap<Int, Char>()
    val mapRevers = HashMap<Int, String>()

    // In theory needed for cleaning when reused
    // does not work
    fun clearArray(){
        exclusionsValues.clear()
        mapRevers.clear()

    }
}