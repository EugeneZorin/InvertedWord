package com.example.invertedword.mainсode

class DataStore {
    val listExclusions = ArrayList<Char>()
    val exclusionsValues = HashMap<Int, Char>()
    val listRevers = ArrayList<Char>()
    val finalValue = ArrayList<Char>()
    val spaceText = ArrayList<Int>()

    fun clearArray(){
        listExclusions.clear()
        exclusionsValues.clear()
        listRevers.clear()
        finalValue.clear()
        spaceText.clear()
    }
}