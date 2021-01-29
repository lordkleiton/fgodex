package com.lordkleiton.fgo.atlasacademy.client.app.utils

import android.content.Context
import android.util.TypedValue

fun Int.toDp(context: Context): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        context.resources.displayMetrics).toInt()
}