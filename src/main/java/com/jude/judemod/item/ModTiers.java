package com.jude.judemod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers{
    public static final ForgeTier INFERNORITE = new ForgeTier(4, 3333, 9f,
            1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFERNORITE_INGOT.get()));
}