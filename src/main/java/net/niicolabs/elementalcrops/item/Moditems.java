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

    public static final RegistryObject<Item> ALPHINIUM_ESSENCE =
            ITEMS.register("tier_1_essence", () -> new Item(new Item.Properties()))
;    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
