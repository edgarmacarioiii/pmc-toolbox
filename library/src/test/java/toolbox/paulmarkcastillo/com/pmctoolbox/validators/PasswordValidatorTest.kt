package toolbox.paulmarkcastillo.com.pmctoolbox.validators

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class PasswordValidatorTest {

    private val passwordValidator = PasswordValidator()

    @Test
    fun testPasswordIsNull() {
        assertFalse(passwordValidator.passwordMeetsMinimumLength(null))
    }

    @Test
    fun testPasswordIsEmpty() {
        assertFalse(passwordValidator.passwordMeetsMinimumLength(""))
    }

    @Test
    fun testPasswordDoesNotMeetMinimum() {
        assertFalse(passwordValidator.passwordMeetsMinimumLength("qwer123"))
    }

    @Test
    fun testPasswordNoNumber() {
        assertFalse(passwordValidator.passwordHasAtleastOneNumber("qwerasdf"))
    }

    @Test
    fun testPasswordContainsSpaces() {
        assertFalse(passwordValidator.passwordHasNoSpaces("qwer asdf"))
    }

    @Test
    fun testPasswordInvalid() {
        assertFalse(passwordValidator.isValidPassword("1234qwe r"))
    }

    @Test
    fun testPasswordValid() {
        assertTrue(passwordValidator.isValidPassword("1234qwer"))
    }

    @Test
    fun testPasswordValidMeetMinimum() {
        assertTrue(passwordValidator.passwordMeetsMinimumLength("qwer1234"))
    }

    @Test
    fun testPasswordValidSpecialCharacters() {
        assertTrue(passwordValidator.passwordMeetsMinimumLength("!@#$%^&8"))
    }
}