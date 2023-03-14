package com.tadayo.pipimodforge.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HumanFlesh extends Item {
    public HumanFlesh(Properties properties) {
        super(properties.food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).meat().build()));
    }
}
