package com.jude.judemod;



import com.jude.judemod.block.ModBlocks;
import com.jude.judemod.block.entity.BlockEntities;
import com.jude.judemod.item.ModItems;
import com.jude.judemod.recipe.Recipes;
import com.jude.judemod.screen.InfernoriteFurnaceScreen;
import com.jude.judemod.screen.MenuTypes;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("judemod")

public class JudeMod {
	
	public static final String MOD_ID = "judemod";
	
	public static CreativeModeTab JUDE_TAB = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.INFERNORITE_INGOT.get()
			);
		}
	};
	
	public JudeMod() {
			IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
			ModBlocks.BLOCKS.register(bus);
			ModItems.ITEMS.register(bus);
			BlockEntities.register(bus);
			MenuTypes.register(bus);
			Recipes.register(bus);
			
	        bus.addListener(this::clientSetup);
			
			MinecraftForge.EVENT_BUS.register(this);
			
			}
	 private void clientSetup (final FMLClientSetupEvent event) {

	        MenuScreens.register(MenuTypes.INFERNORITE_FURNACE_MENU.get(), InfernoriteFurnaceScreen::new);
	        
	        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEBULA_SAPLING.get(), RenderType.cutout());
	        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEBULA_LEAVES.get(), RenderType.cutout());
	        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEBULA_DOOR.get(), RenderType.translucent());
	        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEBULA_TRAPDOOR.get(), RenderType.translucent());
	    }
	}
