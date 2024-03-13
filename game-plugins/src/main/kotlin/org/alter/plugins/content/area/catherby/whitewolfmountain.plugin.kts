package gg.rsmod.plugins.content.areas.catherby
/**
 * @author Eikenb00m <https://github.com/eikenb00m>
 */

on_obj_option(obj = Objs.ROCK_SLIDE, option = "Investigate") {
    player.message("Its a rock slide, maybe you can mine it away!")
}

on_obj_option(obj = Objs.ROCK_SLIDE, option = "Mine") {
    if (player.getSkills().getCurrentLevel(Skills.MINING) > 49) {
        player.queue {
            val z = 3518
            val x = if (player.tile.x == 2837) 2840 else 2837
            player.moveTo(tile = Tile(x = x, z = z))
        }
    } else {
        player.message("You need a mining of level 50 to cross the rock slide!")
    }
}