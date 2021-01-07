package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

data class BasicCE(
    val id: Int,
    val collectionNo: Int,
    val name: String,
    val type: String,
    val rarity: Int,
    val atkMax: Int,
    val hpMax: Int,
    val face: String
)