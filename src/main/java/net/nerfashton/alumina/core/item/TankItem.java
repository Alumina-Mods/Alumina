package net.nerfashton.alumina.core.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class TankItem extends Item implements DispensibleContainerItem {
    //Still WIP
    public TankItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean emptyContents(@Nullable Player player, Level level, BlockPos pos, @Nullable BlockHitResult result) {
        return false;
    }

    //Holds Gas

    //Places Air block
}
