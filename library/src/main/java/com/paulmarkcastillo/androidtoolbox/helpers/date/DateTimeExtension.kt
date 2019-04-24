package com.paulmarkcastillo.androidtoolbox.helpers.date

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun Date.convertToUtcDateString(
    defaultDateFormat: String = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'S'Z'"
): String {
    val dateFormat = SimpleDateFormat(
        defaultDateFormat,
        Locale.getDefault()
    )
    dateFormat.timeZone = TimeZone.getTimeZone("UTC")
    return dateFormat.format(this)
}

fun Date.convertToDateString(
    defaultDateFormat: String = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'S'Z'"
): String {
    val dateFormat = SimpleDateFormat(
        defaultDateFormat,
        Locale.getDefault()
    )
    return dateFormat.format(this)
}

fun Date.convertUtcToLocalTimeZone(
    defaultDateFormat: String = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'S'Z'",
    toTimeZone: TimeZone = TimeZone.getDefault()
): Date {
    val dateFormat = SimpleDateFormat(
        defaultDateFormat,
        Locale.getDefault()
    )
    dateFormat.timeZone = TimeZone.getTimeZone("UTC")
    val date = dateFormat.parse(this.convertToDateString())
    dateFormat.timeZone = toTimeZone
    return dateFormat.format(date).convertToDate()
}

fun Date.convertToUtcDateTime(
    defaultDateFormat: String = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'S'Z'",
    fromTimeZone: TimeZone = TimeZone.getDefault()
): Date {
    val dateFormat = SimpleDateFormat(
        defaultDateFormat,
        Locale.getDefault()
    )
    dateFormat.timeZone = fromTimeZone
    val date = dateFormat.parse(this.convertToDateString())
    dateFormat.timeZone = TimeZone.getTimeZone("UTC")
    return dateFormat.format(date).convertToDate()
}

fun Calendar.startOfTheDay(): Date {
    set(Calendar.HOUR_OF_DAY, 0)
    set(Calendar.MINUTE, 0)
    set(Calendar.SECOND, 0)
    return time
}

fun Calendar.endOfTheDay(): Date {
    set(Calendar.HOUR_OF_DAY, 23)
    set(Calendar.MINUTE, 59)
    set(Calendar.SECOND, 59)
    return time
}

fun Calendar.startOfTheYearDate(): Date {
    set(Calendar.MONTH, 0)
    set(Calendar.DAY_OF_MONTH, 1)
    set(Calendar.HOUR_OF_DAY, 0)
    set(Calendar.MINUTE, 0)
    set(Calendar.SECOND, 0)
    return time
}

fun String.convertToDate(format: String = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'S'Z'"): Date {
    var parsed = Date()
    try {
        val dateFormat = SimpleDateFormat(format, Locale.getDefault())
        dateFormat.timeZone = TimeZone.getDefault()
        parsed = dateFormat.parse(this)
    } catch (pe: ParseException) {
    }

    return parsed
}

fun String.convertToUtcDate(timeZone: TimeZone? = null): Date {
    var parsed = Date()
    try {
        val dateFormat = SimpleDateFormat(
            "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'S'Z'",
            Locale.getDefault()
        )
        dateFormat.timeZone = timeZone ?: TimeZone.getTimeZone("UTC")
        parsed = dateFormat.parse(this)
    } catch (pe: ParseException) {
    }

    return parsed
}