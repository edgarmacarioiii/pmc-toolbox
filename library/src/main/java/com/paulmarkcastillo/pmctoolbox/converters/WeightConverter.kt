package com.paulmarkcastillo.pmctoolbox.converters

import kotlin.math.roundToInt

class WeightConverter : BaseConverter() {

    fun convertLbToKg(lb: Double): Double {
        return lb * 0.45359237
    }

    fun convertKgToLb(kg: Double): String {
        return decimalFormat.format((kg * 2.20462).roundToInt())
    }
}