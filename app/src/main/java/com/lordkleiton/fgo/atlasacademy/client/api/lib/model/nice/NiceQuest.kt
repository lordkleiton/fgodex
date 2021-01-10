package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceConsumeTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceQuestTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceQuest(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val consumeType: String = FALLBACK_STRING,
    val consume: Int = FALLBACK_INT,
    val spotId: Int = FALLBACK_INT,
    val warId: Int = FALLBACK_INT,
    val gifts: List<NiceGift> = listOf(),
    val releaseConditions: List<NiceQuestRelease> = listOf(),
    val phases: List<Int> = listOf(),
    val noticeAt: Int = FALLBACK_INT,
    val openedAt: Int = FALLBACK_INT,
    val closedAt: Int = FALLBACK_INT,
) {
    val typeEnum = findEnumByName<NiceQuestTypeEnum>(type)
    val consumeTypeEnum = findEnumByName<NiceConsumeTypeEnum>(consumeType)
}
