package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceCondTypeEnum {
    none, questClear, itemGet, useItemEternity, useItemTime, useItemCount, svtLevel, svtLimit,
    svtGet, svtFriendship, svtGroup, event, date, weekday, purchaseQpShop, purchaseStoneShop,
    warClear, flag, svtCountStop, birthDay, eventEnd, svtEventJoin, missionConditionDetail,
    eventMissionClear, eventMissionAchieve, questClearNum, notQuestGroupClear, raidAlive, raidDead,
    raidDamage, questChallengeNum, masterMission, questGroupClear, superBossDamage,
    superBossDamageAll, purchaseShop, questNotClear, notShopPurchase, notSvtGet,
    notEventShopPurchase, svtHaving, notSvtHaving, questChallengeNumEqual, questChallengeNumBelow,
    questClearNumEqual, questClearNumBelow, questClearPhase, notQuestClearPhase, eventPointGroupWin,
    eventNormaPointClear, questAvailable, questGroupAvailableNum, eventNormaPointNotClear,
    notItemGet, costumeGet, questResetAvailable, svtGetBeforeEventEnd, questClearRaw,
    questGroupClearRaw, eventGroupPointRatioInTerm, eventGroupRankInTerm,
    notEventRaceQuestOrNotAllGroupGoal, eventGroupTotalWinEachPlayer, eventScriptPlay,
    svtCostumeReleased, questNotClearAnd, svtRecoverd, shopReleased, eventPoint,
    eventRewardDispCount, equipWithTargetCostume, raidGroupDead, notSvtGroup,
    notQuestResetAvailable, notQuestClearRaw, notQuestGroupClearRaw, notEventMissionClear,
    notEventMissionAchieve, notCostumeGet, notSvtCostumeReleased,
    notEventRaceQuestOrNotTargetRankGoal, playerGenderType, shopGroupLimitNum, eventGroupPoint,
    eventGroupPointBelow, eventTotalPoint, eventTotalPointBelow, eventValue, eventValueBelow,
    eventFlag, eventStatus, notEventStatus, forceFalse, svtHavingLimitMax, eventPointBelow,
    svtEquipFriendshipHaving, movieNotDownload, multipleDate, svtFriendshipAbove,
    svtFriendshipBelow, movieDownloaded, routeSelect, notRouteSelect, limitCount, limitCountAbove,
    limitCountBelow, badEndPlay, commandCodeGet, notCommandCodeGet, allUsersBoxGachaCount,
    totalTdLevel, totalTdLevelAbove, totalTdLevelBelow, commonRelease, battleResultWin,
    battleResultLose, eventValueEqual, boardGameTokenHaving, boardGameTokenGroupHaving,
    eventFlagOn, eventFlagOff, questStatusFlagOn, questStatusFlagOff, eventValueNotEqual,
    limitCountMaxEqual, limitCountMaxAbove, limitCountMaxBelow, boardGameTokenGetNum,
    battleLineWinAbove, battleLineLoseAbove, battleLineContinueWin, battleLineContinueLose,
    battleLineContinueWinBelow, battleLineContinueLoseBelow, battleGroupWinAvove,
    battleGroupLoseAvove, svtLimitClassNum, overTimeLimitRaidAlive, onTimeLimitRaidDead,
    onTimeLimitRaidDeadNum, raidBattleProgressAbove, svtEquipRarityLevelNum,
    latestMainScenarioWarClear, eventMapValueContains
}