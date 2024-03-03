package org.alter.plugins.content.skills.mining

import org.alter.api.cfg.Items
import org.alter.api.cfg.Objs

enum class RockType(
    val level: Int, val experience: Double, val reward: Int, val respawnDelay: Int, val varrockArmourAffected: Int,
    val lowChance: Int, val highChance: Int, val objectIds: Array<Int>
) {
    ESSENCE(
        level = 1,
        experience = 5.0,
        reward = Items.RUNE_ESSENCE,
        respawnDelay = -1,
        varrockArmourAffected = -1,
        lowChance = 255,
        highChance = 392,
        objectIds = arrayOf(Objs.RUNE_ESSENCE_34773)
    ),
    CLAY(
        level = 1,
        experience = 5.0,
        reward = Items.CLAY,
        respawnDelay = 2,
        varrockArmourAffected = Items.VARROCK_ARMOUR_1,
        lowChance = 128,
        highChance = 392,
        objectIds = arrayOf(Objs.CLAY_ROCKS_11363, Objs.CLAY_ROCKS)
    ),
    COPPER(
        level = 1,
        experience = 17.5,
        reward = Items.COPPER_ORE,
        respawnDelay = 4,
        varrockArmourAffected = Items.VARROCK_ARMOUR_1,
        lowChance = 102,
        highChance = 379,
        objectIds = arrayOf(Objs.COPPER_ROCKS_11161)
    ),
    TIN(
        level = 1,
        experience = 17.5,
        reward = Items.TIN_ORE,
        respawnDelay = 4,
        varrockArmourAffected = Items.VARROCK_ARMOUR_1,
        lowChance = 102,
        highChance = 379,
        objectIds = arrayOf(Objs.TIN_ROCKS_11360, Objs.TIN_ROCKS_11361)
    ),
    IRON(
        level = 15,
        experience = 35.0,
        reward = Items.IRON_ORE,
        respawnDelay = 9,
        varrockArmourAffected = Items.VARROCK_ARMOUR_1,
        lowChance = 109,
        highChance = 346,
        objectIds = arrayOf(Objs.IRON_ROCKS, Objs.IRON_ROCKS_11365)
    ),
    COAL(
        level = 30,
        experience = 50.0,
        reward = Items.COAL,
        respawnDelay = 50,
        varrockArmourAffected = Items.VARROCK_ARMOUR_1,
        lowChance = 15,
        highChance = 100,
        objectIds = arrayOf(Objs.COAL_ROCKS_11366)
    ),
    MITHRIL(
        level = 55,
        experience = 80.0,
        reward = Items.MITHRIL_ORE,
        respawnDelay = 200,
        varrockArmourAffected = Items.VARROCK_ARMOUR_2,
        lowChance = 2,
        highChance = 50,
        objectIds = arrayOf(Objs.MITHRIL_ROCKS, Objs.MITHRIL_ROCKS_11373)
    );

    companion object {
        val values = enumValues<RockType>()
        val objects = RockType.values().flatMap { it.objectIds.toList() }
    }
}