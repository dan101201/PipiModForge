package com.tadayo.pipimodforge;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    public static final DeferredRegister ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PipiModForge.MODID);

    public static final RegistryObject<Item> HUMAN_FLESH = ITEMS.register("human_flesh", () -> new Item(new Item.Properties()
            .food(Foods.HUMAN_FLESH)));

    public static class Foods {
        public static final FoodProperties HUMAN_FLESH = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.1F)
                .meat()
                .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F)
                .effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 0.8F)
                .build();
    }
}
