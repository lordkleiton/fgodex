package com.lordkleiton.fgo.atlasacademy.client.app.utils

import android.content.Context
import android.util.TypedValue
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion

fun Int.toDp(context: Context): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        context.resources.displayMetrics).toInt()
}

fun EnumRegion.opposite(): EnumRegion = when (this) {
    EnumRegion.NA -> EnumRegion.JP
    EnumRegion.JP -> EnumRegion.NA
}