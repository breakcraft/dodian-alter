package org.alter.plugins.content.skills.slayer

import org.alter.plugins.content.mechanics.shops.CoinCurrency

/**
 * @author Alycia <https://github.com/alycii>
 */

create_shop(
    "Slayer Equipment",
    currency = CoinCurrency(),
    purchasePolicy = PurchasePolicy.BUY_NONE,
) {
    var index = 0
    items[index++] = ShopItem(Items.ENCHANTED_GEM, amount = 10000)
    items[index] = ShopItem(Items.EARMUFFS, amount = 10)

}

val masters = arrayOf(Npcs.TURAEL, Npcs.SPRIA, Npcs.VANNAKA, Npcs.MAZCHNA, Npcs.CHAELDAR)
masters.forEach {
    on_npc_option(npc = it, option = "trade") {
        player.openShop("Slayer Equipment")
    }
}