package dev.criosage.simpleprogressions.block.custom;

import dev.criosage.simpleprogressions.SimpleProgressions;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;

public enum ContainerType {
    COPPER(36, 4, 9, 176, 184, 8, 91,18,102,8,160,8),
    IRON(54, 6, 9, 176, 220, 8, 127,18,138,8,196,8),
    GOLD(72, 8,9, 176, 256, 8, 163,18,174,8,232,8),
    DIAMOND(88, 8, 11, 212, 252, 26,
            159,14,170,26,228,26, 8, 5),
    NETHERITE(104, 8 , 13, 248,252,44, 159, 14, 170,44, 228,44,8,5);
    int size;
    public int getSize() {return this.size;}
    int rows;
    public int getRows() {return this.rows;}
    int cols;
    public int getCols() {return this.cols;}
    int guiBackgroundWidth;

    public int getGuiBackgroundWidth() {
        return guiBackgroundWidth;
    }

    int guiBackgroundHeight;

    public int getGuiBackgroundHeight() {
        return guiBackgroundHeight;
    }

    int guiPlayerInventoryTitleX;

    public int getGuiPlayerInventoryTitleX() {
        return guiPlayerInventoryTitleX;
    }

    int guiPlayerInventoryTitleY;

    public int getGuiPlayerInventoryTitleY() {
        return guiPlayerInventoryTitleY;
    }

    int guiTitleX;

    public int getGuiTitleX() {
        return guiTitleX;
    }

    int guiTitleY;
    public int getGuiTitleY() {
        return guiTitleY;
    }
    int mOurInvSalt;

    public int getmOurInvSalt() {
        return mOurInvSalt;
    }

    int mPlaInvSalt;

    public int getmPlaInvSalt() {
        return mPlaInvSalt;
    }

    int lPlaInvSalt;
    public int getLPlaInvSalt() {
        return lPlaInvSalt;
    }
    int mHotInvSalt;
    public int getMHotInvSalt() {
        return mHotInvSalt;
    }
    int lHotInvSalt;
    public int getLHotInvSalt() {
        return lHotInvSalt;
    }
    ContainerType(int size, int rows, int cols, int guiBackgroundWidth, int guiBackgroundHeight,
                  int guiPlayerInventoryTitleX, int guiPlayerInventoryTitleY, int mOurInvSalt, int mPlaInvSalt,
                  int lPlaInvSalt, int mHotInvSalt, int lHotInvSalt) {
        this.size = size;
        this.rows = rows;
        this.cols = cols;
        this.guiBackgroundWidth = guiBackgroundWidth;
        this.guiBackgroundHeight = guiBackgroundHeight;
        this.guiPlayerInventoryTitleX = guiPlayerInventoryTitleX;
        this.guiPlayerInventoryTitleY = guiPlayerInventoryTitleY;
        this.mOurInvSalt = mOurInvSalt;
        this.mPlaInvSalt = mPlaInvSalt;
        this.lPlaInvSalt = lPlaInvSalt;
        this.mHotInvSalt = mHotInvSalt;
        this.lHotInvSalt = lHotInvSalt;
        this.guiTitleX = 8;
        this.guiTitleY = 6;
    }
    ContainerType(int size, int rows, int cols, int guiBackgroundWidth, int guiBackgroundHeight,
                  int guiPlayerInventoryTitleX, int guiPlayerInventoryTitleY, int mOurInvSalt, int mPlaInvSalt,
                  int lPlaInvSalt, int mHotInvSalt, int lHotInvSalt, int guiTitleX, int guiTitleY) {
        this.size = size;
        this.rows = rows;
        this.cols = cols;
        this.guiBackgroundWidth = guiBackgroundWidth;
        this.guiBackgroundHeight = guiBackgroundHeight;
        this.guiPlayerInventoryTitleX = guiPlayerInventoryTitleX;
        this.guiPlayerInventoryTitleY = guiPlayerInventoryTitleY;
        this.mOurInvSalt = mOurInvSalt;
        this.mPlaInvSalt = mPlaInvSalt;
        this.lPlaInvSalt = lPlaInvSalt;
        this.mHotInvSalt = mHotInvSalt;
        this.lHotInvSalt = lHotInvSalt;
        this.guiTitleX = guiTitleX;
        this.guiTitleY = guiTitleY;
    }
    public AbstractBlock.Settings getSettings() {
        return switch (this) {
            case COPPER -> FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque().strength(3f);
            case IRON -> FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque().strength(5f);
            case GOLD -> FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque().strength(3f);
            case DIAMOND -> FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque().strength(6f);
            case NETHERITE -> FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque().strength(50f);
            default -> FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque();
        };
    }

