package net.niicolabs.elementalcrops.item.Custom;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
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

    //region Essence Blocks
    public static final RegistryObject<Block> TIER_1_ESSENCE_BLOCK = registerBlock("tier_1_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_2_ESSENCE_BLOCK = registerBlock("tier_2_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_3_ESSENCE_BLOCK = registerBlock("tier_3_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_4_ESSENCE_BLOCK = registerBlock("tier_4_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_5_ESSENCE_BLOCK = registerBlock("tier_5_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_6_ESSENCE_BLOCK = registerBlock("tier_6_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_7_ESSENCE_BLOCK = registerBlock("tier_7_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_8_ESSENCE_BLOCK = registerBlock("tier_8_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_9_ESSENCE_BLOCK = registerBlock("tier_9_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_10_ESSENCE_BLOCK = registerBlock("tier_10_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_11_ESSENCE_BLOCK = registerBlock("tier_11_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIER_12_ESSENCE_BLOCK = registerBlock("tier_12_essence_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    //endregion

    //region Essence Ores
    //region Essence Ores Default
    public static final RegistryObject<Block> TIER_1_ESSENCE_ORE = registerBlock("tier_1_essence_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,6)));
    //endregion

    //region Essence Ores Deepslate
    public static final RegistryObject<Block> TIER_1_ESSENCE_DEEPSLATE_ORE = registerBlock("tier_1_essence_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,6)));
    //endregion

    //region Essence Ores Nether
    public static final RegistryObject<Block> TIER_1_ESSENCE_NETHER_ORE = registerBlock("tier_1_essence_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,6)));
    //endregion

    //region Essence Ores End
    public static final RegistryObject<Block> TIER_1_ESSENCE_END_ORE = registerBlock("tier_1_essence_end_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,6)));
    //endregion
    //endregion

    //region Crop Blocks
    public static final RegistryObject<Block> TIER_1_ESSENCE_CROP = registerBlock("tier_1_essence_CROP", () -> new EssenceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT), 4, Moditems.TIER_1_SEEDS.get()));
    //endregion


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus)
    {
        BLOCKS.register(eventbus);
    }
}
