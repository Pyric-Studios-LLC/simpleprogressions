package dev.criosage.simpleprogressions.item.custom;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.custom.ContainerType;
import dev.criosage.simpleprogressions.block.custom.GenericChestBlock;
import dev.criosage.simpleprogressions.block.entity.GenericChestEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import javax.swing.*;

public class GenericUpgradeItem extends Item {
    private UpgradeType type;
    public GenericUpgradeItem(Settings settings, UpgradeType type) {
        super(settings);
        this.type = type;
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if(world.isClient) return ActionResult.PASS;

        BlockPos blockPos = context.getBlockPos();
        Block block = world.getBlockState(blockPos).getBlock();
        BlockEntity blockEntity = world.getBlockEntity(blockPos);

        if(!(block == type.getUpgradeCondition())) return ActionResult.PASS;

        world.removeBlockEntity(blockPos);
        world.removeBlock(blockPos, false);

        BlockState blockState = type.getNextContainer().getDefaultState();
        NbtCompound inventory = blockEntity.createNbt();

        world.setBlockState(blockPos, blockState, 1);
        world.updateListeners(blockPos, blockState, blockState, 1);
        world.getBlockEntity(blockPos).readNbt(inventory);

        ItemStack itemStack = context.getStack();
        itemStack.decrement(1);

        return ActionResult.SUCCESS;
    }
}
