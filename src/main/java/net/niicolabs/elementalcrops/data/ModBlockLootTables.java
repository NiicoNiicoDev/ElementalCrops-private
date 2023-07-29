package net.niicolabs.elementalcrops.data;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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
                (block) -> createEssenceOreDrop(ModBlocks.TIER_1_ESSENCE_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE.get(),
                (block) -> createEssenceOreDrop(ModBlocks.TIER_1_ESSENCE_DEEPSLATE_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_NETHER_ORE.get(),
                (block) -> createEssenceOreDrop(ModBlocks.TIER_1_ESSENCE_NETHER_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
        add(ModBlocks.TIER_1_ESSENCE_END_ORE.get(),
                (block) -> createEssenceOreDrop(ModBlocks.TIER_1_ESSENCE_END_ORE.get(), Moditems.TIER_1_ESSENCE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createEssenceOreDrop(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
}
