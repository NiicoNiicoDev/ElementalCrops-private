package net.niicolabs.elementalcrops.data;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.items.ItemStackHandler;
import net.niicolabs.elementalcrops.ElementalCrops;
import net.niicolabs.elementalcrops.item.Custom.ConversionCrystalItem;
import net.niicolabs.elementalcrops.item.Moditems;

import java.util.function.Consumer;

public class ModRecipeProvider  extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {

        //region Essence Recipes
        //region Basic
        EssenceRecipe(2,1, consumer);
        EssenceRecipe(3,1, consumer);
        EssenceRecipe(4,1, consumer);
        //endregion

        //region Advanced
        EssenceRecipe(2,2, consumer);
        EssenceRecipe(3,2, consumer);
        EssenceRecipe(4,2, consumer);
        EssenceRecipe(5,2, consumer);
        EssenceRecipe(6,2, consumer);
        EssenceRecipe(7,2, consumer);
        //endregion

        //region Master
        EssenceRecipe(2,3, consumer);
        EssenceRecipe(3,3, consumer);
        EssenceRecipe(4,3, consumer);
        EssenceRecipe(5,3, consumer);
        EssenceRecipe(6,3, consumer);
        EssenceRecipe(7,3, consumer);
        EssenceRecipe(8,3, consumer);
        EssenceRecipe(9,3, consumer);
        //endregion

        //region Perfected
        EssenceRecipe(2,4, consumer);
        EssenceRecipe(3,4, consumer);
        EssenceRecipe(4,4, consumer);
        EssenceRecipe(5,4, consumer);
        EssenceRecipe(6,4, consumer);
        EssenceRecipe(7,4, consumer);
        EssenceRecipe(8,4, consumer);
        EssenceRecipe(9,4, consumer);
        EssenceRecipe(10,4, consumer);
        EssenceRecipe(11,4, consumer);
        //endregion

        //region Primal
        EssenceRecipe(2,5, consumer);
        EssenceRecipe(3,5, consumer);
        EssenceRecipe(4,5, consumer);
        EssenceRecipe(5,5, consumer);
        EssenceRecipe(6,5, consumer);
        EssenceRecipe(7,5, consumer);
        EssenceRecipe(8,5, consumer);
        EssenceRecipe(9,5, consumer);
        EssenceRecipe(10,5, consumer);
        EssenceRecipe(11,5, consumer);
        EssenceRecipe(12,5, consumer);
        //endregion
        //endregion

        //region Crystal Recipes

        CrystalRecipe(1, Items.DIAMOND, Moditems.TIER_1_ESSENCE.get(), Items.DIAMOND_BLOCK, 1, consumer);
        CrystalRecipe(2, Moditems.BASIC_CONVERSION_CRYSTAL.get(), Moditems.TIER_4_ESSENCE.get(), Items.NETHERITE_BLOCK, 1, consumer);

        //endregion
    }

    private void EssenceRecipe(int outEssenceTier, int inCrystalTier, Consumer<FinishedRecipe> consumer )
    {
        String resourceLoc = "crystal_tier_" + String.valueOf(inCrystalTier) + "_" + "essence_tier_" + String.valueOf(outEssenceTier) + "_recipe";
        String concat = "has_tier_" + String.valueOf(outEssenceTier - 1) + "_essence";

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GetEssenceItemFromTier(outEssenceTier))
                .requires(GetEssenceItemFromTier(outEssenceTier - 1), 8)
                .requires(GetCrystalItemFromTier(inCrystalTier), 1)
                .unlockedBy(concat, inventoryTrigger(ItemPredicate.Builder.item().of(GetEssenceItemFromTier(outEssenceTier - 1)).build()))
                .save(consumer, new ResourceLocation(ElementalCrops.MOD_ID, resourceLoc));
    }

    private void CrystalRecipe(int CrystalTier, ItemLike Core, ItemLike essence, ItemLike block, int essenceTier, Consumer<FinishedRecipe> consumer)
    {
        String resourceLoc = "crystal_tier_" + String.valueOf(CrystalTier) + "_recipe";
        String concat = "has_tier_" + String.valueOf(essenceTier) + "_essence";

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GetCrystalItemFromTier(CrystalTier))
                .define('C', Core)
                .define('E', essence)
                .define('B', block)

                .pattern("BEB")
                .pattern("ECE")
                .pattern("BEB")

                .unlockedBy(concat, inventoryTrigger(ItemPredicate.Builder.item().of(GetEssenceItemFromTier(essenceTier)).build()))
                .save(consumer, new ResourceLocation(ElementalCrops.MOD_ID, resourceLoc));


    }



    private ConversionCrystalItem GetCrystalItemFromTier(int crystalTier)
    {
        ConversionCrystalItem crystal = null;

        switch (crystalTier) {
            case 1:
                crystal = Moditems.BASIC_CONVERSION_CRYSTAL.get();
                break;
            case 2:
                crystal = Moditems.ADVANCED_CONVERSION_CRYSTAL.get();
                break;
            case 3:
                crystal = Moditems.MASTER_CONVERSION_CRYSTAL.get();
                break;
            case 4:
                crystal = Moditems.PERFECTED_CONVERSION_CRYSTAL.get();
                break;
            case 5:
                crystal = Moditems.PRIMAL_CONVERSION_CRYSTAL.get();
                break;
        }

        return crystal;

    }

    private ItemLike GetEssenceItemFromTier(int essenceTier)
    {
        ItemLike Essence = null;

        switch (essenceTier) {
            case 1:
                Essence = Moditems.TIER_1_ESSENCE.get();
                break;
            case 2:
                Essence = Moditems.TIER_2_ESSENCE.get();
                break;
            case 3:
                Essence = Moditems.TIER_3_ESSENCE.get();
                break;
            case 4:
                Essence = Moditems.TIER_4_ESSENCE.get();
                break;
            case 5:
                Essence = Moditems.TIER_5_ESSENCE.get();
                break;
            case 6:
                Essence = Moditems.TIER_6_ESSENCE.get();
                break;
            case 7:
                Essence = Moditems.TIER_7_ESSENCE.get();
                break;
            case 8:
                Essence = Moditems.TIER_8_ESSENCE.get();
                break;
            case 9:
                Essence = Moditems.TIER_9_ESSENCE.get();
                break;
            case 10:
                Essence = Moditems.TIER_10_ESSENCE.get();
                break;
            case 11:
                Essence = Moditems.TIER_11_ESSENCE.get();
                break;
            case 12:
                Essence = Moditems.TIER_12_ESSENCE.get();
                break;
        }

        return Essence;
    }
}
