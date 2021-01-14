package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuest
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuestConsumeItem
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuestRelease
import kotlinx.serialization.Serializable

@Serializable
data class OtherQuestEntity(
    val mstQuest: MstQuest = MstQuest(),
    val mstQuestConsumeItem: List<MstQuestConsumeItem> = listOf(),
    val mstQuestRelease: List<MstQuestRelease> = listOf(),
)
