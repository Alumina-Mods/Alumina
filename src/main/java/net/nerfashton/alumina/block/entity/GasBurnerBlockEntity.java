package net.nerfashton.alumina.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class GasBurnerBlockEntity extends BlockEntity {
    public GasBurnerBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.GAS_BURNER_BE.get(), pos, blockState);
    }
}
