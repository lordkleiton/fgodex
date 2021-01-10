package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class NiceLvlUpMaterial(
    val items: List<NiceItemAmount> = listOf(),
    val qp: Int = FALLBACK_INT,
)
