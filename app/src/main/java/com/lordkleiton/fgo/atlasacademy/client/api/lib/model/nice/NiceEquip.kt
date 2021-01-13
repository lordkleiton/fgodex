package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra.ExtraAssets
import kotlinx.serialization.Serializable

@Serializable
data class NiceEquip(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val flag: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val cost: Int = FALLBACK_INT,
    val lvMax: Int = FALLBACK_INT,
    val extraAssets: ExtraAssets = ExtraAssets(),
    val atkBase: Int = FALLBACK_INT,
    val atkMax: Int = FALLBACK_INT,
    val hpBase: Int = FALLBACK_INT,
    val hpMax: Int = FALLBACK_INT,
    val growthCurve: Int = FALLBACK_INT,
    val atkGrowth: List<Int> = listOf(),
    val hpGrowth: List<Int> = listOf(),
    val expGrowth: List<Int> = listOf(),
    val expFeed: List<Int> = listOf(),
    val skills: List<NiceSkill> = listOf(),
    val profile: NiceLore = NiceLore(),
)
