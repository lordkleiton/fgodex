package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceGiftTypeEnum {
    servant, item, friendship, userExp, equip, eventSvtJoin, eventSvtGet, questRewardIcon,
    costumeRelease, costumeGet, commandCode, eventPointBuff, eventBoardGameToken
}