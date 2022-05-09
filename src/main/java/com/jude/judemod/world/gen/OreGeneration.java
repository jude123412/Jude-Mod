package com.jude.judemod.world.gen;

import java.util.List;

import com.jude.judemod.world.feature.PlacedFeatures;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
	public static void generateOverworldOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(PlacedFeatures.END_INFERNORITE_ORE_PLACED);
        base.add(PlacedFeatures.END_CRYNORIUM_ORE_PLACED);
    }
}
