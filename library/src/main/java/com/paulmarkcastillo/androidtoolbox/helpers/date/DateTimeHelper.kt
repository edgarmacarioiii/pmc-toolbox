package com.paulmarkcastillo.androidtoolbox.helpers.date

import java.util.Calendar
import java.util.TimeZone

class DateTimeHelper {
    private val timeZoneUtc = TimeZone.getTimeZone("UTC")
    private val calendarUtc = Calendar.getInstance(timeZoneUtc)
    private val calendarDefault = Calendar.getInstance()

    val currentHourUtc: Int
        get() = getCurrentDateTimeUtc().get(Calendar.HOUR_OF_DAY)
    val currentMinuteUtc: Int
        get() = getCurrentDateTimeUtc().get(Calendar.MINUTE)
    val currentSecondUtc: Int
        get() = getCurrentDateTimeUtc().get(Calendar.SECOND)
    val currentDateDayOfYearUtc: Int
        get() = getCurrentDateTimeUtc().get(Calendar.DAY_OF_YEAR)

    val currentHour: Int
        get() = getCurrentDateTime().get(Calendar.HOUR_OF_DAY)
    val currentMinute: Int
        get() = getCurrentDateTime().get(Calendar.MINUTE)
    val currentSecond: Int
        get() = getCurrentDateTime().get(Calendar.SECOND)
    val currentDateDayOfYear: Int
        get() = getCurrentDateTime().get(Calendar.DAY_OF_YEAR)

    fun getCurrentDateTimeUtc(): Calendar {
        calendarUtc.timeInMillis = System.currentTimeMillis()
        return calendarUtc
    }

    fun getCurrentDateTimeUtcString(): String {
        return getCurrentDateTimeUtc().time.convertToUtcDateString()
    }

    fun getStartDayDateTimeUtcString(): String {
        return getCurrentDateTimeUtc().time.convertToUtcDateString()
    }

    fun getCurrentDateTime(): Calendar {
        calendarDefault.timeInMillis = System.currentTimeMillis()
        return calendarDefault
    }

    fun getCurrentDateTimeString(): String {
        return getCurrentDateTime().time.convertToDateString()
    }

    fun getStartOfTheYearDateTimeString(): String {
        return getCurrentDateTime().startOfTheYearDate().convertToDateString()
    }
}