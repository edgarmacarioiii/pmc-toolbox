package com.paulmarkcastillo.androidtoolbox.helpers.date

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.util.*

class DateTimeHelperTest {

    @Test
    fun shouldConvertDateTimeToUtcFromTimeZoneGmtPlusEight() {
        val localDateTime = "2019-01-01T08:00:00.000Z".convertToDate()
        val utcDateTime = "2019-01-01T00:00:00.000Z".convertToDate()
        assertEquals(
            utcDateTime,
            localDateTime.convertToUtcDateTime(fromTimeZone = TimeZone.getTimeZone("GMT+8"))
        )
    }

    @Test
    fun shouldConvertDateTimeToUtcFromTimeZoneGmtMinusFour() {
        val localDateTime = "2018-12-31T20:00:00.000Z".convertToDate()
        val utcDateTime = "2019-01-01T00:00:00.000Z".convertToDate()
        assertEquals(
            utcDateTime,
            localDateTime.convertToUtcDateTime(fromTimeZone = TimeZone.getTimeZone("GMT-4"))
        )
    }

    @Test
    fun shouldConvertDateTimeToUtcFromTimeZoneUtc() {
        val localDateTime = "2019-01-01T00:00:00.000Z".convertToDate()
        val utcDateTime = "2019-01-01T00:00:00.000Z".convertToDate()
        assertEquals(
            utcDateTime,
            localDateTime.convertToUtcDateTime(fromTimeZone = TimeZone.getTimeZone("UTC"))
        )
    }

    @Test
    fun shouldConvertUtcToTimeZoneGmtPlusEight() {
        val utcDateTime = "2019-01-01T08:00:00.000Z".convertToDate()
        val localDateTime = "2019-01-01T16:00:00.000Z".convertToDate()
        assertEquals(
            localDateTime,
            utcDateTime.convertUtcToLocalTimeZone(toTimeZone = TimeZone.getTimeZone("GMT+8"))
        )
    }

    @Test
    fun shouldConvertUtcToTimeZoneGmtMinusEight() {
        val utcDateTime = "2019-01-01T08:00:00.000Z".convertToDate()
        val localDateTime = "2019-01-01T00:00:00.000Z".convertToDate()
        assertEquals(
            localDateTime,
            utcDateTime.convertUtcToLocalTimeZone(toTimeZone = TimeZone.getTimeZone("GMT-8"))
        )
    }
}