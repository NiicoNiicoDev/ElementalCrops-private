package net.niicolabs.elementalcrops.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.ElementalCrops;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementalCrops.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELEMENTALCROPS_TAB =
            CREATIVE_MODE_TABS.register("elementalcrops_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.ALPHINIUM_ESSENCE.get()))
                            .title(Component.translatable("creativetab.elementalcrops.tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(Moditems.ALPHINIUM_ESSENCE.get());
                                pOutput.accept(Moditems.ALPHINIUM_SEEDS.get());
                            })
                            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}