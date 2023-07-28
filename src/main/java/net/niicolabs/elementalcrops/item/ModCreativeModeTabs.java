package net.niicolabs.elementalcrops.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.niicolabs.elementalcrops.ElementalCrops;
import net.niicolabs.elementalcrops.item.Custom.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementalCrops.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELEMENTALCROPS_TAB =
            CREATIVE_MODE_TABS.register("elementalcrops_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.TIER_1_ESSENCE.get()))
                            .title(Component.translatable("creativetab.elementalcrops.tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(Moditems.TIER_1_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_2_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_3_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_4_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_5_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_6_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_7_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_8_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_9_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_10_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_11_ESSENCE.get());
                                pOutput.accept(Moditems.TIER_12_ESSENCE.get());

                                pOutput.accept(Moditems.TIER_1_SEEDS.get());
                                pOutput.accept(Moditems.TIER_2_SEEDS.get());
                                pOutput.accept(Moditems.TIER_3_SEEDS.get());
                                pOutput.accept(Moditems.TIER_4_SEEDS.get());
                                pOutput.accept(Moditems.TIER_5_SEEDS.get());
                                pOutput.accept(Moditems.TIER_6_SEEDS.get());
                                pOutput.accept(Moditems.TIER_7_SEEDS.get());
                                pOutput.accept(Moditems.TIER_8_SEEDS.get());
                                pOutput.accept(Moditems.TIER_9_SEEDS.get());
                                pOutput.accept(Moditems.TIER_10_SEEDS.get());
                                pOutput.accept(Moditems.TIER_11_SEEDS.get());
                                pOutput.accept(Moditems.TIER_12_SEEDS.get());

                                pOutput.accept(Moditems.BASIC_CONVERSION_CRYSTAL.get());
                                pOutput.accept(Moditems.ADVANCED_CONVERSION_CRYSTAL.get());
                                pOutput.accept(Moditems.MASTER_CONVERSION_CRYSTAL.get());
                                pOutput.accept(Moditems.PERFECTED_CONVERSION_CRYSTAL.get());
                                pOutput.accept(Moditems.PRIMAL_CONVERSION_CRYSTAL.get());

                                pOutput.accept(ModBlocks.TIER_1_ESSENCE_BLOCK.get());

                            })
                            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
