package toolbox.paulmarkcastillo.com.pmctoolbox.validators

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class MemberIdValidatorTest {
    private val memberIdValidator = MemberIdValidator()

    @Test
    fun testMemberIdIsNull() {
        assertFalse(memberIdValidator.isValidMemberId(null))
    }

    @Test
    fun testMemberIdWhiteSpaceOnly() {
        assertFalse(memberIdValidator.isValidMemberId(" "))
    }

    @Test
    fun testMemberIdLettersOnly() {
        assertFalse(memberIdValidator.isValidMemberId("abc"))
    }

    @Test
    fun testMemberIdNumbersOnly() {
        assertFalse(memberIdValidator.isValidMemberId("123"))
    }

    @Test
    fun testMemberIdSymbolsOnly() {
        assertFalse(memberIdValidator.isValidMemberId("!@#$%"))
    }

    @Test
    fun testMemberIdStartsWithNumber() {
        assertFalse(memberIdValidator.isValidMemberId("123abc"))
    }

    @Test
    fun testMemberIdEndsWithThreeDigits() {
        assertFalse(memberIdValidator.isValidMemberId("abc123"))
    }

    @Test
    fun testMemberIdEndsWithFiveDigits() {
        assertFalse(memberIdValidator.isValidMemberId("abc12345"))
    }

    @Test
    fun testMemberIdContainsSymbols() {
        assertFalse(memberIdValidator.isValidMemberId("ab.c1234"))
    }

    @Test
    fun testMemberIdValid() {
        assertTrue(memberIdValidator.isValidMemberId("jdoe7777"))
    }
}