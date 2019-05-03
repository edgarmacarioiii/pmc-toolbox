package com.paulmarkcastillo.androidtoolbox.converters

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.DecimalFormat

class LengthConverterTest {

    private val lengthConverter = LengthConverter()

    @Test
    fun testConvertInchToFtString() {
        assertEquals("4'0\"", lengthConverter.convertInchToFtString(48.0))
        assertEquals("4'1\"", lengthConverter.convertInchToFtString(49.0))
        assertEquals("4'2\"", lengthConverter.convertInchToFtString(50.0))
        assertEquals("4'3\"", lengthConverter.convertInchToFtString(51.0))
        assertEquals("4'4\"", lengthConverter.convertInchToFtString(52.0))
        assertEquals("4'5\"", lengthConverter.convertInchToFtString(53.0))
        assertEquals("4'6\"", lengthConverter.convertInchToFtString(54.0))
        assertEquals("4'7\"", lengthConverter.convertInchToFtString(55.0))
        assertEquals("4'8\"", lengthConverter.convertInchToFtString(56.0))
        assertEquals("4'9\"", lengthConverter.convertInchToFtString(57.0))
        assertEquals("4'10\"", lengthConverter.convertInchToFtString(58.0))
        assertEquals("4'11\"", lengthConverter.convertInchToFtString(59.0))
        assertEquals("5'0\"", lengthConverter.convertInchToFtString(60.0))
        assertEquals("5'1\"", lengthConverter.convertInchToFtString(61.0))
        assertEquals("5'2\"", lengthConverter.convertInchToFtString(62.0))
        assertEquals("5'3\"", lengthConverter.convertInchToFtString(63.0))
        assertEquals("5'4\"", lengthConverter.convertInchToFtString(64.0))
        assertEquals("5'5\"", lengthConverter.convertInchToFtString(65.0))
        assertEquals("5'6\"", lengthConverter.convertInchToFtString(66.0))
        assertEquals("5'7\"", lengthConverter.convertInchToFtString(67.0))
        assertEquals("5'8\"", lengthConverter.convertInchToFtString(68.0))
        assertEquals("5'9\"", lengthConverter.convertInchToFtString(69.0))
        assertEquals("5'10\"", lengthConverter.convertInchToFtString(70.0))
        assertEquals("5'11\"", lengthConverter.convertInchToFtString(71.0))
        assertEquals("6'0\"", lengthConverter.convertInchToFtString(72.0))
        assertEquals("6'1\"", lengthConverter.convertInchToFtString(73.0))
        assertEquals("6'2\"", lengthConverter.convertInchToFtString(74.0))
        assertEquals("6'3\"", lengthConverter.convertInchToFtString(75.0))
        assertEquals("6'4\"", lengthConverter.convertInchToFtString(76.0))
        assertEquals("6'5\"", lengthConverter.convertInchToFtString(77.0))
        assertEquals("6'6\"", lengthConverter.convertInchToFtString(78.0))
        assertEquals("6'7\"", lengthConverter.convertInchToFtString(79.0))
        assertEquals("6'8\"", lengthConverter.convertInchToFtString(80.0))
        assertEquals("6'9\"", lengthConverter.convertInchToFtString(81.0))
        assertEquals("6'10\"", lengthConverter.convertInchToFtString(82.0))
        assertEquals("6'11\"", lengthConverter.convertInchToFtString(83.0))
        assertEquals("7'0\"", lengthConverter.convertInchToFtString(84.0))
    }

