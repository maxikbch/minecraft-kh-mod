package net.maxo13.maxoskhmod.gui;

import net.maxo13.maxoskhmod.KingdomHeartsMod;
import net.maxo13.maxoskhmod.gui.keyblade_menu.KeybladeMenuGUI;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<KeybladeMenuGUI> KEYBLADE_MENU_SCREEN_HANDLER_TYPE;

    public static void registerScreenHandlers() {

        KingdomHeartsMod.LOGGER.info("Registring mod screen handlers for "+ KingdomHeartsMod.MOD_ID);

        KEYBLADE_MENU_SCREEN_HANDLER_TYPE = Registry.register(
                Registries.SCREEN_HANDLER, // Registering the screen handler type
                new Identifier(KingdomHeartsMod.MOD_ID, "keyblade_menu_gui"), // Your mod's ID and screen handler name
                new ScreenHandlerType<>(KeybladeMenuGUI::new, FeatureSet.empty()) // Factory method to create the screen handler
        );
    }
}
