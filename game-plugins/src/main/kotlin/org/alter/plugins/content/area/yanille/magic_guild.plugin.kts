package gg.rsmod.plugins.content.areas.yanille
/**
 * @author Eikenb00m <https://github.com/eikenb00m>
 */

// Doors
//TO-DO


//Basement
on_obj_option(obj = Objs.LADDER_17384, option = "Climb-Down") {
    player.moveTo(2594, 9486)
}
on_obj_option(obj = Objs.LADDER_17385, option = "Climb-Up") {
    player.moveTo(2594, 3086)
}
on_obj_option(obj = Objs.GATE_2154, option = "Open") {
    player.message("The gate is locked")
}
on_obj_option(obj = Objs.GATE_2155, option = "Open") {
    player.message("The gate is locked")
}
//Staircases
on_obj_option(obj = Objs.STAIRCASE_15645, option = "climb-Up") {
    when(player.tile.height) {
        1 -> {
            player.moveTo(x = 2591, z = 3087, 2)
        }
        else ->  player.moveTo(x = 2591, z = 3092, 1)
    }
}
on_obj_option(obj = Objs.STAIRCASE_15648, option = "climb-down") {
    when(player.tile.height) {
        1 -> {
            player.moveTo(x = 2591, z = 3088, 0)
        }
        else ->  player.moveTo(x = 2591, z = 3083, 1)
    }
}
//Portals
//East Portal
on_obj_option(obj = Objs.MAGIC_PORTAL, option = "Enter") {
    //player.moveTo(3109, 3163, 0)
    player.message("Nothing interesting happens.")
}
//South Portal
on_obj_option(obj = Objs.MAGIC_PORTAL_2157, option = "Enter") {
    //player.moveTo(2908, 3336, 0)
    player.message("Nothing interesting happens.")
}
//South Portal
on_obj_option(obj = Objs.MAGIC_PORTAL_2158, option = "Enter") {
    //player.moveTo(2702, 3405, 0)
    player.message("Nothing interesting happens.")
}



