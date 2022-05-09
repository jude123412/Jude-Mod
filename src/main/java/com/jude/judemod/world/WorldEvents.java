package com.jude.judemod.world;

import com.jude.judemod.JudeMod;
import com.jude.judemod.world.gen.OreGeneration;
import com.jude.judemod.world.gen.TreeGeneration;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JudeMod.MOD_ID)
public class WorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event
		) {
    	OreGeneration.generateOverworldOres(event);
    	TreeGeneration.generateTrees(event);
    }
}