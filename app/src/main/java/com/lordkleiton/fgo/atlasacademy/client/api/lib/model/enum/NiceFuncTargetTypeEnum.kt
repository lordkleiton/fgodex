package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceFuncTargetTypeEnum {
    self, ptOne, ptAnother, ptAll, enemy, enemyAnother, enemyAll, ptFull, enemyFull, ptOther,
    ptOneOther, ptRandom, enemyOther, enemyRandom, ptOtherFull, enemyOtherFull, ptselectOneSub,
    ptselectSub, ptOneAnotherRandom, ptSelfAnotherRandom, enemyOneAnotherRandom, ptSelfAnotherFirst,
    ptSelfBefore, ptSelfAfter, ptSelfAnotherLast, commandTypeSelfTreasureDevice, fieldOther
}