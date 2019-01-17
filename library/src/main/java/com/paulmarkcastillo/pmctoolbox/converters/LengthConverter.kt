package com.paulmarkcastillo.pmctoolbox.converters

class LengthConverter : BaseConverter() {

    fun convertInchToFt(inch: Double): String {
        return decimalFormat.format(inch / 12)
    }

    fun convertInchToFtString(inch: Double): String {
        val feet: Int = (inch / 12).toInt()
        val remainingInches = (inch % 12).toInt()
        return feet.toString() + "'" + remainingInches + "\""
    }

    fun convertInchToCm(inch: Double): String {
        return decimalFormat.format(inch * 2.54)
    }

}