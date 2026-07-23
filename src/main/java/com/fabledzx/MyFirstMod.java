package com.fabledzx;

import net.fabricmc.api.ModInitializer;

public class MyFirstMod implements ModInitializer {
    public static final String MOD_ID = "myfirstmod";

    @Override
    public void onInitialize() {
        ModItems.register();
        ModItems.register1();
        System.out.println("Hello Fabric World!");
    }
}