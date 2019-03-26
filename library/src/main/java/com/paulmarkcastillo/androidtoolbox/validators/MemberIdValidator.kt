package com.paulmarkcastillo.androidtoolbox.validators

import java.util.regex.Pattern

class MemberIdValidator : BaseValidator() {

    // This regex check for valid Member ID that has no symbols and must start with at least 1 letter and must end with 4 numbers
    private val MEMBER_ID_PATTERN = Pattern.compile("^[a-zA-Z]+\\d{4}\$")

    fun isMemberIdValid(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return MEMBER_ID_PATTERN.matcher(string).matches()
    }
}
