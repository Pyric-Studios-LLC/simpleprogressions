package dev.criosage.simpleprogressions;

import dev.criosage.simpleprogressions.block.custom.*;
import dev.criosage.simpleprogressions.block.entity.*;
import dev.criosage.simpleprogressions.item.custom.*;
import dev.criosage.simpleprogressions.screenhandler.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
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
	public static final BlockEntityType<CopperChestEntity> COPPER_CHEST_ENTITY;
	public static final ScreenHandlerType<CopperChestScreenHandler> COPPER_CHEST_SCREEN_HANDLER;
	//ItemGroups
	public static final ItemGroup SimpleProgressionsItemGroup;
	public static final Identifier OPEN_COPPER_CHEST = new Identifier(MOD_ID, "open_copper_chest");
	static {
		SimpleProgressionsItemGroup = FabricItemGroupBuilder.build(
				new Identifier("simpleprogressions", "itemgroup"),
				() -> new ItemStack(SimpleProgressions.COPPER_CHEST_ITEM));
		COPPER_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				COPPER_CHEST_ID,
				new CopperChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		COPPER_CHEST_ITEM = Registry.register(Registry.ITEM,
				COPPER_CHEST_ID,
				new CopperChestItem(COPPER_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup)));
		COPPER_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				COPPER_CHEST_ID,
				FabricBlockEntityTypeBuilder.create(CopperChestEntity::new, COPPER_CHEST_BLOCK).build(null));
		COPPER_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(COPPER_CHEST_ID,
				CopperChestScreenHandler::new);
		Registry.register(Registry.CUSTOM_STAT, "open_copper_chest", OPEN_COPPER_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_COPPER_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Copper Chest

	//region Iron Chest Region
	public static final Identifier IRON_CHEST_ID = new Identifier(MOD_ID, "iron_chest");
	public static final Block IRON_CHEST_BLOCK;
	public static final BlockItem IRON_CHEST_ITEM;
	public static final BlockEntityType<IronChestEntity> IRON_CHEST_ENTITY;
	public static final ScreenHandlerType<IronChestScreenHandler> IRON_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_IRON_CHEST = new Identifier(MOD_ID, "open_iron_chest");
	static {
		IRON_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				IRON_CHEST_ID,
				new IronChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		IRON_CHEST_ITEM = Registry.register(Registry.ITEM,
				IRON_CHEST_ID,
				new IronChestItem(IRON_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup)));
		IRON_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				IRON_CHEST_ID,
				FabricBlockEntityTypeBuilder.create(IronChestEntity::new, IRON_CHEST_BLOCK).build(null));
		IRON_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(IRON_CHEST_ID,
				IronChestScreenHandler::new);
		Registry.register(Registry.CUSTOM_STAT, "open_iron_chest", OPEN_IRON_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_IRON_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Iron Chest Region

	//region Gold Chest Region
	public static final Identifier GOLD_CHEST_ID = new Identifier(MOD_ID, "gold_chest");
	public static final Block GOLD_CHEST_BLOCK;
	public static final BlockItem GOLD_CHEST_ITEM;
	public static final BlockEntityType<GoldChestEntity> GOLD_CHEST_ENTITY;
	public static final ScreenHandlerType<GoldChestScreenHandler> GOLD_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_GOLD_CHEST = new Identifier(MOD_ID, "open_gold_chest");
	static {
		GOLD_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				GOLD_CHEST_ID,
				new GoldChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		GOLD_CHEST_ITEM = Registry.register(Registry.ITEM,
				GOLD_CHEST_ID,
				new GoldChestItem(GOLD_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup)));
		GOLD_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				GOLD_CHEST_ID,
				FabricBlockEntityTypeBuilder.create(GoldChestEntity::new, GOLD_CHEST_BLOCK).build(null));
		GOLD_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(GOLD_CHEST_ID,
				GoldChestScreenHandler::new);
		Registry.register(Registry.CUSTOM_STAT, "open_gold_chest", OPEN_GOLD_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_GOLD_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Gold Chest Region

	//region Diamond Chest Region
	public static final Identifier DIAMOND_CHEST_ID = new Identifier(MOD_ID, "diamond_chest");
	public static final Block DIAMOND_CHEST_BLOCK;
	public static final BlockItem DIAMOND_CHEST_ITEM;
	public static final BlockEntityType<DiamondChestEntity> DIAMOND_CHEST_ENTITY;
	public static final ScreenHandlerType<DiamondChestScreenHandler> DIAMOND_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_DIAMOND_CHEST = new Identifier(MOD_ID, "open_diamond_chest");
	static {
		DIAMOND_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				DIAMOND_CHEST_ID,
				new DiamondChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		DIAMOND_CHEST_ITEM = Registry.register(Registry.ITEM,
				DIAMOND_CHEST_ID,
				new DiamondChestItem(DIAMOND_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup)));
		DIAMOND_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				DIAMOND_CHEST_ID,
				FabricBlockEntityTypeBuilder.create(DiamondChestEntity::new, DIAMOND_CHEST_BLOCK).build(null));
		DIAMOND_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(DIAMOND_CHEST_ID,
				DiamondChestScreenHandler::new);
		Registry.register(Registry.CUSTOM_STAT, "open_diamond_chest", OPEN_DIAMOND_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_DIAMOND_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Diamond Chest Region

	//region Netherite Chest Region
	public static final Identifier NETHERITE_CHEST_ID = new Identifier(MOD_ID, "netherite_chest");
	public static final Block NETHERITE_CHEST_BLOCK;
	public static final BlockItem NETHERITE_CHEST_ITEM;
	public static final BlockEntityType<NetheriteChestEntity> NETHERITE_CHEST_ENTITY;
	public static final ScreenHandlerType<NetheriteChestScreenHandler> NETHERITE_CHEST_SCREEN_HANDLER;
	public static final Identifier OPEN_NETHERITE_CHEST = new Identifier(MOD_ID, "open_netherite_chest");
	static {
		NETHERITE_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				NETHERITE_CHEST_ID,
				new NetheriteChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		NETHERITE_CHEST_ITEM = Registry.register(Registry.ITEM,
				NETHERITE_CHEST_ID,
				new NetheriteChestItem(NETHERITE_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup)));
		NETHERITE_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				NETHERITE_CHEST_ID,
				FabricBlockEntityTypeBuilder.create(NetheriteChestEntity::new, NETHERITE_CHEST_BLOCK).build(null));
		NETHERITE_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(NETHERITE_CHEST_ID,
				NetheriteChestScreenHandler::new);
		Registry.register(Registry.CUSTOM_STAT, "open_netherite_chest", OPEN_NETHERITE_CHEST);
		Stats.CUSTOM.getOrCreateStat(OPEN_GOLD_CHEST, StatFormatter.DEFAULT);
	}
	//endregion Netherite Chest Region
	@Override
	public void onInitialize() {

	}
}
