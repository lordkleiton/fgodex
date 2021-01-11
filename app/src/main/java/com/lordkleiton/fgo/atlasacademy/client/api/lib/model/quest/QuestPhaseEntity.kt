package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.quest

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuest
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuestPhase
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstQuestRelease
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstStage
import kotlinx.serialization.Serializable

@Serializable
data class QuestPhaseEntity(
    val mstQuest: MstQuest = MstQuest(),
    val mstQuestRelease: List<MstQuestRelease> = listOf(),
    val mstQuestPhase: MstQuestPhase = MstQuestPhase(),
    val mstStage: List<MstStage> = listOf(),
)
