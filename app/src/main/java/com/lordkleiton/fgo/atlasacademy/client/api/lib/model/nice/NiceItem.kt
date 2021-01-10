package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceItemBGTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceItemTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceItem(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val individuality: List<NiceTrait> = listOf(),
    val icon: String = FALLBACK_STRING,
    val background: String = FALLBACK_STRING,
) {
    val typeEnum = findEnumByName<NiceItemTypeEnum>(type)
    val backgroundEnum = findEnumByName<NiceItemBGTypeEnum>(background)
}
