package net.niicolabs.elementalcrops.item.Custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.niicolabs.elementalcrops.ElementalCrops;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.item.Moditems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ElementalCrops.MOD_ID);

    public static final RegistryObject<Block> TIER_1_ESSENCE_BLOCK = registerBlock("blocks/essence/tier_1_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block)
    {
        return Moditems.ITEMS.register(name, ()->
                new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus)
    {
        BLOCKS.register(eventbus);
    }
}
