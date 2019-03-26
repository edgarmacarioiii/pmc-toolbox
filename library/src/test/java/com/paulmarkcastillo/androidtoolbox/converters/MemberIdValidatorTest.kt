package com.paulmarkcastillo.androidtoolbox.converters

import com.paulmarkcastillo.androidtoolbox.validators.MemberIdValidator
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class MemberIdValidatorTest {
    private val memberIdValidator = MemberIdValidator()

    @Test
    fun testMemberIdIsNull() {
        assertFalse(memberIdValidator.isMemberIdValid(null))
    }

    @Test
    fun testMemberIdWhiteSpaceOnly() {
        assertFalse(memberIdValidator.isMemberIdValid(" "))
    }

    @Test
    fun testMemberIdLettersOnly() {
        assertFalse(memberIdValidator.isMemberIdValid("abc"))
    }

    @Test
    fun testMemberIdNumbersOnly() {
        assertFalse(memberIdValidator.isMemberIdValid("123"))
    }

    @Test
    fun testMemberIdSymbolsOnly() {
        assertFalse(memberIdValidator.isMemberIdValid("!@#$%"))
    }

    @Test
    fun testMemberIdStartsWithNumber() {
        assertFalse(memberIdValidator.isMemberIdValid("123abc"))
    }

    @Test
    fun testMemberIdEndsWithThreeDigits() {
        assertFalse(memberIdValidator.isMemberIdValid("abc123"))
    }

    @Test
    fun testMemberIdEndsWithFiveDigits() {
        assertFalse(memberIdValidator.isMemberIdValid("abc12345"))
    }

    @Test
    fun testMemberIdContainsSymbols() {
        assertFalse(memberIdValidator.isMemberIdValid("ab.c1234"))
    }

    @Test
    fun testMemberIdValid() {
        assertTrue(memberIdValidator.isMemberIdValid("jdoe7777"))
    }
}