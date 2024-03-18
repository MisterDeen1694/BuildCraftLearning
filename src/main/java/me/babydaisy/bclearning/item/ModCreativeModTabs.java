package me.babydaisy.bclearning.item;

import me.babydaisy.bclearning.BCLearningMod;
import me.babydaisy.bclearning.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab>
            CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BCLearningMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BC_LEARNING_TAB =
            CREATIVE_MODE_TABS.register("bc_learning", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.WOOD_GEAR.get()))
                    .title(Component.translatable("creativetab.bc_learning_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WOOD_GEAR.get());
                        output.accept(ModItems.STONE_GEAR.get());
                        output.accept(ModItems.IRON_GEAR.get());
                        output.accept(ModItems.GOLD_GEAR.get());
                        output.accept(ModItems.DIAMOND_GEAR.get());

                        output.accept(ModItems.WRENCH.get());

                        output.accept(ModBlocks.QUARRY.get());
                        output.accept(ModBlocks.PUMP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
