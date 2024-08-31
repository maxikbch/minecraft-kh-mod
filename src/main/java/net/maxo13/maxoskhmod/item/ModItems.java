package net.maxo13.maxoskhmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxo13.maxoskhmod.KingdomHeartsMod;
import net.maxo13.maxoskhmod.item.keyblade.KeybladeItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(KingdomHeartsMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        KingdomHeartsMod.LOGGER.info("Registring mod items for "+ KingdomHeartsMod.MOD_ID);

        KeybladeItems.registerItems();
    }

}
