package com.jude.judemod.world.feature.tree;

import java.util.Random;

import javax.annotation.Nullable;

import com.jude.judemod.world.feature.ModConfiguredFeatures;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class NebulaTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204307_, boolean p_204308_) {
        return ModConfiguredFeatures.NEBULA_TREE;
    }
}