package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceGiftTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceGift(
    val id: Int = FALLBACK_INT,
    val type: String = FALLBACK_STRING,
    val objectId: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val num: Int = FALLBACK_INT,
) {
    val typeEnum = findEnumByName<NiceGiftTypeEnum>(type)
}
