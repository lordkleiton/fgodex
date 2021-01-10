package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceEventTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class BasicEvent(
    val id: Int = FALLBACK_INT,
    val type: String = FALLBACK_STRING,
    val name: String = FALLBACK_STRING,
    val noticeAt: Int = FALLBACK_INT,
    val startedAt: Int = FALLBACK_INT,
    val endedAt: Int = FALLBACK_INT,
    val finishedAt: Int = FALLBACK_INT,
    val materialOpenedAt: Int = FALLBACK_INT,
    val warIds: List<Int> = listOf(),
) {
    val typeEnum = findEnumByName<NiceEventTypeEnum>(type)
}