    @Test
    fun testConvertInchToCm() {
        val decimalFormat = DecimalFormat("#.0")

        assertEquals("121.9", decimalFormat.format(lengthConverter.convertInchToCm(48.0)))
        assertEquals("124.5", decimalFormat.format(lengthConverter.convertInchToCm(49.0)))
        assertEquals("127.0", decimalFormat.format(lengthConverter.convertInchToCm(50.0)))
        assertEquals("129.5", decimalFormat.format(lengthConverter.convertInchToCm(51.0)))
        assertEquals("132.1", decimalFormat.format(lengthConverter.convertInchToCm(52.0))) // Round Off
        assertEquals("134.6", decimalFormat.format(lengthConverter.convertInchToCm(53.0)))
        assertEquals("137.2", decimalFormat.format(lengthConverter.convertInchToCm(54.0)))
        assertEquals("139.7", decimalFormat.format(lengthConverter.convertInchToCm(55.0)))
        assertEquals("142.2", decimalFormat.format(lengthConverter.convertInchToCm(56.0)))
        assertEquals("144.8", decimalFormat.format(lengthConverter.convertInchToCm(57.0)))
        assertEquals("147.3", decimalFormat.format(lengthConverter.convertInchToCm(58.0)))
        assertEquals("149.9", decimalFormat.format(lengthConverter.convertInchToCm(59.0)))
        assertEquals("152.4", decimalFormat.format(lengthConverter.convertInchToCm(60.0)))
        assertEquals("154.9", decimalFormat.format(lengthConverter.convertInchToCm(61.0)))
        assertEquals("157.5", decimalFormat.format(lengthConverter.convertInchToCm(62.0)))
        assertEquals("160.0", decimalFormat.format(lengthConverter.convertInchToCm(63.0)))
        assertEquals("162.6", decimalFormat.format(lengthConverter.convertInchToCm(64.0)))
        assertEquals("165.1", decimalFormat.format(lengthConverter.convertInchToCm(65.0)))
        assertEquals("167.6", decimalFormat.format(lengthConverter.convertInchToCm(66.0)))
        assertEquals("170.2", decimalFormat.format(lengthConverter.convertInchToCm(67.0)))
        assertEquals("172.7", decimalFormat.format(lengthConverter.convertInchToCm(68.0)))
        assertEquals("175.3", decimalFormat.format(lengthConverter.convertInchToCm(69.0)))
        assertEquals("177.8", decimalFormat.format(lengthConverter.convertInchToCm(70.0)))
        assertEquals("180.3", decimalFormat.format(lengthConverter.convertInchToCm(71.0)))
        assertEquals("182.9", decimalFormat.format(lengthConverter.convertInchToCm(72.0)))
        assertEquals("185.4", decimalFormat.format(lengthConverter.convertInchToCm(73.0)))
        assertEquals("188.0", decimalFormat.format(lengthConverter.convertInchToCm(74.0)))
        assertEquals("190.5", decimalFormat.format(lengthConverter.convertInchToCm(75.0)))
        assertEquals("193.0", decimalFormat.format(lengthConverter.convertInchToCm(76.0)))
        assertEquals("195.6", decimalFormat.format(lengthConverter.convertInchToCm(77.0)))
        assertEquals("198.1", decimalFormat.format(lengthConverter.convertInchToCm(78.0)))
        assertEquals("200.7", decimalFormat.format(lengthConverter.convertInchToCm(79.0)))
        assertEquals("203.2", decimalFormat.format(lengthConverter.convertInchToCm(80.0)))
        assertEquals("205.7", decimalFormat.format(lengthConverter.convertInchToCm(81.0)))
        assertEquals("208.3", decimalFormat.format(lengthConverter.convertInchToCm(82.0)))
        assertEquals("210.8", decimalFormat.format(lengthConverter.convertInchToCm(83.0)))
        assertEquals("213.4", decimalFormat.format(lengthConverter.convertInchToCm(84.0)))
    }

