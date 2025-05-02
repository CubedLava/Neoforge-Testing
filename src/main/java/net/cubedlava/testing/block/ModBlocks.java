package net.cubedlava.testing.block;

import net.cubedlava.testing.TestMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TestMod.MOD_ID);




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