    public static Block getBlockType(ContainerType type) {
        return switch (type) {
            case COPPER -> SimpleProgressions.COPPER_CHEST_BLOCK;
            case IRON -> SimpleProgressions.IRON_CHEST_BLOCK;
            case GOLD -> SimpleProgressions.GOLD_CHEST_BLOCK;
            case DIAMOND -> SimpleProgressions.DIAMOND_CHEST_BLOCK;
            case NETHERITE -> SimpleProgressions.NETHERITE_CHEST_BLOCK;
            default -> Blocks.CHEST;
        };
    }
    public static BlockEntityType getBlockEntityType(ContainerType type) {
        return switch (type) {
            case COPPER -> SimpleProgressions.COPPER_CHEST_ENTITY;
            case IRON -> SimpleProgressions.IRON_CHEST_ENTITY;
            case GOLD -> SimpleProgressions.GOLD_CHEST_ENTITY;
            case DIAMOND -> SimpleProgressions.DIAMOND_CHEST_ENTITY;
            case NETHERITE -> SimpleProgressions.NETHERITE_CHEST_ENTITY;
            default -> BlockEntityType.CHEST;
        };
    }
    public static Identifier getStatIdentifier(ContainerType type) {
        return switch (type){
            case COPPER -> SimpleProgressions.OPEN_COPPER_CHEST;
            case IRON -> SimpleProgressions.OPEN_IRON_CHEST;
            case GOLD -> SimpleProgressions.OPEN_GOLD_CHEST;
            case DIAMOND -> SimpleProgressions.OPEN_DIAMOND_CHEST;
            case NETHERITE -> SimpleProgressions.OPEN_NETHERITE_CHEST;
            default -> Stats.OPEN_CHEST;
        };
    }
    public static ScreenHandlerType getScreenHandler(ContainerType type) {
        return switch (type){
            case COPPER -> SimpleProgressions.COPPER_CHEST_SCREEN_HANDLER;
            case IRON -> SimpleProgressions.IRON_CHEST_SCREEN_HANDLER;
            case GOLD -> SimpleProgressions.GOLD_CHEST_SCREEN_HANDLER;
            case DIAMOND -> SimpleProgressions.DIAMOND_CHEST_SCREEN_HANDLER;
            case NETHERITE -> SimpleProgressions.NETHERITE_CHEST_SCREEN_HANDLER;
            default -> ScreenHandlerType.GENERIC_3X3;
        };
    }
    public static Identifier animationResource(ContainerType type){
        return switch (type){
            case COPPER -> new Identifier(SimpleProgressions.MOD_ID, "animations/copper_chest.animation.json");
            case IRON -> new Identifier(SimpleProgressions.MOD_ID, "animations/iron_chest.animation.json");
            case GOLD -> new Identifier(SimpleProgressions.MOD_ID, "animations/gold_chest.animation.json");
            case DIAMOND -> new Identifier(SimpleProgressions.MOD_ID, "animations/diamond_chest.animation.json");
            case NETHERITE -> new Identifier(SimpleProgressions.MOD_ID, "animations/netherite_chest.animation.json");
            default -> null;
        };
    }
    public static Identifier modelResource(ContainerType type){
        return switch (type){
            case COPPER -> new Identifier(SimpleProgressions.MOD_ID, "geo/copper_chest.geo.json");
            case IRON -> new Identifier(SimpleProgressions.MOD_ID, "geo/iron_chest.geo.json");
            case GOLD -> new Identifier(SimpleProgressions.MOD_ID, "geo/gold_chest.geo.json");
            case DIAMOND -> new Identifier(SimpleProgressions.MOD_ID, "geo/diamond_chest.geo.json");
            case NETHERITE -> new Identifier(SimpleProgressions.MOD_ID, "geo/netherite_chest.geo.json");
            default -> null;
        };
    }
    public static Identifier textureResource(ContainerType type){
        return switch (type){
            case COPPER -> new Identifier(SimpleProgressions.MOD_ID, "textures/block/copper_chest.png");
            case IRON -> new Identifier(SimpleProgressions.MOD_ID, "textures/block/iron_chest.png");
            case GOLD -> new Identifier(SimpleProgressions.MOD_ID, "textures/block/gold_chest.png");
            case DIAMOND -> new Identifier(SimpleProgressions.MOD_ID, "textures/block/diamond_chest.png");
            case NETHERITE -> new Identifier(SimpleProgressions.MOD_ID, "textures/block/netherite_chest.png");
            default -> null;
        };
    }
    public static String getSpecificAnimation(ContainerType type){
        return "animation." + String.valueOf(type).toLowerCase() + "_chest";
    }
}
