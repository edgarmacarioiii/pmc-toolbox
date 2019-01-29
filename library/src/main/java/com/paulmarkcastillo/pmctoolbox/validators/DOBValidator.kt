package com.paulmarkcastillo.pmctoolbox.validators

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

class DOBValidator(
    private val minimumAge: Int,
    private val maximumAge: Int
) : BaseValidator() {

    // This regex check for valid date with a format of MM/dd/yyyy
    private val DATE_PATTERN = Pattern
        .compile(
            "^(?:(?:(?:0?[13578]|1[02])(\\/)31)\\1" +
                    "|(?:(?:0?[1,3-9]|1[0-2])(\\/)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{1,4})\$" +
                    "|^(?:0?2(\\/)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])" +
                    "|(?:(?:16|[2468][048]|[3579][26])00))))\$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/)(?:0?[1-9]" +
                    "|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{1,4})\$"
        )

    fun isDateValid(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return DATE_PATTERN.matcher(string).matches()
    }

    fun isAgeValid(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return getAge(string) >= minimumAge
    }

    fun isAgeBelowOrEqualToMaximumAge(string: String?): Boolean {
        if (string.isNullOrBlank()) return false
        return getAge(string) <= maximumAge
    }

    fun getAge(string: String): Int {
        val parseStrDate = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())
        val formatDate = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        val birthDate = parseStrDate.parse(string)
        val currentDate = Calendar.getInstance().time
        val longBirthDate = (formatDate.format(birthDate)).toLong()
        val longCurrentDate = (formatDate.format(currentDate)).toLong()
        val age = (longCurrentDate - longBirthDate) / 10000
        return age.toInt()
    }
}