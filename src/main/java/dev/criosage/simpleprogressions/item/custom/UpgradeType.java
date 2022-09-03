package dev.criosage.simpleprogressions.item.custom;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.mojang.serialization.Decoder;
import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.custom.ContainerType;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.ChestType;

public enum UpgradeType {
    COPPER(Blocks.CHEST),
    IRON(SimpleProgressions.COPPER_CHEST_BLOCK),
    GOLD(SimpleProgressions.IRON_CHEST_BLOCK),
    DIAMOND(SimpleProgressions.GOLD_CHEST_BLOCK),
    NETHERITE(SimpleProgressions.DIAMOND_CHEST_BLOCK);

    Block upgradeCondition;
    public Block getUpgradeCondition() {
        return this.upgradeCondition;
    }
    UpgradeType(Block upgradeCondition) {
        this.upgradeCondition = upgradeCondition;
    }
    public ContainerType getContainerType(){
        return switch (this) {
            case COPPER -> ContainerType.COPPER;
            case IRON -> ContainerType.IRON;
            case GOLD -> ContainerType.GOLD;
            case DIAMOND -> ContainerType.DIAMOND;
            case NETHERITE -> ContainerType.NETHERITE;
            default -> null;
        };
    }
    public Block getNextContainer() {
        return switch (this) {
            case COPPER -> SimpleProgressions.COPPER_CHEST_BLOCK;
            case IRON -> SimpleProgressions.IRON_CHEST_BLOCK;
            case GOLD -> SimpleProgressions.GOLD_CHEST_BLOCK;
            case DIAMOND -> SimpleProgressions.DIAMOND_CHEST_BLOCK;
            case NETHERITE -> SimpleProgressions.NETHERITE_CHEST_BLOCK;
            default -> null;
        };
    }
}
