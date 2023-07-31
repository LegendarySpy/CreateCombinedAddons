package com.legendaryspy.createcombinedaddons.item;

import com.legendaryspy.createcombinedaddons.CreateCombinedAddons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPOILED_FOOD = registerItem("spoiledfood", new Item(new FabricItemSettings().food(ModFoodComponents.SPOILED_FOOD)));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPOILED_FOOD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCombinedAddons.MOD_ID, name), item);

    }


    public static void registerModItems() {
        CreateCombinedAddons.LOGGER.info("Registering Mod Items for " + CreateCombinedAddons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
