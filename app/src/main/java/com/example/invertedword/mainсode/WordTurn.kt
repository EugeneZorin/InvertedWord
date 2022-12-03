package com.example.invertedword.mainсode

class WordTurn {

    // Collects the inverted word
    fun wordTurn(){

        var listSize: Int = dataStore.listRevers.size
        var check = true

        while (check) {

            listSize--

            if (listSize > -1) {
                for ((a, b) in dataStore.exclusionsValues) {
                    if (a == dataStore.finalValue.size) {
                        dataStore.finalValue.add(b)
                    }
                }
                dataStore.finalValue.add(dataStore.listRevers[listSize])
            } else { check = false }
        }
    }


    // Не работает. альфа-бета версия (вообще не работает)
    fun turnWordSpace(){

        var oneWordLength: Int
        var check = true


        for (index in dataStore.spaceText){

            oneWordLength = index
            oneWordLength--

            while (check) {
                if (oneWordLength >= 0) {
                    oneWordLength--

                    if (oneWordLength > -1) {
                        for ((a, b) in dataStore.exclusionsValues) {
                            if (a == dataStore.finalValue.size) {
                                dataStore.finalValue.add(b)
                                break
                            }
                        }
                        dataStore.finalValue.add(dataStore.listRevers[oneWordLength])
                    }
                } else { check = false }
            }
        }
    }

}