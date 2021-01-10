package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NicePayTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NicePurchaseTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceShopTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceShop(
    val id: Int = FALLBACK_INT,
    val baseShopId: Int = FALLBACK_INT,
    val shopType: String = FALLBACK_STRING,
    val eventId: Int = FALLBACK_INT,
    val slot: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val infoMessage: String = FALLBACK_STRING,
    val warningMessage: String = FALLBACK_STRING,
    val payType: String = FALLBACK_STRING,
    val cost: NiceItemAmount = NiceItemAmount(),
    val purchaseType: String = FALLBACK_STRING,
    val targetIds: List<Int> = listOf(),
    val setNum: Int = FALLBACK_INT,
    val limitNum: Int = FALLBACK_INT,
    val defaultLv: Int = FALLBACK_INT,
    val defaultLimitCount: Int = FALLBACK_INT,
    val openedAt: Int = FALLBACK_INT,
    val closedAt: Int = FALLBACK_INT,
) {
    val shopTypeEnum = findEnumByName<NiceShopTypeEnum>(shopType)
    val payTypeEnum = findEnumByName<NicePayTypeEnum>(payType)
    val purchaseTypeEnum = findEnumByName<NicePurchaseTypeEnum>(purchaseType)
}
