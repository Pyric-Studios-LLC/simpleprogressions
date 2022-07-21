package dev.criosage.simpleprogressions;

import dev.criosage.simpleprogressions.block.custom.CopperChestBlock;
import dev.criosage.simpleprogressions.block.entity.CopperChestEntity;
import dev.criosage.simpleprogressions.screenhandler.CopperChestScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
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
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static dev.criosage.simpleprogressions.item.ModItems.registerItems;

public class SimpleProgressions implements ModInitializer {
	public static final String MOD_ID = "simpleprogressions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//ItemGroups
	public static final ItemGroup SimpleProgressionsItemGroup = FabricItemGroupBuilder.build(
			new Identifier("simpleprogressions", "itemgroup"),
			() -> new ItemStack(Blocks.COBBLESTONE));
	//Blocks
	public static final Identifier COPPER_CHEST_ID = new Identifier(MOD_ID, "copper_chest.item.json");
	public static final Block COPPER_CHEST_BLOCK;
	public static final BlockItem COPPER_CHEST_ITEM;
	public static final BlockEntityType<CopperChestEntity> COPPER_CHEST_ENTITY;
	public static final ScreenHandlerType<CopperChestScreenHandler> COPPER_CHEST_SCREEN_HANDLER;
	static {
		COPPER_CHEST_BLOCK = Registry.register(Registry.BLOCK,
				COPPER_CHEST_ID,
				new CopperChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		COPPER_CHEST_ITEM = Registry.register(Registry.ITEM,
				COPPER_CHEST_ID,
				new BlockItem(COPPER_CHEST_BLOCK, new Item.Settings().group(SimpleProgressionsItemGroup)));
		COPPER_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				COPPER_CHEST_ID,
				FabricBlockEntityTypeBuilder.create(CopperChestEntity::new, COPPER_CHEST_BLOCK).build(null));
		COPPER_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(COPPER_CHEST_ID,
				CopperChestScreenHandler::new);
	}
	@Override
	public void onInitialize() {
	}
}
