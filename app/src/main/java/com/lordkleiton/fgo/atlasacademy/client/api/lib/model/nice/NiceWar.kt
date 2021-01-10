package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceWarStartTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceWar(
    val id: Int = FALLBACK_INT,
    val coordinates: List<List<Int>> = listOf(),
    val age: String = FALLBACK_STRING,
    val name: String = FALLBACK_STRING,
    val longName: String = FALLBACK_STRING,
    val banner: String = FALLBACK_STRING,
    val headerImage: String = FALLBACK_STRING,
    val priority: Int = FALLBACK_INT,
    val parentWarId: Int = FALLBACK_INT,
    val materialParentWarId: Int = FALLBACK_INT,
    val emptyMessage: String = FALLBACK_STRING,
    val bgm: NiceBgm = NiceBgm(),
    val scriptId: String = FALLBACK_STRING,
    val startType: String = FALLBACK_STRING,
    val targetId: Int = FALLBACK_INT,
    val eventId: Int = FALLBACK_INT,
    val lastQuestId: Int = FALLBACK_INT,
    val maps: List<NiceMap> = listOf(),
    val spots: List<NiceSpot> = listOf(),
) {
    val startTypeEnum = findEnumByName<NiceWarStartTypeEnum>(startType)
}
