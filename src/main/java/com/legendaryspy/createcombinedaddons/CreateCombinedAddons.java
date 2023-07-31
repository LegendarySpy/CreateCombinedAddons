package com.legendaryspy.createcombinedaddons;

import net.fabricmc.api.ModInitializer;

import com.legendaryspy.createcombinedaddons.item.ModItems;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCombinedAddons implements ModInitializer {
	public static final String MOD_ID = "createcombinedaddons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.SPOILED_FOOD, 0.5f);
	}
}