package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceEventTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceEvent(
    val id: Int = FALLBACK_INT,
    val type: String = FALLBACK_STRING,
    val name: String = FALLBACK_STRING,
    val shortName: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val noticeBanner: String = FALLBACK_STRING,
    val banner: String = FALLBACK_STRING,
    val icon: String = FALLBACK_STRING,
    val bannerPriority: Int = FALLBACK_INT,
    val noticeAt: Int = FALLBACK_INT,
    val startedAt: Int = FALLBACK_INT,
    val endedAt: Int = FALLBACK_INT,
    val finishedAt: Int = FALLBACK_INT,
    val materialOpenedAt: Int = FALLBACK_INT,
    val warIds: List<Int> = listOf(),
    val shop: NiceShop = NiceShop(),
) {
    val typeEnum = findEnumByName<NiceEventTypeEnum>(type)
}
