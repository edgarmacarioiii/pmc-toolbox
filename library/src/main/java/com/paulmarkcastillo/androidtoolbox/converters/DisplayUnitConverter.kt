package com.paulmarkcastillo.androidtoolbox.converters

import com.github.kevelbreh.androidunits.AndroidUnit

class DisplayUnitConverter : BaseConverter() {
    fun convertPxToDp(px: Float): Float {
        return AndroidUnit.PIXELS.toDisplayPixels(px)
    }

    fun convertDpToPx(dp: Float): Float {
        return AndroidUnit.DENSITY_PIXELS.toPixels(dp)
    }
}