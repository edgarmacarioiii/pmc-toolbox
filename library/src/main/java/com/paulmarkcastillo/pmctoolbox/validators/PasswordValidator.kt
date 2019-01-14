package com.paulmarkcastillo.pmctoolbox.validators

import java.util.regex.Pattern

class PasswordValidator {

    // This regex check for valid Password must at least contains 1 number
    private val PASSWORD_ATLEAST_ONE_NUMBER_PATTERN = Pattern.compile("^(?=.*\\d).*\$")

    // This regex check for valid Password must not contain spaces
    private val PASSWORD_NO_PACES_PATTERN = Pattern.compile("^\\S*\$")

    fun passwordMeetsMinimumLength(password: String?): Boolean {
        return !password.isNullOrEmpty() && password.length >= 8
    }

    fun passwordHasAtleastOneNumber(password: String): Boolean {
        return PASSWORD_ATLEAST_ONE_NUMBER_PATTERN.matcher(password).matches()
    }

    fun passwordHasNoSpaces(password: String): Boolean {
        return PASSWORD_NO_PACES_PATTERN.matcher(password).matches()
    }

    fun isValidPassword(password: String): Boolean {
        return passwordMeetsMinimumLength(password) &&
                passwordHasAtleastOneNumber(password) &&
                passwordHasNoSpaces(password)
    }
}