package net.nerfashton.alumina.core.gas;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidType;

public class GasType extends FluidType {
    //Still WIP
    /**
     * Default constructor.
     *
     * @param properties the general properties of the fluid type
     */
    public GasType(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isVaporizedOnPlacement(Level level, BlockPos pos, FluidStack stack) {
        if (level.dimensionType().ultraWarm()) {
            return this == NeoForgeMod.WATER_TYPE.value() || this.getStateForPlacement(level, pos, stack).is(FluidTags.WATER);
        }
        return true;
    }
}
