package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceCardTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherNpGain
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceTd(
    val id: Int = FALLBACK_INT,
    val num: Int = FALLBACK_INT,
    val card: String = FALLBACK_STRING,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val icon: String = FALLBACK_STRING,
    val rank: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val npGain: OtherNpGain = OtherNpGain(),
    val npDistribution: List<Int> = listOf(),
    val strengthStatus: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val condQuestId: Int = FALLBACK_INT,
    val condQuestPhase: Int = FALLBACK_INT,
    val individuality: List<NiceTrait> = listOf(),
    val functions: List<NiceFunction> = listOf(),
) {
    val cardEnum = findEnumByName<NiceCardTypeEnum>(card)
}
