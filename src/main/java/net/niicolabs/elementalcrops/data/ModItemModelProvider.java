package net.niicolabs.elementalcrops.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.ElementalCrops;
import net.niicolabs.elementalcrops.item.Custom.ConversionCrystalItem;
import net.niicolabs.elementalcrops.item.Moditems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ElementalCrops.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        simpleItem(Moditems.TIER_1_ESSENCE);
        simpleItem(Moditems.TIER_2_ESSENCE);
        simpleItem(Moditems.TIER_3_ESSENCE);
        simpleItem(Moditems.TIER_4_ESSENCE);
        simpleItem(Moditems.TIER_5_ESSENCE);
        simpleItem(Moditems.TIER_6_ESSENCE);
        simpleItem(Moditems.TIER_7_ESSENCE);
        simpleItem(Moditems.TIER_8_ESSENCE);
        simpleItem(Moditems.TIER_9_ESSENCE);
        simpleItem(Moditems.TIER_10_ESSENCE);
        simpleItem(Moditems.TIER_11_ESSENCE);
        simpleItem(Moditems.TIER_12_ESSENCE);

        simpleItem(Moditems.TIER_1_SEEDS);
        simpleItem(Moditems.TIER_2_SEEDS);
        simpleItem(Moditems.TIER_3_SEEDS);
        simpleItem(Moditems.TIER_4_SEEDS);
        simpleItem(Moditems.TIER_5_SEEDS);
        simpleItem(Moditems.TIER_6_SEEDS);
        simpleItem(Moditems.TIER_7_SEEDS);
        simpleItem(Moditems.TIER_8_SEEDS);
        simpleItem(Moditems.TIER_9_SEEDS);
        simpleItem(Moditems.TIER_10_SEEDS);
        simpleItem(Moditems.TIER_11_SEEDS);
        simpleItem(Moditems.TIER_12_SEEDS);

        crystalItem(Moditems.BASIC_CONVERSION_CRYSTAL);
        crystalItem(Moditems.ADVANCED_CONVERSION_CRYSTAL);
        crystalItem(Moditems.MASTER_CONVERSION_CRYSTAL);
        crystalItem(Moditems.PERFECTED_CONVERSION_CRYSTAL);
        crystalItem(Moditems.PRIMAL_CONVERSION_CRYSTAL);


    }

    private ItemModelBuilder crystalItem(RegistryObject<ConversionCrystalItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ElementalCrops.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ElementalCrops.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ElementalCrops.MOD_ID, "item/" + item.getId().getPath()));
    }
}
