package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstEquip(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val condUserLv: Int = FALLBACK_INT,
    val maxLv: Int = FALLBACK_INT,
    val maleImageId: Int = FALLBACK_INT,
    val femaleImageId: Int = FALLBACK_INT,
    val imageId: Int = FALLBACK_INT,
    val maleSpellId: Int = FALLBACK_INT,
    val femaleSpellId: Int = FALLBACK_INT,
)
