package com.example.invertedword.mainсode

class WordTurn {

    // Collects the inverted word
    fun wordTurn(){
        var listSize = dataStore.listRevers.size
        var check = true

        while (check) {
            if (listSize >= 0) {
                listSize--

                if (listSize > -1) {
                    for ((a, b) in dataStore.exclusionsValues) {
                        if (a == dataStore.finalValue.size) {
                            dataStore.finalValue.add(b)
                            break
                        }
                    }
                    dataStore.finalValue.add(dataStore.listRevers[listSize])
                }
            } else { check = false }
        }
    }

}