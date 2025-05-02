package net.cubedlava.testing.item;

import net.cubedlava.testing.TestMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
