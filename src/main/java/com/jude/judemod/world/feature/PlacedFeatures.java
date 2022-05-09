package com.jude.judemod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacedFeatures {
	
    public static final Holder<PlacedFeature> NEBULA_PLACED = PlacementUtils.register("nebula_placed",
            ModConfiguredFeatures.NEBULA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 1))
            );
    
    public static final Holder<PlacedFeature> END_INFERNORITE_ORE_PLACED = PlacementUtils.register(
    		"infernorite_ore_placed", 
    		ModConfiguredFeatures.END_INFERNORITE_ORE, 
    		OrePlacement.commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))
		)
	);
    public static final Holder<PlacedFeature> END_CRYNORIUM_ORE_PLACED = PlacementUtils.register(
    		"cryonic_ore_placed", 
    		ModConfiguredFeatures.END_CRYNORIUM_ORE, 
    		OrePlacement.commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))
		)
	);
}

