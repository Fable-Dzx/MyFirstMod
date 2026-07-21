package com.fabledzx;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    
    public static void register() {

        Registry.register(Registry.ITEM,new Identifier("fable", "custom_item"),CUSTOM_ITEM);
    
    }
}
