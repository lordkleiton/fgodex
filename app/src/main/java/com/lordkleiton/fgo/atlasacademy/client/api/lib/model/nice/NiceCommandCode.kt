package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra.ExtraCCAssets
import kotlinx.serialization.Serializable

@Serializable
data class NiceCommandCode(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val extraAssets: ExtraCCAssets = ExtraCCAssets(),
    val skills: List<NiceSkill> = listOf(),
    val illustrator: String = FALLBACK_STRING,
    val comment: String = FALLBACK_STRING,
)
