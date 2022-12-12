package com.example.invertedword.mainсode

class DataStore {

    val exclusionsValues = HashMap<Int, Char>()
    val mapRevers = HashMap<Int, String>()
    val finalValue = ArrayList<Char>()

    fun clearArray(){
        exclusionsValues.clear()
        finalValue.clear()

    }


}