package me.heroicstudios.tutorialmod.block.custom;

import it.unimi.dsi.fastutil.booleans.BooleanPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.swing.*;

public class PinkGarnetLampBlock extends Block {
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");
    public PinkGarnetLampBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(CLICKED, false));
    }
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            world.setBlockState(pos, state.with(CLICKED, !state.get(CLICKED)));
        }
        return super.onUse(state, world, pos, player, hit);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(CLICKED);
    }


}
