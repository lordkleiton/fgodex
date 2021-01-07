package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceEventTypeEnum {
    none, raidBoss, pvp, point, loginBonus, combineCampaign, shop, questCampaign, bank,
    serialCampaign, loginCampaign, loginCampaignRepeat, eventQuest, svtequipCombineCampaign,
    terminalBanner, boxGacha, boxGachaPoint, loginCampaignStrict, totalLogin, comebackCampaign,
    locationCampaign, warBoard
}