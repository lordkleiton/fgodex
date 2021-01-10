package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.quest

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuest
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuestRelease
import kotlinx.serialization.Serializable

@Serializable
data class QuestEntity(
    val mstQuest: MstQuest = MstQuest(),
    val mstQuestRelease: MstQuestRelease = MstQuestRelease(),
)
