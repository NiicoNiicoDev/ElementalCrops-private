package net.niicolabs.elementalcrops.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.ElementalCrops;
import net.niicolabs.elementalcrops.item.Custom.ConversionCrystalItem;

public class Moditems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalCrops.MOD_ID);

    //region Essence Items
    public static final RegistryObject<Item> TIER_1_ESSENCE =
            ITEMS.register("tier_1_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_2_ESSENCE =
            ITEMS.register("tier_2_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_3_ESSENCE =
            ITEMS.register("tier_3_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_4_ESSENCE =
            ITEMS.register("tier_4_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_5_ESSENCE =
            ITEMS.register("tier_5_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_6_ESSENCE =
            ITEMS.register("tier_6_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_7_ESSENCE =
            ITEMS.register("tier_7_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_8_ESSENCE =
            ITEMS.register("tier_8_essence", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIER_9_ESSENCE =
            ITEMS.register("tier_9_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_10_ESSENCE =
            ITEMS.register("tier_10_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_11_ESSENCE =
            ITEMS.register("tier_11_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_12_ESSENCE =
            ITEMS.register("tier_12_essence", () -> new Item(new Item.Properties()));
    //endregion

    //region Seed Items
    public static final RegistryObject<Item> TIER_1_SEEDS =
            ITEMS.register("tier_1_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_2_SEEDS =
            ITEMS.register("tier_2_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_3_SEEDS =
            ITEMS.register("tier_3_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_4_SEEDS =
            ITEMS.register("tier_4_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_5_SEEDS =
            ITEMS.register("tier_5_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_6_SEEDS =
            ITEMS.register("tier_6_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_7_SEEDS =
            ITEMS.register("tier_7_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_8_SEEDS =
            ITEMS.register("tier_8_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_9_SEEDS =
            ITEMS.register("tier_9_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_10_SEEDS =
            ITEMS.register("tier_10_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_11_SEEDS =
            ITEMS.register("tier_11_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_12_SEEDS =
            ITEMS.register("tier_12_seeds", () -> new Item(new Item.Properties()));

    //endregion

    //region Conversion Crystals
    public static final RegistryObject<ConversionCrystalItem> BASIC_CONVERSION_CRYSTAL =
            ITEMS.register("basic_conversion_crystal", () -> new ConversionCrystalItem(new Item.Properties(),100, true, false));

    public static final RegistryObject<ConversionCrystalItem> ADVANCED_CONVERSION_CRYSTAL =
            ITEMS.register("advanced_conversion_crystal", () -> new ConversionCrystalItem(new Item.Properties(),250, true, false));

    public static final RegistryObject<ConversionCrystalItem> MASTER_CONVERSION_CRYSTAL =
            ITEMS.register("master_conversion_crystal", () -> new ConversionCrystalItem(new Item.Properties(),500, true, false));

    public static final RegistryObject<ConversionCrystalItem> PERFECTED_CONVERSION_CRYSTAL =
            ITEMS.register("perfected_conversion_crystal", () -> new ConversionCrystalItem(new Item.Properties(),2500, true, false));

    public static final RegistryObject<ConversionCrystalItem> PRIMAL_CONVERSION_CRYSTAL =
            ITEMS.register("primal_conversion_crystal", () -> new ConversionCrystalItem(new Item.Properties(),5000, false, false));
    //endregion

;    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
