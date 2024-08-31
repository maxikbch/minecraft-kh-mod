package net.maxo13.maxoskhmod;

import net.fabricmc.api.ModInitializer;

import net.maxo13.maxoskhmod.item.ModItemGroups;
import net.maxo13.maxoskhmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KingdomHeartsMod implements ModInitializer {

	public static final String MOD_ID = "maxos-kh-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}