package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceShopTypeEnum {
    none, eventItem, mana, rarePri, svtStorage, svtEquipStorage, stoneFragments, svtAnonymous, bgm,
    limitMaterial
}