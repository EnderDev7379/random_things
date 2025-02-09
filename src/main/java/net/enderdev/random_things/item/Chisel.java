package net.enderdev.random_things.item;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public class Chisel extends Item {

    public Chisel(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block block = level.getBlockState(pContext.getClickedPos()).getBlock();

        if (block == Blocks.STONE) {
            if (!level.isClientSide()) {
                level.setBlockAndUpdate(pContext.getClickedPos(), Blocks.STONE_BRICKS.defaultBlockState());
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.PASS;
    }
}
