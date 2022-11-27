package com.example.invertedword

class CollectionWord {

    private val mainActivity = MainActivity()

    // Collects the inverted word
     fun wordTurn(){
        var listSize = mainActivity.listRevers.size
        var check = true

        while (check) {
            if (listSize >= 0) {
                listSize--

                if (listSize > -1) {
                    for ((a, b) in mainActivity.exclusionsValues) {
                        if (a == mainActivity.finalValue.size) {
                            mainActivity.finalValue.add(b)
                            break
                        }
                    }
                    mainActivity.finalValue.add(mainActivity.listRevers[listSize])
                }
            } else { check = false}
        }
    }
}