package com.paulmarkcastillo.pmctoolbox.validators

class NameValidator {
    fun isValidName(name: String?): Boolean {
        return !name?.trim().isNullOrEmpty()
    }
}