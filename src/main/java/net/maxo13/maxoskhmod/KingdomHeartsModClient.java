package net.maxo13.maxoskhmod;

import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.maxo13.maxoskhmod.gui.ModScreenHandlers;
import net.maxo13.maxoskhmod.gui.keyblade_menu.KeybladeMenuHandledScreen;
import net.maxo13.maxoskhmod.keybinds.OpenKeybladeMenuBind;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KingdomHeartsModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        HandledScreens.register(ModScreenHandlers.KEYBLADE_MENU_SCREEN_HANDLER_TYPE, KeybladeMenuHandledScreen::new);

        KeyBinding OpenKeybladeMenuBinding = KeyBindingHelper
                .registerKeyBinding(
                        new KeyBinding("key.maxos-kh-mod.open_keyblade_menu",
                                InputUtil.Type.KEYSYM,
                                GLFW.GLFW_KEY_H,
                                "key.maxos-kh-mod.kingdom_hearts_mod"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            while(OpenKeybladeMenuBinding.wasPressed()){
                OpenKeybladeMenuBind.onKey(client);
            }
        });
    }
}
