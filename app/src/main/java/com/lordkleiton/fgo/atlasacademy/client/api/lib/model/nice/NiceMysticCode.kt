package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra.ExtraMCAssets
import kotlinx.serialization.Serializable

@Serializable
data class NiceMysticCode(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val maxLv: Int = FALLBACK_INT,
    val extraAssets: ExtraMCAssets = ExtraMCAssets(),
    val skills: List<NiceSkill> = listOf(),
    val expRequired: List<Int> = listOf(),
)
