package com.lordkleiton.fgo.atlasacademy.client.app.utils

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion

object AppEnums {
    private const val NEW_LINE = "\n"
    const val EXTRA_SERVANT_ID = "servantId"
    const val EXTRA_REGION = "region"
    const val EXTRA_REGION_NA = "NA"
    const val EXTRA_REGION_JP = "JP"
    const val DEFAULT_ID = -1
    const val DEFAULT_ENGLISH = true
    const val JAPANESE_OPENING_PARENTHESIS = "〔"
    const val NEW_JAPANESE_OPENING_PARENTHESIS = "$NEW_LINE$JAPANESE_OPENING_PARENTHESIS"
    const val JAPANESE_CLOSING_PARENTHESIS = "〕"
    val DEFAULT_REGION = EnumRegion.NA
}