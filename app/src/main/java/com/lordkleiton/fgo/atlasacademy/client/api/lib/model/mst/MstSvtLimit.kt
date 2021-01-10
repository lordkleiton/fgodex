package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtLimit(
    val weaponColor: Int = FALLBACK_INT,
    val svtId: Int = FALLBACK_INT,
    val limitCount: Int = FALLBACK_INT,
    val rarity: Int = FALLBACK_INT,
    val lvMax: Int = FALLBACK_INT,
    val weaponGroup: Int = FALLBACK_INT,
    val weaponScale: Int = FALLBACK_INT,
    val effectFolder: Int = FALLBACK_INT,
    val hpBase: Int = FALLBACK_INT,
    val hpMax: Int = FALLBACK_INT,
    val atkBase: Int = FALLBACK_INT,
    val atkMax: Int = FALLBACK_INT,
    val criticalWeight: Int = FALLBACK_INT,
    val power: Int = FALLBACK_INT,
    val defense: Int = FALLBACK_INT,
    val agility: Int = FALLBACK_INT,
    val magic: Int = FALLBACK_INT,
    val luck: Int = FALLBACK_INT,
    val treasureDevice: Int = FALLBACK_INT,
    val policy: Int = FALLBACK_INT,
    val personality: Int = FALLBACK_INT,
    val deity: Int = FALLBACK_INT,
    val stepProbability: Int = FALLBACK_INT,
    val strParam: String = FALLBACK_STRING
)