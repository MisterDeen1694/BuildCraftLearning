package me.babydaisy.bclearning.item;

import me.babydaisy.bclearning.BCLearningMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BCLearningMod.MOD_ID);

    public static final RegistryObject<Item> WOOD_GEAR = ITEMS.register("wood_gear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_GEAR = ITEMS.register("stone_gear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_GEAR = ITEMS.register("gold_gear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}