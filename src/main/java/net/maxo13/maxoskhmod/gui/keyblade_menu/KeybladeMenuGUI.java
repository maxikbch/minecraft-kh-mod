package net.maxo13.maxoskhmod.gui.keyblade_menu;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WPlayerInvPanel;
import net.maxo13.maxoskhmod.gui.ModScreenHandlers;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.util.collection.DefaultedList;

public class KeybladeMenuGUI extends SyncedGuiDescription {

    public KeybladeMenuGUI(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.KEYBLADE_MENU_SCREEN_HANDLER_TYPE, syncId, playerInventory);
        // Add slots (9 custom slots)
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 200);  // Size of the GUI

        // Create a custom inventory with 9 slots
        Inventory customInventory = new SimpleInventory(9);
        WItemSlot commandSlots = new WItemSlot(playerInventory, 0, 3, 3, false);
        root.add(commandSlots, 1, 1); // Add it to the panel

        // Add player inventory slots
        root.add(this.createPlayerInventoryPanel(), 1, 5);

        root.validate(this);

    }

}


/*




Inventory inventory = new SimpleInventory(9);

public KeybladeMenuGUI(ClientPlayerEntity player) {
    super(ScreenHandlerType.GENERIC_9X3, player.playerScreenHandler.syncId, player.getInventory());

    WGridPanel root = new WGridPanel();
    setRootPanel(root);
    root.setSize(300, 200);

    WItemSlot commandSlots = new WItemSlot(inventory, 0, 3, 3, false);

    root.add(commandSlots, 1, 1);

    root.add(this.createPlayerInventoryPanel(), 1, 5);

    root.validate(this);
}
*/