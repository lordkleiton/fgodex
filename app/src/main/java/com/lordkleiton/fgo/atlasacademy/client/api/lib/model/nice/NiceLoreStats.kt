package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceStatusRankEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceLoreStats(
    val strength: String = FALLBACK_STRING,
    val endurance: String = FALLBACK_STRING,
    val agility: String = FALLBACK_STRING,
    val magic: String = FALLBACK_STRING,
    val luck: String = FALLBACK_STRING,
    val np: String = FALLBACK_STRING,
) {
    val strengthEnum = findEnumByName<NiceStatusRankEnum>(strength)
    val enduranceEnum = findEnumByName<NiceStatusRankEnum>(endurance)
    val agilityEnum = findEnumByName<NiceStatusRankEnum>(agility)
    val magicEnum = findEnumByName<NiceStatusRankEnum>(magic)
    val luckEnum = findEnumByName<NiceStatusRankEnum>(luck)
    val npEnum = findEnumByName<NiceStatusRankEnum>(np)
}
