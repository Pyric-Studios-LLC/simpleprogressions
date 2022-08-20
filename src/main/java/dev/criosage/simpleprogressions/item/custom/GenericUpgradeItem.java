package dev.criosage.simpleprogressions.item.custom;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.custom.ContainerType;
import dev.criosage.simpleprogressions.block.custom.GenericChestBlock;
import dev.criosage.simpleprogressions.block.entity.GenericChestEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;
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
        if(context.getWorld().isClient) return ActionResult.FAIL;
        Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
        if(!(block instanceof GenericChestBlock)) return ActionResult.FAIL;
        if(block == type.getUpgradeCondition()) {
            context.getWorld().setBlockState(
                    context.getBlockPos(),
                    type.getNextContainer().getDefaultState()
            );
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }
}
