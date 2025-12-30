package net.notunstabl.mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.notunstabl.mod.ExampleMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ExampleMod.MOD_ID);

    public static final DeferredItem<Item> EXAMPLE_ITEM_1 = ITEMS.registerSimpleItem("example_item_1");

    public static final DeferredItem<Item> EXAMPLE_ITEM_2 = ITEMS.registerItem("example_item_2",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}