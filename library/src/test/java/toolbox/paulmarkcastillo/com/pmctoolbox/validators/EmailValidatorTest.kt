package toolbox.paulmarkcastillo.com.pmctoolbox.validators

import com.paulmarkcastillo.pmctoolbox.validators.EmailValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {
    private val emailValidator = EmailValidator()

    @Test
    fun testValidationValidEmail() {
        assertTrue(emailValidator.isValidEmail("local@domain.tld"))
    }

    @Test
    fun testValidationValidEmailCapital() {
        assertTrue(emailValidator.isValidEmail("Local@domain.tld"))
    }

    // QA ==========================================================================================

    @Test
    fun testValidationInvalidEmailNoDomain() {
        assertFalse(emailValidator.isValidEmail("test"))
    }

    @Test
    fun testValidationInvalidEmailAtOnly() {
        assertFalse(emailValidator.isValidEmail("test@"))
    }

    @Test
    fun testValidationInvalidEmailDoubleAtNoTLD() {
        assertFalse(emailValidator.isValidEmail("test@test@"))
    }

    @Test
    fun testValidationInvalidEmailMissingDomain() {
        assertFalse(emailValidator.isValidEmail("test@.com"))
    }

    @Test
    fun testValidationInvalidEmailDoubleAt() {
        assertFalse(emailValidator.isValidEmail("test@test.com@"))
    }

    // Test Values from https://stackoverflow.com/questions/8204680/java-regex-email/13013056#13013056
    // VALID =======================================================================================
    @Test
    fun testValidationValidEmailStackoverflow01() {
        assertTrue(emailValidator.isValidEmail("john@example.commm"))
    }

    @Test
    fun testValidationValidEmailStackoverflow02() {
        assertTrue(emailValidator.isValidEmail("abc.xyz@gmail"))
    }

    @Test
    fun testValidationValidEmailStackoverflow03() {
        assertTrue(emailValidator.isValidEmail("email@email"))
    }

    @Test
    fun testValidationValidEmailStackoverflow04() {
        assertTrue(emailValidator.isValidEmail("65@45"))
    }

    // INVALID =====================================================================================

    @Test
    fun testValidationInvalidEmailStackoverflow01() {
        assertFalse(emailValidator.isValidEmail("me@example..com"))
    }

    @Test
    fun testValidationInvalidEmailStackoverflow02() {
        assertFalse(emailValidator.isValidEmail("..@email.com"))
    }

    // Test Values from Wikipedia: https://en.wikipedia.org/wiki/Email_address#Examples
    // VALID =======================================================================================

    @Test
    fun testValidationValidEmailWikipedia01() {
        assertTrue(emailValidator.isValidEmail("simple@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia02() {
        assertTrue(emailValidator.isValidEmail("very.common@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia03() {
        assertTrue(emailValidator.isValidEmail("disposable.style.email.with+symbol@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia04() {
        assertTrue(emailValidator.isValidEmail("other.email-with-hyphen@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia05() {
        assertTrue(emailValidator.isValidEmail("fully-qualified-domain@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia06() {
        assertTrue(emailValidator.isValidEmail("user.name+tag+sorting@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia07() {
        assertTrue(emailValidator.isValidEmail("user.name@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia08() {
        assertTrue(emailValidator.isValidEmail("x@example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia09() {
        assertTrue(emailValidator.isValidEmail("\"very.(),:;<>[]\\\".VERY.\\\"very@\\\\ \\\"very\\\".unusual\"@strange.example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia10() {
        assertTrue(emailValidator.isValidEmail("example-indeed@strange-example.com"))
    }

    @Test
    fun testValidationValidEmailWikipedia11() {
        assertTrue(emailValidator.isValidEmail("#!\$%&'*+-/=?^_`{}|~@example.org"))
    }

    @Test
    fun testValidationValidEmailWikipedia12() {
        assertTrue(emailValidator.isValidEmail("\"()<>[]:,;@\\\\\\\"!#\$%&'-/=?^_`{}| ~.a\"@example.org"))
    }

    @Test
    fun testValidationValidEmailWikipedia13() {
        assertTrue(emailValidator.isValidEmail("example@s.example"))
    }

    @Test
    fun testValidationValidEmailWikipedia14() {
        assertTrue(emailValidator.isValidEmail("user@[2001:DB8::1]"))
    }

    @Test
    fun testValidationValidEmailWikipedia15() {
        assertTrue(emailValidator.isValidEmail("\" \"@example.org"))
    }

    // INVALID =====================================================================================

    @Test
    fun testValidationInvalidEmailWikipedia01() {
        assertFalse(emailValidator.isValidEmail("Abc.example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia02() {
        assertFalse(emailValidator.isValidEmail("A@b@c@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia03() {
        assertFalse(emailValidator.isValidEmail("a\"b(c)d,e:f;g<h>i[j\\k]l@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia04() {
        assertFalse(emailValidator.isValidEmail("just\"not\"right@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia05() {
        assertFalse(emailValidator.isValidEmail("this is\"not\\allowed@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia06() {
        assertFalse(emailValidator.isValidEmail("this\\ still\\\"not\\\\allowed@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia07() {
        val email = "1234567890123456789012345678901234567890123456789012345678901234+x@example.com"
        assertFalse(emailValidator.isValidEmail(email))
    }

    @Test
    fun testValidationInvalidEmailWikipedia08() {
        assertFalse(emailValidator.isValidEmail("john..doe@example.com"))
    }

    @Test
    fun testValidationInvalidEmailWikipedia09() {
        assertFalse(emailValidator.isValidEmail("john.doe@example..com"))
    }
}