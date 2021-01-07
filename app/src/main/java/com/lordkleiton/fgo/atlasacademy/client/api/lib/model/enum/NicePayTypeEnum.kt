package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NicePayTypeEnum {
    stone, qp, friendPoint, mana, ticket, eventItem, chargeStone, stoneFragments, anonymous,
    rarePri, item
}