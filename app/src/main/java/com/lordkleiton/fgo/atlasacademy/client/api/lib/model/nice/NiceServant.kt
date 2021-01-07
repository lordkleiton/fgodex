package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import kotlinx.serialization.Serializable

@Serializable
data class NiceServant(
    val id: Int,
    val collectionNo: Int,
    val name: String,
    val ruby: String,
    val className: String,
    val type: String,
    val flag: String,
    val rarity: Int,
    val cost: Int,
    val lvMax: Int,
    val gender: String,
    val attribute: String,
    val starAbsorb: Int,
    val starGen: Int,
    val instantDeathChance: Int,
    val atkBase: Int,
    val atkMax: Int,
    val hpBase: Int,
    val hpMax: Int,
    val growthCurve: Int,
    val bondEquip: Int,
)