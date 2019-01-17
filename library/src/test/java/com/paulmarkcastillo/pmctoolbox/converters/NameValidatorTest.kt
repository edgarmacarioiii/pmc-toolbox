package com.paulmarkcastillo.pmctoolbox.converters

import com.paulmarkcastillo.pmctoolbox.validators.NameValidator
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class NameValidatorTest {

    private val nameValidator = NameValidator()

    @Test
    fun testNameIsNull() {
        assertFalse(nameValidator.isNameValid(null))
    }

    @Test
    fun testNameWhitespaceOnly() {
        assertFalse(nameValidator.isNameValid(" "))
    }

    @Test
    fun testNameValid() {
        assertTrue(nameValidator.isNameValid("John Doe"))
    }

    @Test
    fun testNameValidOneLetterOnly() {
        assertTrue(nameValidator.isNameValid("J"))
    }

    @Test
    fun testNameValidOneDigitOnly() {
        assertTrue(nameValidator.isNameValid("1"))
    }

    @Test
    fun testNameValidLong() {
        assertTrue(
            nameValidator.isNameValid(
                "Barnaby Marmaduke Aloysius Benjy Cobweb Dartagnan " +
                        "Egbert Felix Gaspar Humbert Ignatius Jayden Kasper Leroy Maximilian Neddy Obiajulu Pepin Quilliam " +
                        "Rosencrantz Sexton Teddy Upwood Vivatma Wayland Xylon Yardley Zachary Usansky"
            )
        )
    }

    @Test
    fun testNameValidBackTick() {
        assertTrue(nameValidator.isNameValid("`"))
    }

    @Test
    fun testNameValidEmoji() {
        assertTrue(nameValidator.isNameValid("\uD83D\uDE00"))
    }

    @Test
    fun testNameValidKaizen() {
        assertTrue(nameValidator.isNameValid("改善"))
    }
}