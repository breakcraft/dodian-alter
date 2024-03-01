import org.alter.game.model.priv.Privilege

on_command("keys", Privilege.ADMIN_POWER, description = "Gives you the three keys form key dungeon.") {
    player.inventory.add(item = Items.KEY_1543, amount = 1)
    player.inventory.add(item = Items.KEY_1544, amount = 1)
    player.inventory.add(item = Items.KEY_1545, amount = 1)

}