package com.example.invertedword.maincode

import com.example.invertedword.mainсode.WordArray
import com.example.invertedword.mainсode.dataStore
import com.example.invertedword.mainсode.wordArray
import org.junit.Assert.assertEquals
import org.junit.Test


class WordArrayTest {

    @Test
    fun `checks removingExceptionsWord() for correct removal of exceptions from a newline`(){

        // arrange
        val wordArray = WordArray()

        // act
        val resultOne = wordArray.removingExceptionsWord("thanks", "qwerty")
        val resultTwo = wordArray.removingExceptionsWord("cookies", "kitchen")
        val resultThree = wordArray.removingExceptionsWord("Hello to all", "el")

        // assert
        assertEquals("hanks", resultOne)
        assertEquals("oos", resultTwo)
        assertEquals("Ho to a", resultThree)
    }

    @Test
    fun `checking for the correctness of the search for exceptions searchExceptionNumber()`() {

        // arrange
        val searchExceptionNumber = wordArray

        // act
        searchExceptionNumber.searchExceptionNumber("hello", "el")

        // assert
        assertEquals('e', dataStore.exclusionsValues[1])
        assertEquals('l', dataStore.exclusionsValues[2])
        assertEquals('l', dataStore.exclusionsValues[3])

    }

    @Test
    fun `checking the correctness of the entry in the map of the WordArray() function of one element`(){

        // arrange
        val wordArray = wordArray

        // act and assert
        wordArray.wordArray("thanks", "ak")
        assertEquals("thns", dataStore.mapRevers[0])

        wordArray.wordArray("hello", "el")
        assertEquals("ho", dataStore.mapRevers[0])

        wordArray.wordArray("size", "i")
        assertEquals("sze", dataStore.mapRevers[0])
    }

    @Test
    fun `checking the correctness of the entry in the map of the WordArray() function of several elements`(){
        // arrange
        val wordArray = wordArray

        // act and assert
        wordArray.wordArray("thanks you", "aky")
        assertEquals("thns", dataStore.mapRevers[0])
        assertEquals(" ou", dataStore.mapRevers[1])

        wordArray.wordArray("Hello everyone ", "ely")
        assertEquals("Ho", dataStore.mapRevers[0])
        assertEquals(" vron", dataStore.mapRevers[1])

        wordArray.wordArray("set of values", "elo")
        assertEquals("st", dataStore.mapRevers[0])
        assertEquals(" f", dataStore.mapRevers[1])
        assertEquals(" vaus", dataStore.mapRevers[2])
    }

}