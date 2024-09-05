package net.maxo13.maxoskhmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityType;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.maxo13.maxoskhmod.KingdomHeartsMod;
import net.maxo13.maxoskhmod.block.ModBlocks;
import net.maxo13.maxoskhmod.block.custom.keyblade_altar.KeybladeAltarBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocksEntities {
    public static BlockEntityType<KeybladeAltarBlockEntity> KEYBLADE_ALTAR;

    public static void registerBlockEntities(){
        KEYBLADE_ALTAR = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(KingdomHeartsMod.MOD_ID, "keyblade_altar"),
                BlockEntityType.Builder.create(KeybladeAltarBlockEntity::new, ModBlocks.KEYBLADE_ALTAR_BLOCK).build(null));
    }
}
