package com.paulmarkcastillo.pmctoolbox.converters

class WeightConverter : BaseConverter() {

    fun convertLbToKg(lb: Double): String {
        return decimalFormat.format(lb * 0.45359237)
    }

}