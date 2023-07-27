package net.niicolabs.elementalcrops.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.ElementalCrops;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalCrops.MOD_ID);

    public static final RegistryObject<Item> TIER_1_ESSENCE =
            ITEMS.register("essence/base/tier_1_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_2_ESSENCE =
            ITEMS.register("essence/base/tier_2_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_3_ESSENCE =
            ITEMS.register("essence/base/tier_3_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_4_ESSENCE =
            ITEMS.register("essence/base/tier_4_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_5_ESSENCE =
            ITEMS.register("essence/base/tier_5_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_6_ESSENCE =
            ITEMS.register("essence/base/tier_6_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_7_ESSENCE =
            ITEMS.register("essence/base/tier_7_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_8_ESSENCE =
            ITEMS.register("essence/base/tier_8_essence", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIER_9_ESSENCE =
            ITEMS.register("essence/base/tier_9_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_10_ESSENCE =
            ITEMS.register("essence/base/tier_10_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_11_ESSENCE =
            ITEMS.register("essence/base/tier_11_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_12_ESSENCE =
            ITEMS.register("essence/base/tier_12_essence", () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> TIER_1_SEEDS =
            ITEMS.register("seeds/base/tier_1_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_2_SEEDS =
            ITEMS.register("seeds/base/tier_2_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_3_SEEDS =
            ITEMS.register("seeds/base/tier_3_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_4_SEEDS =
            ITEMS.register("seeds/base/tier_4_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_5_SEEDS =
            ITEMS.register("seeds/base/tier_5_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_6_SEEDS =
            ITEMS.register("seeds/base/tier_6_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_7_SEEDS =
            ITEMS.register("seeds/base/tier_7_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_8_SEEDS =
            ITEMS.register("seeds/base/tier_8_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_9_SEEDS =
            ITEMS.register("seeds/base/tier_9_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_10_SEEDS =
            ITEMS.register("seeds/base/tier_10_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_11_SEEDS =
            ITEMS.register("seeds/base/tier_11_seeds", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIER_12_SEEDS =
            ITEMS.register("seeds/base/tier_12_seeds", () -> new Item(new Item.Properties()));


;    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
