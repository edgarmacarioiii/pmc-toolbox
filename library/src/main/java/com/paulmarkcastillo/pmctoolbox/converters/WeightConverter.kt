package com.paulmarkcastillo.pmctoolbox.converters

class WeightConverter : BaseConverter() {

    fun convertLbToKg(lb: Double): Double {
        return lb * 0.45359237
    }

}