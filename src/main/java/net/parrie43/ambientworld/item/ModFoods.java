package net.parrie43.ambientworld.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties HIPPO_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .build();

    public static final FoodProperties COOKED_HIPPO_MEAT = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f)
            .build();
}
