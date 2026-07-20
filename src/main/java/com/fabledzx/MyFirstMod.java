package com.fabledzx;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyFirstMod implements ModInitializer {

    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("fable", "custom_item"), CUSTOM_ITEM);
    }
}