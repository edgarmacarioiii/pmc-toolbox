package com.paulmarkcastillo.pmctoolbox.validators

class NameValidator : BaseValidator() {
    fun isNameValid(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return true
    }
}