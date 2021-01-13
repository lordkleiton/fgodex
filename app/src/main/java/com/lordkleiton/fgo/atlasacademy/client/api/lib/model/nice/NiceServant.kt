package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.ascension.AscensionAdd
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra.ExtraAssets
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherServantScript
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceServant(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val className: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val flag: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val cost: Int = FALLBACK_INT,
    val lvMax: Int = FALLBACK_INT,
    val extraAssets: ExtraAssets = ExtraAssets(),
    val gender: String = FALLBACK_STRING,
    val attribute: String = FALLBACK_STRING,
    val traits: List<NiceTrait> = listOf(),
    val starAbsorb: Int = FALLBACK_INT,
    val starGen: Int = FALLBACK_INT,
    val instantDeathChance: Int = FALLBACK_INT,
    val cards: List<String> = listOf(),
    val hitsDistribution: Map<String, List<Int>> = mapOf(),
    val atkBase: Int = FALLBACK_INT,
    val atkMax: Int = FALLBACK_INT,
    val hpBase: Int = FALLBACK_INT,
    val hpMax: Int = FALLBACK_INT,
    val relateQuestIds: List<Int> = listOf(),
    val growthCurve: Int = FALLBACK_INT,
    val atkGrowth: List<Int> = listOf(),
    val hpGrowth: List<Int> = listOf(),
    val bondGrowth: List<Int> = listOf(),
    val expGrowth: List<Int> = listOf(),
    val expFeed: List<Int> = listOf(),
    val bondEquip: Int = FALLBACK_INT,
    val ascensionAdd: AscensionAdd = AscensionAdd(),
    val svtChange: List<NiceServantChange> = listOf(),
    val ascensionMaterials: Map<String, NiceLvlUpMaterial> = mapOf(),
    val skillMaterials: Map<String, NiceLvlUpMaterial> = mapOf(),
    val costumeMaterials: Map<String, NiceLvlUpMaterial> = mapOf(),
    val script: OtherServantScript = OtherServantScript(),
    val skills: List<NiceSkill> = listOf(),
    val classPassive: List<NiceSkill> = listOf(),
    val noblePhantasms: List<NiceTd> = listOf(),
    val profile: NiceLore = NiceLore(),
) {
    val classNameEnum = findEnumByName<SvtClassEnum>(className)
    val typeEnum = findEnumByName<NiceSvtTypeEnum>(type)
    val flagEnum = findEnumByName<NiceSvtFlagEnum>(flag)
    val genderEnum = findEnumByName<NiceGenderEnum>(gender)
    val attributeEnum = findEnumByName<AttributeEnum>(attribute)
}