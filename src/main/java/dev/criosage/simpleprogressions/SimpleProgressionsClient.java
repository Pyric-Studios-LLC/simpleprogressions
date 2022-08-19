package dev.criosage.simpleprogressions;

import dev.criosage.simpleprogressions.block.custom.ContainerType;
import dev.criosage.simpleprogressions.block.renderer.*;
import dev.criosage.simpleprogressions.item.renderer.*;
import dev.criosage.simpleprogressions.screenhandler.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class SimpleProgressionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoItemRenderer.registerItemRenderer(SimpleProgressions.COPPER_CHEST_ITEM, new GenericChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.COPPER_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GenericChestRenderer());
        ScreenRegistry.register(SimpleProgressions.COPPER_CHEST_SCREEN_HANDLER, (GenericContainerScreenHandler handler, PlayerInventory inventory, Text title) -> {
            return new GenericContainerScreen(handler, inventory, title, ContainerType.COPPER);
        });

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.IRON_CHEST_ITEM, new GenericChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.IRON_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GenericChestRenderer());
        ScreenRegistry.register(SimpleProgressions.IRON_CHEST_SCREEN_HANDLER, (GenericContainerScreenHandler handler, PlayerInventory inventory, Text title) -> {
            return new GenericContainerScreen(handler, inventory, title, ContainerType.IRON);
        });

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.GOLD_CHEST_ITEM, new GenericChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.GOLD_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GenericChestRenderer());
        ScreenRegistry.register(SimpleProgressions.GOLD_CHEST_SCREEN_HANDLER, (GenericContainerScreenHandler handler, PlayerInventory inventory, Text title) -> {
            return new GenericContainerScreen(handler, inventory, title, ContainerType.GOLD);
        });

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.DIAMOND_CHEST_ITEM, new GenericChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.DIAMOND_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GenericChestRenderer());
        ScreenRegistry.register(SimpleProgressions.DIAMOND_CHEST_SCREEN_HANDLER, (GenericContainerScreenHandler handler, PlayerInventory inventory, Text title) -> {
            return new GenericContainerScreen(handler, inventory, title, ContainerType.DIAMOND);
        });

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.NETHERITE_CHEST_ITEM, new GenericChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.NETHERITE_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GenericChestRenderer());
        ScreenRegistry.register(SimpleProgressions.NETHERITE_CHEST_SCREEN_HANDLER, (GenericContainerScreenHandler handler, PlayerInventory inventory, Text title) -> {
            return new GenericContainerScreen(handler, inventory, title, ContainerType.NETHERITE);
        });
    }
}
