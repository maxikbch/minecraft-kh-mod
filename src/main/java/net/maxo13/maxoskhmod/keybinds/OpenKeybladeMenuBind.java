package net.maxo13.maxoskhmod.keybinds;

import net.maxo13.maxoskhmod.gui.keyblade_menu.KeybladeMenuGUI;
import net.maxo13.maxoskhmod.gui.keyblade_menu.KeybladeMenuHandledScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;

public class OpenKeybladeMenuBind {


    public static void onKey(MinecraftClient client){
        if (client.player != null) {
            //client.execute(() -> {
            //    client.player.openHandledScreen(
            //            new SimpleNamedScreenHandlerFactory(
            //                    (syncId, inventory, player) -> new KeybladeMenuGUI(syncId, inventory),
            //                    Text.literal("container.custom_inventory")
            //            )
            //    );
            //});
            client.setScreen(new KeybladeMenuHandledScreen(new KeybladeMenuGUI(0, client.player.getInventory()), client.player.getInventory(), Text.literal("My GUI")));
        }
    }

}
