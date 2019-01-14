package com.paulmarkcastillo.pmctoolbox.validators

import java.util.regex.Pattern

class MemberIdValidator {

    // This regex check for valid Member ID that has no symbols and must start with at least 1 letter and must end with 4 numbers
    private val MEMBER_ID_PATTERN = Pattern.compile("^[a-zA-Z]+\\d{4}\$")

    fun isValidMemberId(member_id: String?): Boolean {
        return !member_id?.trim().isNullOrEmpty() && MEMBER_ID_PATTERN.matcher(member_id).matches()
    }
}
