package com.jude.judemod.integration;

import java.util.List;
import java.util.Objects;

import com.jude.judemod.JudeMod;
import com.jude.judemod.recipe.InfernoriteFurnaceRecipe;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

@JeiPlugin
public class JEIJudeModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(JudeMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
        		InfernoriteFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        @SuppressWarnings("resource")
		RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<InfernoriteFurnaceRecipe> recipes = rm.getAllRecipesFor(InfernoriteFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(InfernoriteFurnaceRecipeCategory.UID, InfernoriteFurnaceRecipe.class), recipes);
    }
}