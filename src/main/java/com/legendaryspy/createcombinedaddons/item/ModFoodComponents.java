package com.legendaryspy.createcombinedaddons.item;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent SPOILED_FOOD = new FoodComponent.Builder().hunger(1).build();
}
