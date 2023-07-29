package net.niicolabs.elementalcrops.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.ElementalCrops;
import net.niicolabs.elementalcrops.item.Custom.ModBlocks;

import java.rmi.registry.Registry;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ElementalCrops.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TIER_1_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_2_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_3_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_4_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_5_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_6_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_7_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_8_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_9_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_10_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_11_ESSENCE_BLOCK);
        blockWithItem(ModBlocks.TIER_12_ESSENCE_BLOCK);

        blockWithItem(ModBlocks.TIER_1_ESSENCE_ORE);
        blockWithItem(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.TIER_1_ESSENCE_NETHER_ORE);
        blockWithItem(ModBlocks.TIER_1_ESSENCE_END_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
