package net.maxo13.maxoskhmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.maxo13.maxoskhmod.block.ModBlocks;
import net.maxo13.maxoskhmod.block.entity.ModBlocksEntities;
import net.maxo13.maxoskhmod.gui.ModScreenHandlers;
import net.maxo13.maxoskhmod.gui.keyblade_menu.KeybladeMenuHandledScreen;
import net.maxo13.maxoskhmod.item.ModItemGroups;
import net.maxo13.maxoskhmod.item.ModItems;
import net.maxo13.maxoskhmod.keybinds.OpenKeybladeMenuBind;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KingdomHeartsMod implements ModInitializer {

	public static final String MOD_ID = "maxos-kh-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModScreenHandlers.registerScreenHandlers();
		ModBlocks.registerModBlocks();

		ModBlocksEntities.registerBlockEntities();

	}
}