package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceClassRelationOverwriteTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class OtherRelationOverwriteDetail(
    val damageRate: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
) {
    val typeEnum = findEnumByName<NiceClassRelationOverwriteTypeEnum>(type)
}
