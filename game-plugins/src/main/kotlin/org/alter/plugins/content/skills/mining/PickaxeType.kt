package org.alter.plugins.content.skills.mining

import org.alter.api.cfg.Items
import org.alter.api.cfg.Animation

/**
 * @author Tom <rspsmods@gmail.com>
 */
enum class PickaxeType(val item: Int, val level: Int, val animation: Int, val ticksBetweenRolls: Int) {
    BRONZE(
        item = Items.BRONZE_PICKAXE,
        level = 1,
        animation = Animation.MINING_BRONZE_PICKAXE,
        ticksBetweenRolls = 9
    ),
    IRON(
        item = Items.IRON_PICKAXE,
        level = 1,
        animation = Animation.MINING_IRON_PICKAXE,
        ticksBetweenRolls = 8
    ),
    STEEL(
        item = Items.STEEL_PICKAXE,
        level = 6,
        animation = Animation.MINING_STEEL_PICKAXE,
        ticksBetweenRolls = 7
    ),
    BLACK(
        item = Items.BLACK_PICKAXE,
        level = 11,
        animation = Animation.MINING_BLACK_PICKAXE,
        ticksBetweenRolls = 6
    ),
    MITHRIL(
        item = Items.MITHRIL_PICKAXE,
        level = 21,
        animation = Animation.MINING_MITHRIL_PICKAXE,
        ticksBetweenRolls = 5
    ),
    ADAMANT(
        item = Items.ADAMANT_PICKAXE,
        level = 31,
        animation = Animation.MINING_ADAMANT_PICKAXE,
        ticksBetweenRolls = 4
    ),
    RUNE(
        item = Items.RUNE_PICKAXE,
        level = 41,
        animation = Animation.MINING_RUNE_PICKAXE,
        ticksBetweenRolls = 3
    ),
    INFERNAL_PICKAXE(
        item = Items.INFERNAL_PICKAXE,
        level = 61,
        animation = Animation.MINING_INFERNAL_PICKAXE,
        ticksBetweenRolls = 3
    ),
    DRAGON(
        item = Items.DRAGON_PICKAXE,
        level = 61,
        animation = Animation.MINING_DRAGON_PICKAXE,
        ticksBetweenRolls = 3
    ),
    DRAGON_OR(
        item = Items.DRAGON_PICKAXE_OR,
        level = 61,
        animation = Animation.MINING_DRAGON_PICKAXE, //TO-DO: Find the correct animation
        ticksBetweenRolls = 3
    ),
    CRYSTAL(
        item = Items.CRYSTAL_PICKAXE,
        level = 71,
        animation = Animation.MINING_CRYSTAL_PICKAXE, //TO-DO: Find the correct animation
        ticksBetweenRolls = 2
    ),
    THIRD_AGE(
        item = Items._3RD_AGE_PICKAXE,
        level = 61,
        animation = Animation.MINING_THIRDAGE_PICKAXE, //TO-DO: Find the correct animation
        ticksBetweenRolls = 3
    );
    companion object {
        val values = enumValues<PickaxeType>()
    }

}