package com.paulmarkcastillo.pmctoolbox.converters

import org.junit.Assert.assertEquals
import org.junit.Test

class LengthConverterTest {

    val lengthConverter = LengthConverter()

    @Test
    fun testConvertInchToFtString() {
        assertEquals("5'6\"", lengthConverter.convertInchToFtString(66.0))
    }
}