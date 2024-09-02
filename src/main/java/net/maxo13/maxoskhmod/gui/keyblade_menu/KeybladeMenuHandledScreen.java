package net.maxo13.maxoskhmod.gui.keyblade_menu;


import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;

public class KeybladeMenuHandledScreen extends CottonInventoryScreen<KeybladeMenuGUI> {
    public KeybladeMenuHandledScreen(KeybladeMenuGUI handler, PlayerInventory inventory, Text title) {
        super(handler, inventory.player, title);
    }
}