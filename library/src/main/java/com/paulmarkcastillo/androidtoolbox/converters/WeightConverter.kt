package com.paulmarkcastillo.androidtoolbox.converters

class WeightConverter : BaseConverter() {

    fun convertLbToKg(lb: Double): Double {
        return lb * 0.45359237
    }

    fun convertKgToLb(kg: Double): Double {
        return kg * 2.20462
    }
}