package org.alter.plugins.content.commands.commands.player

import org.alter.game.model.priv.Privilege
import org.alter.plugins.content.magic.TeleportType
import org.alter.plugins.content.magic.canTeleport
import org.alter.plugins.content.magic.teleport


on_command("home", description = "Teleports you home") {
    val home = world.gameContext.home
    player.moveTo(home)
}
on_command("edge", description = "Teleports you to Edgeville") {
    player.moveTo(Tile(x = 3087, z = 3499, height = 0))
}
on_command("ardy", description = "Teleports you to East Ardougne") {
    player.moveTo(Tile(x = 2662, z = 3307, height = 0))
}
on_command("seers", description = "Teleports you to Seers Village") {
    player.moveTo(Tile(x = 2725, z = 3484, height = 0))
}
on_command("cath", description = "Teleports you to Catherby") {
    player.moveTo(Tile(x = 2875, z = 3451, height = 0))
}
on_command("tav", description = "Teleports you to Taverley") {
    player.moveTo(Tile(x = 2891, z = 3454, height = 0))
}
on_command("fish", description = "Teleports you to Fishing Guild") {
    player.moveTo(Tile(x = 2597, z = 3409, height = 0))
}
on_command("legends", description = "Teleports you to Legends Guild") {
    player.moveTo(Tile(x = 2728, z = 3347, height = 0))
}
