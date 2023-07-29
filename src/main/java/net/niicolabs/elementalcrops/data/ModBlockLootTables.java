package net.niicolabs.elementalcrops.data;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.item.Custom.ModBlocks;
import net.niicolabs.elementalcrops.item.Moditems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.TIER_1_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_2_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_3_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_4_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_5_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_6_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_7_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_8_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_9_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_10_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_11_ESSENCE_BLOCK.get());
        dropSelf(ModBlocks.TIER_12_ESSENCE_BLOCK.get());


        /*add(ModBlocks.TIER_1_ESSENCE_ORE.get(), createOreDrop(ModBlocks.TIER_1_ESSENCE_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE.get(),  createOreDrop(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_NETHER_ORE.get(), createOreDrop(ModBlocks.TIER_1_ESSENCE_NETHER_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_END_ORE.get(), createOreDrop(ModBlocks.TIER_1_ESSENCE_END_ORE.get(), Moditems.TIER_1_ESSENCE.get()));*/

        add(ModBlocks.TIER_1_ESSENCE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TIER_1_ESSENCE_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_NETHER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TIER_1_ESSENCE_NETHER_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_END_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TIER_1_ESSENCE_END_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
    }
}
