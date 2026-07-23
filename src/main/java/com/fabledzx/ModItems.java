package com.fabledzx;

import com.fabledzx.item.FirstFoodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    
    public static void register() {

        Registry.register(Registry.ITEM,new Identifier("fable", "custom_item"),CUSTOM_ITEM);
    
    }

    public static final Item FIRSTFOOD_ITEM = new FirstFoodItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()));

    public static void register1() {

        Registry.register(Registry.ITEM,new Identifier("fable","my_first_food"),FIRSTFOOD_ITEM);

    }
}
