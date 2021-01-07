package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NicePurchaseTypeEnum {
    none, item, equip, friendGacha, servant, setItem, quest, eventShop, eventSvtGet, manaShop,
    storageSvt, storageSvtequip, bgm, costumeRelease, bgmRelease, lotteryShop, eventFactory,
    itemAsPresent, commandCode, gift, eventSvtJoin
}