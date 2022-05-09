package com.jude.judemod.item;

import com.google.common.base.Supplier;
import com.jude.judemod.JudeMod;
import com.jude.judemod.item.armor.ArmorMaterialInfernorite;
import com.jude.judemod.item.custom.ModArmorItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	//Item
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JudeMod.MOD_ID);
	
	public static final RegistryObject<Item> INFERNORITE_INGOT = register("infernorite_ingot", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<Item> RAW_INFERNORITE = register("raw_infernorite", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<Item> CRYNORIUM_INGOT = register("crynorium_ingot", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<Item> CRYNORIUM_ROD= register("crynorium_rod", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<Item> RAW_CRYNORIUM= register("raw_crynorium", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<Item> INFERNORITE_CATALYST= register("infernorite_catalyst", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<Item> NEBULA_STICKs= register("nebula_sticks", () -> new Item(new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	// Tool
	
	public static final RegistryObject<SwordItem> INFERNORITE_SWORD = ITEMS.register("infernorite_sword", () -> new SwordItem(ModTiers.INFERNORITE, 8, -2.4f, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<PickaxeItem> INFERNORITE_PICKAXE = ITEMS.register("infernorite_pickaxe",() -> new PickaxeItem(ModTiers.INFERNORITE, 6, -2.8f, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<AxeItem> INFERNORITE_AXE = ITEMS.register("infernorite_axe", () -> new AxeItem(ModTiers.INFERNORITE, 8, -3f, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<HoeItem> INFERNORITE_HOE = ITEMS.register("infernorite_hoe", () -> new HoeItem(ModTiers.INFERNORITE, -1, 0f, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<ShovelItem> INFERNORITE_SHOVEL = ITEMS.register("infernorite_shovel", () -> new ShovelItem(ModTiers.INFERNORITE, 6.5f, -3f, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	// Armour
	
	public static final RegistryObject<ArmorItem> INFERNORITE_BOOTS = ITEMS.register("infernorite_boots", () -> new ArmorItem(ArmorMaterialInfernorite.INFERNORITE,EquipmentSlot.FEET, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<ArmorItem> INFERNORITE_LEGGINGS = ITEMS.register("infernorite_leggings", () -> new ArmorItem(ArmorMaterialInfernorite.INFERNORITE,EquipmentSlot.LEGS, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<ArmorItem> INFERNORITE_CHESTPLATE = ITEMS.register("infernorite_chestplate", () -> new ArmorItem(ArmorMaterialInfernorite.INFERNORITE,EquipmentSlot.CHEST, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	public static final RegistryObject<ArmorItem> INFERNORITE_HELMET = ITEMS.register("infernorite_helmet", () -> new ModArmorItem(ArmorMaterialInfernorite.INFERNORITE,EquipmentSlot.HEAD, new Item.Properties().tab(JudeMod.JUDE_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}