    @Test
    fun testConvertCmToInch() {
        val decimalFormat = DecimalFormat("#.0")

        assertEquals("48.0", decimalFormat.format(lengthConverter.convertCmToInch(121.9)))
        assertEquals("49.0", decimalFormat.format(lengthConverter.convertCmToInch(124.5)))
        assertEquals("50.0", decimalFormat.format(lengthConverter.convertCmToInch(127.0)))
        assertEquals("51.0", decimalFormat.format(lengthConverter.convertCmToInch(129.5)))
        assertEquals("52.0", decimalFormat.format(lengthConverter.convertCmToInch(132.1)))
        assertEquals("53.0", decimalFormat.format(lengthConverter.convertCmToInch(134.6)))
        assertEquals("54.0", decimalFormat.format(lengthConverter.convertCmToInch(137.2)))
        assertEquals("55.0", decimalFormat.format(lengthConverter.convertCmToInch(139.7)))
        assertEquals("56.0", decimalFormat.format(lengthConverter.convertCmToInch(142.2)))
        assertEquals("57.0", decimalFormat.format(lengthConverter.convertCmToInch(144.8)))
        assertEquals("58.0", decimalFormat.format(lengthConverter.convertCmToInch(147.3)))
        assertEquals("59.0", decimalFormat.format(lengthConverter.convertCmToInch(149.9)))
        assertEquals("60.0", decimalFormat.format(lengthConverter.convertCmToInch(152.4)))
        assertEquals("61.0", decimalFormat.format(lengthConverter.convertCmToInch(154.9)))
        assertEquals("62.0", decimalFormat.format(lengthConverter.convertCmToInch(157.5)))
        assertEquals("63.0", decimalFormat.format(lengthConverter.convertCmToInch(160.0)))
        assertEquals("64.0", decimalFormat.format(lengthConverter.convertCmToInch(162.6)))
        assertEquals("65.0", decimalFormat.format(lengthConverter.convertCmToInch(165.1)))
        assertEquals("66.0", decimalFormat.format(lengthConverter.convertCmToInch(167.6)))
        assertEquals("67.0", decimalFormat.format(lengthConverter.convertCmToInch(170.2)))
        assertEquals("68.0", decimalFormat.format(lengthConverter.convertCmToInch(172.7)))
        assertEquals("69.0", decimalFormat.format(lengthConverter.convertCmToInch(175.3)))
        assertEquals("70.0", decimalFormat.format(lengthConverter.convertCmToInch(177.8)))
        assertEquals("71.0", decimalFormat.format(lengthConverter.convertCmToInch(180.3)))
        assertEquals("72.0", decimalFormat.format(lengthConverter.convertCmToInch(182.9)))
        assertEquals("73.0", decimalFormat.format(lengthConverter.convertCmToInch(185.4)))
        assertEquals("74.0", decimalFormat.format(lengthConverter.convertCmToInch(188.0)))
        assertEquals("75.0", decimalFormat.format(lengthConverter.convertCmToInch(190.5)))
        assertEquals("76.0", decimalFormat.format(lengthConverter.convertCmToInch(193.0)))
        assertEquals("77.0", decimalFormat.format(lengthConverter.convertCmToInch(195.6)))
        assertEquals("78.0", decimalFormat.format(lengthConverter.convertCmToInch(198.1)))
        assertEquals("79.0", decimalFormat.format(lengthConverter.convertCmToInch(200.7)))
        assertEquals("80.0", decimalFormat.format(lengthConverter.convertCmToInch(203.2)))
        assertEquals("81.0", decimalFormat.format(lengthConverter.convertCmToInch(205.7)))
        assertEquals("82.0", decimalFormat.format(lengthConverter.convertCmToInch(208.3)))
        assertEquals("83.0", decimalFormat.format(lengthConverter.convertCmToInch(210.8)))
        assertEquals("84.0", decimalFormat.format(lengthConverter.convertCmToInch(213.4)))
    }

    @Test
    fun convertMilesToKm() {
        val decimalFormat = DecimalFormat("#.0")
        assertEquals("8.0", decimalFormat.format(lengthConverter.convertMilesToKm(5.0)))
        assertEquals("16.1", decimalFormat.format(lengthConverter.convertMilesToKm(10.0)))
        assertEquals("24.9", decimalFormat.format(lengthConverter.convertMilesToKm(15.5)))
    }

    @Test
    fun convertKmToMiles() {
        val decimalFormat = DecimalFormat("#.0")
        assertEquals("5.0", decimalFormat.format(lengthConverter.convertKmToMiles(8.0)))
        assertEquals("10.0", decimalFormat.format(lengthConverter.convertKmToMiles(16.1)))
        assertEquals("15.5", decimalFormat.format(lengthConverter.convertKmToMiles(24.9)))
    }
}