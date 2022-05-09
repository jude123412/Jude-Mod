package com.jude.judemod.block.entity;

import com.jude.judemod.JudeMod;
import com.jude.judemod.block.ModBlocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, JudeMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<InfernoriteFurnaceBlockEntity>> INFERNORITE_FURNACE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("infernorite_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(InfernoriteFurnaceBlockEntity::new,
                            ModBlocks.INFERNORITE_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}