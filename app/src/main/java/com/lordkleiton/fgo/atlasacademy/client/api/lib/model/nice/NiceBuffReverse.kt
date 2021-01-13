package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceBuffTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceBuffReverse(
    val id: Int = Const.FALLBACK_INT,
    val name: String = Const.FALLBACK_STRING,
    val detail: String = Const.FALLBACK_STRING,
    val icon: String = Const.FALLBACK_STRING,
    val type: String = Const.FALLBACK_STRING,
    val buffGroup: Int = Const.FALLBACK_INT,
    val script: NiceBuffScript = NiceBuffScript(),
    val vals: List<NiceTrait> = listOf(),
    val tvals: List<NiceTrait> = listOf(),
    val ckSelfIndv: List<NiceTrait> = listOf(),
    val ckOpIndv: List<NiceTrait> = listOf(),
    val maxRate: Int = Const.FALLBACK_INT,
    val reverse: NiceReversedBuffType = NiceReversedBuffType(),
) {
    val typeEnum = findEnumByName<NiceBuffTypeEnum>(type)
}
