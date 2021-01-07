package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceItemTypeEnum {
    qp, stone, apRecover, apAdd, mana, key, gachaClass, gachaRelic, gachaTicket, limit, skillLvUp,
    tdLvUp, friendPoint, eventPoint, eventItem, questRewardQp, chargeStone, rpAdd, boostItem,
    stoneFragments, anonymous, rarePri, costumeRelease, itemSelect, commandCardPrmUp, dice,
    continueItem
}