package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class TraitEnum {
    unknown, genderMale, genderFemale, genderUnknown, classSaber, classLancer, classArcher,
    classRider, classCaster, classAssassin, classBerserker, classShielder, classRuler,
    classAlterEgo, classAvenger, classDemonGodPillar, classGrandCaster, classBeastI, classBeastII,
    classMoonCancer, classBeastIIIR, classForeigner, classBeastIIIL, classBeastUnknown,
    attributeSky, attributeEarth, attributeHuman, attributeStar, attributeBeast, alignmentLawful,
    alignmentChaotic, alignmentNeutral, alignmentGood, alignmentEvil, alignmentBalanced,
    alignmentMadness, alignmentSummer, basedOnServant, human, undead, artificialDemon, demonBeast,
    daemon, soldier, amazoness, skeleton, zombie, ghost, automata, golem, spellBook, homunculus,
    lamia, centaur, werebeast, chimera, wyvern, dragonType, gazer, handOrDoor, demonGodPillar, oni,
    hand, door, threatToHumanity, divine, humanoid, dragon, dragonSlayer, roman, wildbeast,
    atalante, saberface, weakToEnumaElish, riding, arthur, skyOrEarth, brynhildsBeloved,
    undeadOrDaemon, demonic, skyOrEarthExceptPseudoAndDemi, divineOrDaemonOrUndead,
    saberClassServant, superGiant, king, greekMythologyMales, illya, feminineLookingServant,
    argonaut, genderCaenisServant, hominidaeServant, blessedByKur, demonicBeastServant,
    canBeInBattle, notBasedOnServant, livingHuman, cardArts, cardBuster, cardQuick, cardExtra,
    buffPositiveEffect, buffNegativeEffect, buffIncreaseDamage, buffIncreaseDefence,
    buffDecreaseDamage, buffDecreaseDefence, buffMentalEffect, buffPoison, buffCharm,
    buffPetrify, buffStun, buffBurn, buffSpecialResistUp, buffSpecialResistDown,
    buffEvadeAndInvincible, buffSureHit, buffNpSeal, buffEvade, buffInvincible, buffTargetFocus,
    buffGuts, skillSeal, buffCurse, buffAtkUp, buffPowerModStrUp, buffDamagePlus, buffNpDamageUp,
    buffCritDamageUp, buffCritRateUp, buffAtkDown, buffPowerModStrDown, buffDamageMinus,
    buffNpDamageDown, buffCritDamageDown, buffCritRateDown, buffDeathResistDown, buffDefenceUp,
    buffMaxHpUpPercent, buffMaxHpDownPercent, buffMaxHpUp, buffMaxHpDown, buffImmobilize,
    buffIncreasePoisonEffectiveness, buffPigify, buffCurseEffectUp, buffTerrorStunChanceAfterTurn,
    buffConfusion, buffOffensiveMode, buffDefensiveMode, buffLockCardsDeck, buffDisableColorCard,
    buffChangeField, buffIncreaseDefenceAgainstIndividuality, buffInvinciblePierce,
    buffHpRecoveryPerTurn, buffNegativeEffectImmunity, buffNegativeEffectAtTurnEnd, normalAttack0,
    normalAttack1, normalAttack2, criticalHit, playerCards, cardNP, kingproteaGrowth,
    kingproteaProliferation, kingproteaProliferationNPDefense, fieldSunlight, fieldShore,
    fieldForest, fieldBurning, fieldCity, shadowServant, aoeNP, giant, childServant,
    buffSpecialInvincible, buffSkillRankUp, buffSleep, nobunaga, fieldImaginarySpace,
    existenceOutsideTheDomain, curse, fieldShoreOrImaginarySpace, shutenOnField, shuten, genji
}