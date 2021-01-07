package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceVoiceCondTypeEnum {
    birthDay, event, friendship, svtGet, svtGroup, questClear, notQuestClear, levelUp, limitCount,
    limitCountCommon, countStop, isnewWar, eventEnd, eventNoend, eventMissionAction, masterMission,
    limitCountAbove, eventShopPurchase, eventPeriod, friendshipAbove, spacificShopPurchase,
    friendshipBelow, costume, levelUpLimitCount, levelUpLimitCountAbove, levelUpLimitCountBelow
}