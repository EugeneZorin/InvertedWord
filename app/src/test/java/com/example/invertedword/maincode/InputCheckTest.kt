package com.example.invertedword.maincode

import com.example.invertedword.mainсode.InputCheck
import org.junit.Assert
import org.junit.Test

class InputCheckTest {

    @Test
    fun `checking for the sameness of the main word and exception in InputCheck()`(){

        val inputCheck = InputCheck()

        val values = inputCheck.inputCheck("hello", "hello")
        val valuesTwo = inputCheck.inputCheck("hello", "thanks")

        Assert.assertEquals("hello", values)
        Assert.assertEquals("holle", valuesTwo)
    }

}