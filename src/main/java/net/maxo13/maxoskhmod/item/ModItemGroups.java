package net.maxo13.maxoskhmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maxo13.maxoskhmod.KingdomHeartsMod;
import net.maxo13.maxoskhmod.block.ModBlocks;
import net.maxo13.maxoskhmod.item.keyblade.KeybladeItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup KH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KingdomHeartsMod.MOD_ID, "kingdom_hearts"),
            FabricItemGroup
                    .builder()
                    .displayName(Text.translatable("itemgroup.maxos-kh-mod.kingdom_hearts_general"))
                    .icon(() -> new ItemStack(KeybladeItems.KEYBLADE))
                    .entries((displayContext, entries) -> {
                        entries.add(KeybladeItems.KEYBLADE);
                        entries.add(ModBlocks.KEYBLADE_ALTAR_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        KingdomHeartsMod.LOGGER.info("Registring mod item groups for "+ KingdomHeartsMod.MOD_ID);


    }

}
