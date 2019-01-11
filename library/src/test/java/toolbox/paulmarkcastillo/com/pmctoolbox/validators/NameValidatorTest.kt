package toolbox.paulmarkcastillo.com.pmctoolbox.validators

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class NameValidatorTest {

    private val nameValidator = NameValidator()

    @Test
    fun testNameIsNull() {
        assertFalse(nameValidator.isValidName(null))
    }

    @Test
    fun testNameWhitespaceOnly() {
        assertFalse(nameValidator.isValidName(" "))
    }

    @Test
    fun testNameValid() {
        assertTrue(nameValidator.isValidName("John Doe"))
    }

    @Test
    fun testNameValidOneLetterOnly() {
        assertTrue(nameValidator.isValidName("J"))
    }

    @Test
    fun testNameValidOneDigitOnly() {
        assertTrue(nameValidator.isValidName("1"))
    }

    @Test
    fun testNameValidLong() {
        assertTrue(
            nameValidator.isValidName(
                "Barnaby Marmaduke Aloysius Benjy Cobweb Dartagnan " +
                        "Egbert Felix Gaspar Humbert Ignatius Jayden Kasper Leroy Maximilian Neddy Obiajulu Pepin Quilliam " +
                        "Rosencrantz Sexton Teddy Upwood Vivatma Wayland Xylon Yardley Zachary Usansky"
            )
        )
    }

    @Test
    fun testNameValidBackTick() {
        assertTrue(nameValidator.isValidName("`"))
    }

    @Test
    fun testNameValidEmoji() {
        assertTrue(nameValidator.isValidName("\uD83D\uDE00"))
    }

    @Test
    fun testNameValidKaizen() {
        assertTrue(nameValidator.isValidName("改善"))
    }
}