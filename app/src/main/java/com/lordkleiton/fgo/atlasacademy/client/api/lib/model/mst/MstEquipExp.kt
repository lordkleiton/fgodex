package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstEquipExp(
    val equipId: Int = FALLBACK_INT,
    val lv: Int = FALLBACK_INT,
    val exp: Int = FALLBACK_INT,
    val skillLv1: Int = FALLBACK_INT,
    val skillLv2: Int = FALLBACK_INT,
    val skillLv3: Int = FALLBACK_INT,
)
