package com.paulmarkcastillo.pmctoolbox.converters

import com.paulmarkcastillo.pmctoolbox.validators.EmailValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {
    private val emailValidator = EmailValidator()

    @Test
    fun testValidationInvalidEmailNull() {
        assertFalse(emailValidator.isEmailValid(null))
    }

    @Test
    fun testValidationValidEmail() {
        assertTrue(emailValidator.isEmailValid("local@domain.tld"))
    }

    @Test
    fun testValidationValidEmailCapital() {
        assertTrue(emailValidator.isEmailValid("Local@domain.tld"))
    }

    // QA ==========================================================================================

    @Test
    fun testValidationInvalidEmailNoDomain() {
        assertFalse(emailValidator.isEmailValid("test"))
    }

    @Test
    fun testValidationInvalidEmailAtOnly() {
        assertFalse(emailValidator.isEmailValid("test@"))
    }

    @Test
    fun testValidationInvalidEmailDoubleAtNoTLD() {
        assertFalse(emailValidator.isEmailValid("test@test@"))
    }

    @Test
    fun testValidationInvalidEmailMissingDomain() {
        assertFalse(emailValidator.isEmailValid("test@.com"))
    }

    @Test
    fun testValidationInvalidEmailDoubleAt() {
        assertFalse(emailValidator.isEmailValid("test@test.com@"))
    }

    // Test Values from https://stackoverflow.com/questions/8204680/java-regex-email/13013056#13013056
    // VALID =======================================================================================
    @Test
    fun testValidationValidEmailStackoverflow01() {
        assertTrue(emailValidator.isEmailValid("john@example.commm"))
    }

    @Test
    fun testValidationValidEmailStackoverflow02() {
        assertTrue(emailValidator.isEmailValid("abc.xyz@gmail"))
    }

    @Test
    fun testValidationValidEmailStackoverflow03() {
        assertTrue(emailValidator.isEmailValid("email@email"))
    }

    @Test
    fun testValidationValidEmailStackoverflow04() {
        assertTrue(emailValidator.isEmailValid("65@45"))
    }

    // INVALID =====================================================================================

    @Test
    fun testValidationInvalidEmailStackoverflow01() {
        assertFalse(emailValidator.isEmailValid("me@example..com"))
    }

    @Test
    fun testValidationInvalidEmailStackoverflow02() {
        assertFalse(emailValidator.isEmailValid("..@email.com"))
    }

    // Test Values from Wikipedia: https://en.wikipedia.org/wiki/Email_address#Examples
    // VALID =======================================================================================

    @Test
    fun testValidationValidEmailWikipedia01() {
        assertTrue(emailValidator.isEmailValid("simple@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia02() {
        assertTrue(emailValidator.isEmailValid("very.common@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia03() {
        assertTrue(emailValidator.isEmailValid("disposable.style.email.with+symbol@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia04() {
        assertTrue(emailValidator.isEmailValid("other.email-with-hyphen@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia05() {
        assertTrue(emailValidator.isEmailValid("fully-qualified-domain@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia06() {
        assertTrue(emailValidator.isEmailValid("user.name+tag+sorting@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia07() {
        assertTrue(emailValidator.isEmailValid("user.name@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia08() {
        assertTrue(emailValidator.isEmailValid("x@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia09() {
        assertTrue(emailValidator.isEmailValid("\"very.(),:;<>[]\\\".VERY.\\\"very@\\\\ \\\"very\\\".unusual\"@strange.example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia10() {
        assertTrue(emailValidator.isEmailValid("example-indeed@strange-example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia11() {
        assertTrue(emailValidator.isEmailValid("#!\$%&'*+-/=?^_`{}|~@example.org"))
    }

    @Test
    fun testValidationValidEmailWikipedia12() {
        assertTrue(emailValidator.isEmailValid("\"()<>[]:,;@\\\\\\\"!#\$%&'-/=?^_`{}| ~.a\"@example.org"))
    }

    @Test
    fun testValidationValidEmailWikipedia13() {
        assertTrue(emailValidator.isEmailValid("example@s.example"))
    }

    @Test
    fun testValidationValidEmailWikipedia14() {
        assertTrue(emailValidator.isEmailValid("user@[2001:DB8::1]"))
    }

    @Test
    fun testValidationValidEmailWikipedia15() {
        assertTrue(emailValidator.isEmailValid("\" \"@example.org"))
    }

    // INVALID =====================================================================================

    @Test
    fun testValidationInvalidEmailWikipedia01() {
        assertFalse(emailValidator.isEmailValid("Abc.example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia02() {
        assertFalse(emailValidator.isEmailValid("A@b@c@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia03() {
        assertFalse(emailValidator.isEmailValid("a\"b(c)d,e:f;g<h>i[j\\k]l@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia04() {
        assertFalse(emailValidator.isEmailValid("just\"not\"right@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia05() {
        assertFalse(emailValidator.isEmailValid("this is\"not\\allowed@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia06() {
        assertFalse(emailValidator.isEmailValid("this\\ still\\\"not\\\\allowed@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia07() {
        val email = "1234567890123456789012345678901234567890123456789012345678901234+x@example.com"
        assertFalse(emailValidator.isEmailValid(email))
    }

    @Test
    fun testValidationInvalidEmailWikipedia08() {
        assertFalse(emailValidator.isEmailValid("john..doe@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia09() {
        assertFalse(emailValidator.isEmailValid("john.doe@example..com"))
    }
}