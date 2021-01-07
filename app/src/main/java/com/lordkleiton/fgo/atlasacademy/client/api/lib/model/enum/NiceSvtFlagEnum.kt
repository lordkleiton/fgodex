package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceSvtFlagEnum {
    onlyUseForNpc, svtEquipFriendShip, ignoreCombineLimitSpecial, svtEquipExp, svtEquipChocolate,
    normal, goetia
}