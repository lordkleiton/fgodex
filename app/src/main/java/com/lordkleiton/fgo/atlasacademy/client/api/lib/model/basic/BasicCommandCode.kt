package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING

data class BasicCommandCode(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val face: String = FALLBACK_STRING
)