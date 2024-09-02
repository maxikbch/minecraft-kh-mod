package net.maxo13.maxoskhmod.item.command;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.maxo13.maxoskhmod.item.ModItems;
import net.minecraft.item.Item;



public class CommandItems {

    public static void registerItems(){

    }

    private static Item generateCommandItem(String name){
        return ModItems.registerItem("command_" + name,
                new CommandItem(new FabricItemSettings().maxCount(1)

                ));
    }

    public static final Item COMMAND_FIRE = generateCommandItem("fire");

}
