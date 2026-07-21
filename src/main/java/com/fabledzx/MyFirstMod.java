package com.fabledzx;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;   // ← 注意这里

public class MyFirstMod implements ModInitializer {
    public static final String MOD_ID = "myfirstmod";
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
        // 使用 Registry.ITEM 而不是 Registries.ITEM
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_item"), CUSTOM_ITEM);
        System.out.println("模组初始化完成！");
    }
}