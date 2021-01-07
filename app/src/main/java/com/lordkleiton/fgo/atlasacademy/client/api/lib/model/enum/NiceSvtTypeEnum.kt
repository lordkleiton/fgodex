package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum

import kotlinx.serialization.Serializable

@Suppress("unused", "EnumEntryName", "SpellCheckingInspection")
@Serializable
enum class NiceSvtTypeEnum {
    normal, heroine, combineMaterial, enemy, enemyCollection, servantEquip, statusUp,
    svtEquipMaterial, enemyCollectionDetail, all, commandCode
}