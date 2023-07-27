package net.niicolabs.elementalcrops.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.niicolabs.elementalcrops.ElementalCrops;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ElementalCrops.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
