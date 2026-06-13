package net.nerfashton.alumina.block.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nerfashton.alumina.Alumina;
import net.nerfashton.alumina.block.ModBlocks;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Alumina.MOD_ID);

    public static final Supplier<BlockEntityType<GasBurnerBlockEntity>> GAS_BURNER_BE =
            BLOCK_ENTITIES.register("gas_burner_be", () -> BlockEntityType.Builder.of(
                    GasBurnerBlockEntity::new, ModBlocks.GAS_BURNER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
