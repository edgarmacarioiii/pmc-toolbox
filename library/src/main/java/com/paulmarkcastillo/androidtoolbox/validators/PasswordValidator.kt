package com.paulmarkcastillo.androidtoolbox.validators

class PasswordValidator : BaseValidator() {

    fun isPasswordValid(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return isPasswordMeetsMinimumLength(string) &&
                isPasswordHasAtleastOneNumber(string) &&
                isPasswordHasNoSpaces(string)
    }

    fun isPasswordMeetsMinimumLength(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return validateTor.isAtleastLength(string, 8)
    }

    fun isPasswordHasAtleastOneNumber(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return validateTor.hasAtleastOneDigit(string)
    }

    fun isPasswordHasNoSpaces(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return !validateTor.containsSubstring(string, " ")
    }
}