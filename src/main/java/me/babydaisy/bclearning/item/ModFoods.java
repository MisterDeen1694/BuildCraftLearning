package me.babydaisy.bclearning.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY =
            new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 0.1f).fast().build();
}
