package com.jude.judemod.integration;

import javax.annotation.Nonnull;

import com.jude.judemod.JudeMod;
import com.jude.judemod.block.ModBlocks;
import com.jude.judemod.item.ModItems;
import com.jude.judemod.recipe.InfernoriteFurnaceRecipe;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class InfernoriteFurnaceRecipeCategory implements IRecipeCategory<InfernoriteFurnaceRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(JudeMod.MOD_ID, "gem_cutting");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(JudeMod.MOD_ID, "textures/gui/infernorite_furnace_gui_jei.png");

    private final IDrawable background;
    private final IDrawable icon;

    public InfernoriteFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.INFERNORITE_FURNACE.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends InfernoriteFurnaceRecipe> getRecipeClass() {
        return InfernoriteFurnaceRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Infernorite Furnace");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull InfernoriteFurnaceRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 62, 16).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 62, 52).addIngredients(Ingredient.of(ModItems.INFERNORITE_CATALYST.get()));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 98, 52).addItemStack(recipe.getResultItem());
    }
}