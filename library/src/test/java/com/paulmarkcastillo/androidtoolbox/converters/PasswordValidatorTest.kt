package com.paulmarkcastillo.androidtoolbox.converters

import com.paulmarkcastillo.androidtoolbox.validators.PasswordValidator
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class PasswordValidatorTest {

    private val passwordValidator = PasswordValidator()

    @Test
    fun testPasswordIsNull() {
        assertFalse(passwordValidator.isPasswordMeetsMinimumLength(null))
    }

    @Test
    fun testPasswordIsEmpty() {
        assertFalse(passwordValidator.isPasswordMeetsMinimumLength(""))
    }

    @Test
    fun testPasswordDoesNotMeetMinimum() {
        assertFalse(passwordValidator.isPasswordMeetsMinimumLength("qwer123"))
    }

    @Test
    fun testPasswordNoNumber() {
        assertFalse(passwordValidator.isPasswordHasAtleastOneNumber("qwerasdf"))
    }

    @Test
    fun testPasswordContainsSpaces() {
        assertFalse(passwordValidator.isPasswordHasNoSpaces("qwer asdf"))
    }

    @Test
    fun testPasswordInvalid() {
        assertFalse(passwordValidator.isPasswordValid("1234qwe r"))
    }

    @Test
    fun testPasswordValid() {
        assertTrue(passwordValidator.isPasswordValid("1234qwer"))
    }

    @Test
    fun testPasswordValidMeetMinimum() {
        assertTrue(passwordValidator.isPasswordMeetsMinimumLength("qwer1234"))
    }

    @Test
    fun testPasswordValidSpecialCharacters() {
        assertTrue(passwordValidator.isPasswordMeetsMinimumLength("!@#$%^&8"))
    }
}