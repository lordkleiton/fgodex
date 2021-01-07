package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceBuffTypeEnum {
    none, upCommandatk, upStarweight, upCriticalpoint, downCriticalpoint, regainNp, regainStar,
    regainHp, reduceHp, upAtk, downAtk, upDamage, downDamage, addDamage, subDamage, upNpdamage,
    downNpdamage, upDropnp, upCriticaldamage, downCriticaldamage, upSelfdamage, downSelfdamage,
    addSelfdamage, subSelfdamage, avoidance, breakAvoidance, invincible, upGrantstate,
    downGrantstate, upTolerance, downTolerance, avoidState, donotAct, donotSkill, donotNoble,
    donotRecovery, disableGender, guts, upHate, addIndividuality, subIndividuality, upDefence,
    downDefence, upCommandstar, upCommandnp, upCommandall, downCommandall, downStarweight, reduceNp,
    downDropnp, upGainHp, downGainHp, downCommandatk, downCommanstar, downCommandnp, upCriticalrate,
    downCriticalrate, pierceInvincible, avoidInstantdeath, upResistInstantdeath,
    upNonresistInstantdeath, delayFunction, regainNpUsedNoble, deadFunction, upMaxhp, downMaxhp,
    addMaxhp, subMaxhp, battlestartFunction, wavestartFunction, selfturnendFunction, damageFunction,
    upGivegainHp, downGivegainHp, commandattackFunction, deadattackFunction, upSpecialdefence,
    downSpecialdefence, upDamagedropnp, downDamagedropnp, entryFunction, upChagetd,
    reflectionFunction, upGrantSubstate, downGrantSubstate, upToleranceSubstate,
    downToleranceSubstate, upGrantInstantdeath, downGrantInstantdeath, gutsRatio,
    upDefencecommandall, downDefencecommandall, overwriteBattleclass, overwriteClassrelatioAtk,
    overwriteClassrelatioDef, upDamageIndividuality, downDamageIndividuality,
    upDamageIndividualityActiveonly, downDamageIndividualityActiveonly, upNpturnval, downNpturnval,
    multiattack, upGiveNp, downGiveNp, upResistanceDelayNpturn, downResistanceDelayNpturn,
    pierceDefence, upGutsHp, downGutsHp, upFuncgainNp, downFuncgainNp, upFuncHpReduce,
    downFuncHpReduce, upDefencecommanDamage, downDefencecommanDamage, npattackPrevBuff,
    fixCommandcard, donotGainnp, fieldIndividuality, donotActCommandtype, upDamageEventPoint,
    upDamageSpecial, attackFunction, commandcodeattackFunction, donotNobleCondMismatch,
    donotSelectCommandcard, donotReplace, shortenUserEquipSkill, tdTypeChange,
    overwriteClassRelation, tdTypeChangeArts, tdTypeChangeBuster, tdTypeChangeQuick,
    commandattackBeforeFunction, gutsFunction, upCriticalRateDamageTaken,
    downCriticalRateDamageTaken, upCriticalStarDamageTaken, downCriticalStarDamageTaken,
    skillRankUp, avoidanceIndividuality, changeCommandCardType, specialInvincible,
    preventDeathByDamage, commandcodeattackAfterFunction, attackBeforeFunction
}