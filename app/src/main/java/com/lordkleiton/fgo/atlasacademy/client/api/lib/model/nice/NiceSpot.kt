package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceSpot(
    val id: Int = FALLBACK_INT,
    val joinSpotIds: Int = FALLBACK_INT,
    val mapId: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val image: String = FALLBACK_STRING,
    val x: Int = FALLBACK_INT,
    val y: Int = FALLBACK_INT,
    val imageOfsX: Int = FALLBACK_INT,
    val imageOfsY: Int = FALLBACK_INT,
    val nameOfsX: Int = FALLBACK_INT,
    val nameOfsY: Int = FALLBACK_INT,
    val questOfsX: Int = FALLBACK_INT,
    val questOfsY: Int = FALLBACK_INT,
    val nextOfsX: Int = FALLBACK_INT,
    val nextOfsY: Int = FALLBACK_INT,
    val closedMessage: String = FALLBACK_STRING,
    val quests: List<NiceQuest> = listOf(),
)
