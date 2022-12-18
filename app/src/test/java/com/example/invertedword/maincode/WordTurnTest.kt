package com.example.invertedword.maincode

import com.example.invertedword.mainсode.WordTurn
import com.example.invertedword.mainсode.dataStore
import org.junit.Assert
import org.junit.Test


class WordTurnTest {

    @Test
    fun `checking WordTurn() for correct operation with one element`(){

        // arrange
        val dataStore = dataStore
        val wordTurn = WordTurn()

        // act
        dataStore.mapRevers[0] = "thns"
        dependenciesWordTurn("thanks", "ak")
        wordTurn.wordTurn()

        // assert
        Assert.assertEquals("snahkt", wordTurn.wordTurn())

    }

    @Test
    fun `checking WordTurn() for correct operation with several elements`(){

        // arrange
        val dataStore = dataStore
        val wordTurn = WordTurn()

        // act
        dataStore.mapRevers[0] = "ho"
        dataStore.mapRevers[1] = " vryon"
        dependenciesWordTurn("hello everyone", "el")

        // assert
        Assert.assertEquals("oellh eneoyrve ", wordTurn.wordTurn())
    }

    private fun dependenciesWordTurn(word: String,exclusionsTexts: String){
        var keyExclusionsValues: Int = 0

        for(index in word) {
            for (char in exclusionsTexts) {
                if (index == char) {
                    dataStore.exclusionsValues[keyExclusionsValues] = char
                }
            }
            keyExclusionsValues++
        }
    }





}