package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import kotlinx.serialization.Serializable

@Serializable
data class BasicServant(
    val id: Int,
    val collectionNo: Int,
    val name: String,
    val type: String,
    val className: String,
    val rarity: Int,
    val atkMax: Int,
    val hpMax: Int,
    val face: String
)