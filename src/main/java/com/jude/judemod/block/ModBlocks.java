package com.jude.judemod.block;

import com.google.common.base.Supplier;
import com.jude.judemod.JudeMod;
import com.jude.judemod.block.custom.InfernoriteFurnaceBlock;
import com.jude.judemod.block.custom.ModRotatedPillarBlock;
import com.jude.judemod.item.ModItems;
import com.jude.judemod.world.feature.tree.NebulaTreeGrower;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JudeMod.MOD_ID);
	
	public static final RegistryObject<Block> END_INFERNORITE_ORE = registerBlock("end_infernorite_ore",() -> 
	new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5f,30f).sound(SoundType.STONE).requiresCorrectToolForDrops()), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> INFERNORITE_BLOCK = registerBlock("infernorite_block",() -> 
	new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(3f,15f).sound(SoundType.METAL).requiresCorrectToolForDrops()), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> RAW_INFERNORITE_BLOCK = registerBlock("raw_infernorite_block",() -> 
	new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(3f,30f).sound(SoundType.METAL).requiresCorrectToolForDrops()), JudeMod.JUDE_TAB);

	public static final RegistryObject<Block> END_CRYNORIUM_ORE = registerBlock("end_crynorium_ore",() -> 
	new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(5f,30f).sound(SoundType.STONE).requiresCorrectToolForDrops()), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> CRYNORIUM_BLOCK = registerBlock("crynorium_block",() -> 
	new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(3f,30f).sound(SoundType.METAL).requiresCorrectToolForDrops()), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> RAW_CRYNORIUM_BLOCK = registerBlock("raw_crynorium_block",() -> 
	new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(3f,30f).sound(SoundType.METAL).requiresCorrectToolForDrops()), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> INFERNORITE_FURNACE = registerBlock("infernorite_furnace",
            () -> new InfernoriteFurnaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(3f,30f).sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()),
            JudeMod.JUDE_TAB);

	public static final RegistryObject<Block> NEBULA_SAPLING = registerBlock("nebula_sapling",() -> 
	new SaplingBlock(new NebulaTreeGrower(), BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_BLUE).instabreak().sound(SoundType.GRASS)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_LOG = registerBlock("nebula_log",() -> 
	new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),  JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_WOOD = registerBlock("nebula_wood",() -> 
	new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),  JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> STRIPPED_NEBULA_LOG = registerBlock("stripped_nebula_log",() -> 
	new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),  JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> STRIPPED_NEBULA_WOOD = registerBlock("stripped_nebula_wood",() -> 
	new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),  JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_LEAVES = registerBlock("nebula_leaves",() -> 
	new LeavesBlock( BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_PLANKS = registerBlock("nebula_planks",() -> 
	new Block( BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_STAIRS = registerBlock("nebula_stairs",() -> 
	new StairBlock(NEBULA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(1).sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_SLAB = registerBlock("nebula_slab",() -> 
	new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(1).sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_DOOR = registerBlock("nebula_door",() -> 
	new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).noOcclusion().strength(1).sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_TRAPDOOR = registerBlock("nebula_trapdoor",() -> 
	new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).noOcclusion().strength(1).sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_BUTTON = registerBlock("nebula_button",() -> 
	new StoneButtonBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(1).sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_FENCE= registerBlock("nebula_fence",() -> 
	new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(1).noCollission().sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
	public static final RegistryObject<Block> NEBULA_FENCE_GATE = registerBlock("nebula_fence_gate",() -> 
	new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(1).sound(SoundType.WOOD)), JudeMod.JUDE_TAB);
	
    		private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
			RegistryObject<T> toReturn = BLOCKS.register(name, block);
			registerBlockItem(name, toReturn, tab);
			return toReturn;
		}

			private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                   CreativeModeTab tab) {
			return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
			new Item.Properties().tab(tab)));
		}

		public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
		}
}

