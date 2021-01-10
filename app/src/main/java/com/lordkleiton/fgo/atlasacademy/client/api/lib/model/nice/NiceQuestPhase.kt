package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceConsumeTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceQuestTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.SvtClassEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceQuestPhase(
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
    val phase: Int = FALLBACK_INT,
    val className: List<String> = listOf(),
    val individuality: List<NiceTrait> = listOf(),
    val qp: Int = FALLBACK_INT,
    val exp: Int = FALLBACK_INT,
    val bond: Int = FALLBACK_INT,
    val stages: List<NiceStage> = listOf(),
) {
    val typeEnum = findEnumByName<NiceQuestTypeEnum>(type)
    val consumeTypeEnum = findEnumByName<NiceConsumeTypeEnum>(consumeType)
    val classNameEnum = className.map { findEnumByName<SvtClassEnum>(it) }
}
