package dev.criosage.simpleprogressions;

import dev.criosage.simpleprogressions.block.custom.*;
import dev.criosage.simpleprogressions.block.entity.*;
import dev.criosage.simpleprogressions.item.custom.*;
import dev.criosage.simpleprogressions.screenhandler.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProgressions implements ModInitializer {
	public static final String MOD_ID = "simpleprogressions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//region Copper Chest Region
	public static final Identifier COPPER_CHEST_ID = new Identifier(MOD_ID, "copper_chest");
	public static final Block COPPER_CHEST_BLOCK;
	public static final BlockItem COPPER_CHEST_ITEM;
	public static final BlockEntityType<GenericChestEntity> COPPER_CHEST_ENTITY;
	public static final ScreenHandlerType<GenericContainerScreenHandler> COPPER_CHEST_SCREEN_HANDLER;
	public static final ItemGroup SimpleProgressionsItemGroup;
	public static final Identifier OPEN_COPPER_CHEST = new Identifier(MOD_ID, "open_copper_chest");
	static {
		COPPER_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				COPPER_CHEST_ID,
				new GenericChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), ContainerType.COPPER));
		SimpleProgressionsItemGroup = FabricItemGroupBuilder.build(
				new Identifier("simpleprogressions", "itemgroup"),
				() -> new ItemStack(SimpleProgressions.COPPER_CHEST_ITEM));
		COPPER_CHEST_ITEM = Registry.register(Registry.ITEM,
				COPPER_CHEST_ID,
				new GenericChestItem(COPPER_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup), ContainerType.COPPER));
		COPPER_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				COPPER_CHEST_ID,
				FabricBlockEntityTypeBuilder.create((BlockPos pos, BlockState state) -> {
					return new GenericChestEntity(pos, state, ContainerType.COPPER);
				}, COPPER_CHEST_BLOCK).build(null));
		COPPER_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(COPPER_CHEST_ID, (int syncId, PlayerInventory playerInventory) -> {
			return new GenericContainerScreenHandler(syncId, playerInventory, ContainerType.COPPER);
		});
		Registry.register(Registry.CUSTOM_STAT, "open_copper_chest", OPEN_COPPER_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_COPPER_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Copper Chest

	//region Iron Chest Region
	public static final Identifier IRON_CHEST_ID = new Identifier(MOD_ID, "iron_chest");
	public static final Block IRON_CHEST_BLOCK;
	public static final BlockItem IRON_CHEST_ITEM;
	public static final BlockEntityType<GenericChestEntity> IRON_CHEST_ENTITY;
	public static final ScreenHandlerType<GenericContainerScreenHandler> IRON_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_IRON_CHEST = new Identifier(MOD_ID, "open_iron_chest");
	static {
		IRON_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				IRON_CHEST_ID,
				new GenericChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), ContainerType.IRON));
		IRON_CHEST_ITEM = Registry.register(Registry.ITEM,
				IRON_CHEST_ID,
				new GenericChestItem(IRON_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup), ContainerType.IRON));
		IRON_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				IRON_CHEST_ID,
				FabricBlockEntityTypeBuilder.create((BlockPos pos, BlockState state) -> {
					return new GenericChestEntity(pos, state, ContainerType.IRON);
				}, IRON_CHEST_BLOCK).build(null));
		IRON_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(IRON_CHEST_ID, (int syncId, PlayerInventory playerInventory) -> {
					return new GenericContainerScreenHandler(syncId, playerInventory, ContainerType.IRON);
				});
		Registry.register(Registry.CUSTOM_STAT, "open_iron_chest", OPEN_IRON_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_IRON_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Iron Chest Region

	//region Gold Chest Region
	public static final Identifier GOLD_CHEST_ID = new Identifier(MOD_ID, "gold_chest");
	public static final Block GOLD_CHEST_BLOCK;
	public static final BlockItem GOLD_CHEST_ITEM;
	public static final BlockEntityType<GenericChestEntity> GOLD_CHEST_ENTITY;
	public static final ScreenHandlerType<GenericContainerScreenHandler> GOLD_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_GOLD_CHEST = new Identifier(MOD_ID, "open_gold_chest");
	static {
		GOLD_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				GOLD_CHEST_ID,
				new GenericChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), ContainerType.GOLD));
		GOLD_CHEST_ITEM = Registry.register(Registry.ITEM,
				GOLD_CHEST_ID,
				new GenericChestItem(GOLD_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup), ContainerType.GOLD));
		GOLD_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				GOLD_CHEST_ID,
				FabricBlockEntityTypeBuilder.create((BlockPos pos, BlockState state) -> {
					return new GenericChestEntity(pos, state, ContainerType.GOLD);
				}, GOLD_CHEST_BLOCK).build(null));
		GOLD_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(GOLD_CHEST_ID, (int syncId, PlayerInventory playerInventory) -> {
			return new GenericContainerScreenHandler(syncId, playerInventory, ContainerType.GOLD);
		});
		Registry.register(Registry.CUSTOM_STAT, "open_gold_chest", OPEN_GOLD_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_GOLD_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Gold Chest Region

	//region Diamond Chest Region
	public static final Identifier DIAMOND_CHEST_ID = new Identifier(MOD_ID, "diamond_chest");
	public static final Block DIAMOND_CHEST_BLOCK;
	public static final BlockItem DIAMOND_CHEST_ITEM;
	public static final BlockEntityType<GenericChestEntity> DIAMOND_CHEST_ENTITY;
	public static final ScreenHandlerType<GenericContainerScreenHandler> DIAMOND_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_DIAMOND_CHEST = new Identifier(MOD_ID, "open_diamond_chest");
	static {
		DIAMOND_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				DIAMOND_CHEST_ID,
				new GenericChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), ContainerType.DIAMOND));
		DIAMOND_CHEST_ITEM = Registry.register(Registry.ITEM,
				DIAMOND_CHEST_ID,
				new GenericChestItem(DIAMOND_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup), ContainerType.DIAMOND));
		DIAMOND_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				DIAMOND_CHEST_ID,
				FabricBlockEntityTypeBuilder.create((BlockPos pos, BlockState state) -> {
					return new GenericChestEntity(pos, state, ContainerType.DIAMOND);
				}, DIAMOND_CHEST_BLOCK).build(null));
		DIAMOND_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(DIAMOND_CHEST_ID, (int syncId, PlayerInventory playerInventory) -> {
			return new GenericContainerScreenHandler(syncId, playerInventory, ContainerType.DIAMOND);
		});
		Registry.register(Registry.CUSTOM_STAT, "open_diamond_chest", OPEN_DIAMOND_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_DIAMOND_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Diamond Chest Region

	//region Netherite Chest Region
	public static final Identifier NETHERITE_CHEST_ID = new Identifier(MOD_ID, "netherite_chest");
	public static final Block NETHERITE_CHEST_BLOCK;
	public static final BlockItem NETHERITE_CHEST_ITEM;
	public static final BlockEntityType<GenericChestEntity> NETHERITE_CHEST_ENTITY;
	public static final ScreenHandlerType<GenericContainerScreenHandler> NETHERITE_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_NETHERITE_CHEST = new Identifier(MOD_ID, "open_netherite_chest");
	static {
		NETHERITE_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				NETHERITE_CHEST_ID,
				new GenericChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), ContainerType.NETHERITE));
		NETHERITE_CHEST_ITEM = Registry.register(Registry.ITEM,
				NETHERITE_CHEST_ID,
				new GenericChestItem(NETHERITE_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup), ContainerType.NETHERITE));
		NETHERITE_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				NETHERITE_CHEST_ID,
				FabricBlockEntityTypeBuilder.create((BlockPos pos, BlockState state) -> {
					return new GenericChestEntity(pos, state, ContainerType.NETHERITE);
				}, NETHERITE_CHEST_BLOCK).build(null));
		NETHERITE_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(NETHERITE_CHEST_ID, (int syncId, PlayerInventory playerInventory) -> {
			return new GenericContainerScreenHandler(syncId, playerInventory, ContainerType.NETHERITE);
		});
		Registry.register(Registry.CUSTOM_STAT, "open_netherite_chest", OPEN_NETHERITE_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_NETHERITE_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Netherite Chest Region
	@Override
	public void onInitialize() {

	}
}
