package toolbox.paulmarkcastillo.com.pmctoolbox.validators

import com.paulmarkcastillo.pmctoolbox.validators.DOBValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DOBValidatorTest {

    private val dobValidator = DOBValidator(13)

    // INVALID =======================================================================================

    @Test
    fun testDateIsNull() {
        assertFalse(dobValidator.isValidDate(null))
    }

    @Test
    fun estDayIsInvalid() {
        assertFalse(dobValidator.isValidDate("1/32/2018"))
    }

    @Test
    fun testMonthIsInvalid() {
        assertFalse(dobValidator.isValidDate("13/18/2018"))
    }

    @Test
    fun testYearIsInvalid() {
        assertFalse(dobValidator.isValidDate("31/20/99999999"))
    }

    @Test
    fun testDateFormatIsInvalid() {
        assertFalse(dobValidator.isValidDate("2018/11/10"))
    }

    @Test
    fun testDateIsInvalidLeapYear() {
        assertFalse(dobValidator.isValidDate("02/29/2018"))
    }

    @Test
    fun testBirthDateIsInValidUnderAge() {
        assertFalse(dobValidator.isValidAge("01/01/2019"))
    }

    // VALID =======================================================================================

    @Test
    fun testDateIsValidLeapYear() {
        assertTrue(dobValidator.isValidDate("02/29/2020"))
    }

    @Test
    fun testDateIsValidWithoutZero() {
        assertTrue(dobValidator.isValidDate("1/1/2018"))
    }

    @Test
    fun testDateIsValid() {
        assertTrue(dobValidator.isValidDate("12/25/2018"))
    }

    @Test
    fun testBirthDateIsValid() {
        assertTrue(dobValidator.isValidAge("01/31/2000"))
    }
}