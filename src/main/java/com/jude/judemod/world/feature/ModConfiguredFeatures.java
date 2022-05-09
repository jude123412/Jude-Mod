package com.jude.judemod.world.feature;

import java.util.List;

import com.jude.judemod.block.ModBlocks;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModConfiguredFeatures {
	   
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> NEBULA_TREE =
            FeatureUtils.register("nebula", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.NEBULA_LOG.get()),
                    new StraightTrunkPlacer(7, 8, 6),
                    BlockStateProvider.simple(ModBlocks.NEBULA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 5),
                    new TwoLayersFeatureSize(2, 0, 2)).dirt(BlockStateProvider.simple(Blocks.END_STONE)).build());

    public static final Holder<PlacedFeature> NEBULA_CHECKED = PlacementUtils.register("nebula_checked", NEBULA_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.NEBULA_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> NEBULA_SPAWN =
            FeatureUtils.register("nebula_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(NEBULA_CHECKED,
                            0.5F)), NEBULA_CHECKED));
    
    public static final List<OreConfiguration.TargetBlockState> END_INFERNORITE_ORES = List.of(
            OreConfiguration.target(ModOreFeatures.END_STONE_REPLACEABLES,
    		ModBlocks.END_INFERNORITE_ORE.get().defaultBlockState())
    );
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_INFERNORITE_ORE = FeatureUtils.register(
    		"end_infernorite_ore",
            Feature.ORE, 
            new OreConfiguration(END_INFERNORITE_ORES, 8)
    );
    public static final List<OreConfiguration.TargetBlockState> END_CRYNORIUM_ORES = List.of(
            OreConfiguration.target(ModOreFeatures.END_STONE_REPLACEABLES,
    		ModBlocks.END_CRYNORIUM_ORE.get().defaultBlockState())
    );
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_CRYNORIUM_ORE = FeatureUtils.register(
    		"end_crynorium_ore",
            Feature.ORE, 
            new OreConfiguration(END_CRYNORIUM_ORES, 9)
    );
}