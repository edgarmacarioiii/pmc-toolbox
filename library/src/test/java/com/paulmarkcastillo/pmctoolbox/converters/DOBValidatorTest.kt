package com.paulmarkcastillo.pmctoolbox.converters

import com.paulmarkcastillo.pmctoolbox.validators.DOBValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DOBValidatorTest {

    private val dobValidator = DOBValidator(13)

    // INVALID =======================================================================================

    @Test
    fun testDateIsNull() {
        assertFalse(dobValidator.isDateValid(null))
    }

    @Test
    fun estDayIsInvalid() {
        assertFalse(dobValidator.isDateValid("1/32/2018"))
    }

    @Test
    fun testMonthIsInvalid() {
        assertFalse(dobValidator.isDateValid("13/18/2018"))
    }

    @Test
    fun testYearIsInvalid() {
        assertFalse(dobValidator.isDateValid("31/20/99999999"))
    }

    @Test
    fun testDateFormatIsInvalid() {
        assertFalse(dobValidator.isDateValid("2018/11/10"))
    }

    @Test
    fun testDateIsInvalidLeapYear() {
        assertFalse(dobValidator.isDateValid("02/29/2018"))
    }

    @Test
    fun testBirthDateIsInValidUnderAge() {
        assertFalse(dobValidator.isAgeValid("01/01/2019"))
    }

    // VALID =======================================================================================

    @Test
    fun testDateIsValidLeapYear() {
        assertTrue(dobValidator.isDateValid("02/29/2020"))
    }

    @Test
    fun testDateIsValidWithoutZero() {
        assertTrue(dobValidator.isDateValid("1/1/2018"))
    }

    @Test
    fun testDateIsValid() {
        assertTrue(dobValidator.isDateValid("12/25/2018"))
    }

    @Test
    fun testBirthDateIsValid() {
        assertTrue(dobValidator.isAgeValid("01/31/2000"))
    }
}