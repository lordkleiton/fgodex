package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill.SkillEntityNoReverse
import kotlinx.serialization.Serializable

@Serializable
data class MstSvt(
    val relateQuestIds: List<Int> = listOf(),
    val individuality: List<Int> = listOf(),
    val classPassive: List<Int> = listOf(),
    val expandedClassPassive: List<SkillEntityNoReverse> = listOf(),
    val cardIds: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val baseSvtId: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val battleName: String = FALLBACK_STRING,
    val classId: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
    val limitMax: Int = FALLBACK_INT,
    val rewardLv: Int = FALLBACK_INT,
    val friendshipId: Int = FALLBACK_INT,
    val maxFriendshipRank: Int = FALLBACK_INT,
    val genderType: Int = FALLBACK_INT,
    val attri: Int = FALLBACK_INT,
    val combineSkillId: Int = FALLBACK_INT,
    val combineLimitId: Int = FALLBACK_INT,
    val sellQp: Int = FALLBACK_INT,
    val sellMana: Int = FALLBACK_INT,
    val sellRarePri: Int = FALLBACK_INT,
    val expType: Int = FALLBACK_INT,
    val combineMaterialId: Int = FALLBACK_INT,
    val cost: Int = FALLBACK_INT,
    val battleSize: Int = FALLBACK_INT,
    val hpGaugeY: Int = FALLBACK_INT,
    val starRate: Int = FALLBACK_INT,
    val deathRate: Int = FALLBACK_INT,
    val attackAttri: Int = FALLBACK_INT,
    val illustratorId: Int = FALLBACK_INT,
    val cvId: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val materialStoryPriority: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
)
