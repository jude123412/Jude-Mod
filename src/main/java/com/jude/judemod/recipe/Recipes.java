package com.jude.judemod.recipe;

import com.jude.judemod.JudeMod;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Recipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, JudeMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<InfernoriteFurnaceRecipe>> INFERNORITE_SMELTING_SERIALIZER =
            SERIALIZERS.register("infernorite_smelting", () -> InfernoriteFurnaceRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}