package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class OtherBaseVals(
    val Rate: Int = FALLBACK_INT,
    val Turn: Int = FALLBACK_INT,
    val Count: Int = FALLBACK_INT,
    val Value: Int = FALLBACK_INT,
    val Value2: Int = FALLBACK_INT,
    val UseRate: Int = FALLBACK_INT,
    val Target: Int = FALLBACK_INT,
    val Correction: Int = FALLBACK_INT,
    val ParamAdd: Int = FALLBACK_INT,
    val ParamMax: Int = FALLBACK_INT,
    val HideMiss: Int = FALLBACK_INT,
    val OnField: Int = FALLBACK_INT,
    val HideNoEffect: Int = FALLBACK_INT,
    val Unaffected: Int = FALLBACK_INT,
    val ShowState: Int = FALLBACK_INT,
    val AuraEffectId: Int = FALLBACK_INT,
    val ActSet: Int = FALLBACK_INT,
    val ActSetWeight: Int = FALLBACK_INT,
    val ShowQuestNoEffect: Int = FALLBACK_INT,
    val CheckDead: Int = FALLBACK_INT,
    val RatioHPHigh: Int = FALLBACK_INT,
    val RatioHPLow: Int = FALLBACK_INT,
    val SetPassiveFrame: Int = FALLBACK_INT,
    val ProcPassive: Int = FALLBACK_INT,
    val ProcActive: Int = FALLBACK_INT,
    val HideParam: Int = FALLBACK_INT,
    val SkillID: Int = FALLBACK_INT,
    val SkillLV: Int = FALLBACK_INT,
    val ShowCardOnly: Int = FALLBACK_INT,
    val EffectSummon: Int = FALLBACK_INT,
    val RatioHPRangeHigh: Int = FALLBACK_INT,
    val RatioHPRangeLow: Int = FALLBACK_INT,
    val TargetList: List<Int> = listOf(),
    val OpponentOnly: Int = FALLBACK_INT,
    val StatusEffectId: Int = FALLBACK_INT,
    val EndBattle: Int = FALLBACK_INT,
    val LoseBattle: Int = FALLBACK_INT,
    val AddIndividualty: Int = FALLBACK_INT,
    val AddLinkageTargetIndividualty: Int = FALLBACK_INT,
    val SameBuffLimitTargetIndividuality: Int = FALLBACK_INT,
    val SameBuffLimitNum: Int = FALLBACK_INT,
    val CheckDuplicate: Int = FALLBACK_INT,
    val OnFieldCount: Int = FALLBACK_INT,
    val TargetRarityList: List<Int> = listOf(),
    val DependFuncId: Int = FALLBACK_INT,
    val InvalidHide: Int = FALLBACK_INT,
    val OutEnemyNpcId: Int = FALLBACK_INT,
    val InEnemyNpcId: Int = FALLBACK_INT,
    val OutEnemyPosition: Int = FALLBACK_INT,
    val IgnoreIndividuality: Int = FALLBACK_INT,
    val StarHigher: Int = FALLBACK_INT,
    val ChangeTDCommandType: Int = FALLBACK_INT,
    val ShiftNpcId: Int = FALLBACK_INT,
    val DisplayLastFuncInvalidType: Int = FALLBACK_INT,
    val AndCheckIndividualityList: List<Int> = listOf(),
    val WinBattleNotRelatedSurvivalStatus: Int = FALLBACK_INT,
    val ForceSelfInstantDeath: Int = FALLBACK_INT,
    val ChangeMaxBreakGauge: Int = FALLBACK_INT,
    val ParamAddMaxValue: Int = FALLBACK_INT,
    val ParamAddMaxCount: Int = FALLBACK_INT,
    val LossHpChangeDamage: Int = FALLBACK_INT,
    val IncludePassiveIndividuality: Int = FALLBACK_INT,
    val MotionChange: Int = FALLBACK_INT,
    val PopLabelDelay: Int = FALLBACK_INT,
    val NoTargetNoAct: Int = FALLBACK_INT,
    val CardIndex: Int = FALLBACK_INT,
    val CardIndividuality: Int = FALLBACK_INT,
    val Individuality: Int = FALLBACK_INT,
    val EventId: Int = FALLBACK_INT,
    val AddCount: Int = FALLBACK_INT,
    val RateCount: Int = FALLBACK_INT,
)