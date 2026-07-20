package com.fabledzx.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.sound.SoundEvents;

public class CustomItem extends Item{

    public CustomItem(Settings settings) {
        super(settings);
    }

    @Override
public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    if (!world.isClient) {
    world.playSound(null, user.getX(), user.getY(), user.getZ(),
        SoundEvents.BLOCK_WOOL_BREAK, user.getSoundCategory(), 1.0f, 1.0f);
}
    return TypedActionResult.success(user.getStackInHand(hand));
}
}