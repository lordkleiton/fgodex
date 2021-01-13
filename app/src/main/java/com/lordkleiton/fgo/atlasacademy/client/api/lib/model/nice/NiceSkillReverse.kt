package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceSkillReverse(
    val id: Int = FALLBACK_INT,
    val num: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val strengthStatus: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val condQuestId: Int = FALLBACK_INT,
    val condQuestPhase: Int = FALLBACK_INT,
    val condLv: Int = FALLBACK_INT,
    val condLimitCount: Int = FALLBACK_INT,
    val icon: String = FALLBACK_STRING,
    val coolDown: List<Int> = listOf(),
    val actIndividuality: List<NiceTrait> = listOf(),
    val script: NiceSkillScript = NiceSkillScript(),
    val functions: List<NiceFunction> = listOf(),
    val reverse: NiceReversedSkillTdType = NiceReversedSkillTdType(),
)
