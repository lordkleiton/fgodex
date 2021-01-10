package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtCostume(
    val svtId: Int = FALLBACK_INT,
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val shortName: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val itemGetInfo: String = FALLBACK_STRING,
    val releaseInfo: String = FALLBACK_STRING,
    val costumeReleaseDetail: String = FALLBACK_STRING,
    val priority: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val costumeCollectionNo: Int = FALLBACK_INT,
    val openedAt: Int = FALLBACK_INT,
    val endedAt: Int = FALLBACK_INT,
)
