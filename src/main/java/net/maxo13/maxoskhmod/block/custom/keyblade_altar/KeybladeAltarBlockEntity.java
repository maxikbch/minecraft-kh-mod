package net.maxo13.maxoskhmod.block.custom.keyblade_altar;

import net.maxo13.maxoskhmod.block.entity.ImplementedInventory;
import net.maxo13.maxoskhmod.block.entity.ModBlocksEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class KeybladeAltarBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);

    public KeybladeAltarBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlocksEntities.KEYBLADE_ALTAR, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Keyblade Altar");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }


    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return null;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, KeybladeAltarBlockEntity entity){

    }
}

