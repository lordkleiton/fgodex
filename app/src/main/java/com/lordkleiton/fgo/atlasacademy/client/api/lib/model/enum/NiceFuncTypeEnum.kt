package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceFuncTypeEnum {
    none, addState, subState, damage, damageNp, gainStar, gainHp, gainNp, lossNp, shortenSkill,
    extendSkill, releaseState, lossHp, instantDeath, damageNpPierce, damageNpIndividual,
    addStateShort, gainHpPer, damageNpStateIndividual, hastenNpturn, delayNpturn,
    damageNpHpratioHigh, damageNpHpratioLow, cardReset, replaceMember, lossHpSafe, damageNpCounter,
    damageNpStateIndividualFix, damageNpSafe, callServant, ptShuffle, lossStar, changeServant,
    changeBg, damageValue, withdraw, fixCommandcard, shortenBuffturn, extendBuffturn,
    shortenBuffcount, extendBuffcount, changeBgm, displayBuffstring, resurrection,
    gainNpBuffIndividualSum, setSystemAliveFlag, forceInstantDeath, damageNpRare, gainNpFromTargets,
    gainHpFromTargets, lossHpPer, lossHpPerSafe, shortenUserEquipSkill, quickChangeBg, shiftServant,
    damageNpAndCheckIndividuality, absorbNpturn, overwriteDeadType, forceAllBuffNoact, breakGaugeUp,
    breakGaugeDown, expUp, qpUp, dropUp, friendPointUp, eventDropUp, eventDropRateUp, eventPointUp,
    eventPointRateUp, transformServant, qpDropUp, servantFriendshipUp, userEquipExpUp, classDropUp,
    enemyEncountCopyRateUp, enemyEncountRateUp, enemyProbDown, getRewardGift,
    sendSupportFriendPoint, movePosition, revival, damageNpIndividualSum, damageValueSafe,
    friendPointUpDuplicate, moveState
}