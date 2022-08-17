package dev.criosage.simpleprogressions;

import dev.criosage.simpleprogressions.block.renderer.*;
import dev.criosage.simpleprogressions.item.renderer.*;
import dev.criosage.simpleprogressions.screenhandler.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class SimpleProgressionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoItemRenderer.registerItemRenderer(SimpleProgressions.COPPER_CHEST_ITEM, new CopperChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.COPPER_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new CopperChestRenderer());
        ScreenRegistry.register(SimpleProgressions.COPPER_CHEST_SCREEN_HANDLER, CopperChestScreen::new);

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.IRON_CHEST_ITEM, new IronChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.IRON_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new IronChestRenderer());
        ScreenRegistry.register(SimpleProgressions.IRON_CHEST_SCREEN_HANDLER, IronChestScreen::new);

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.GOLD_CHEST_ITEM, new GoldChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.GOLD_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GoldChestRenderer());
        ScreenRegistry.register(SimpleProgressions.GOLD_CHEST_SCREEN_HANDLER, GoldChestScreen::new);

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.DIAMOND_CHEST_ITEM, new DiamondChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.DIAMOND_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new DiamondChestRenderer());
        ScreenRegistry.register(SimpleProgressions.DIAMOND_CHEST_SCREEN_HANDLER, DiamondChestScreen::new);

        GeoItemRenderer.registerItemRenderer(SimpleProgressions.NETHERITE_CHEST_ITEM, new NetheriteChestItemRenderer());
        BlockEntityRendererRegistry.register(SimpleProgressions.NETHERITE_CHEST_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new NetheriteChestRenderer());
        ScreenRegistry.register(SimpleProgressions.NETHERITE_CHEST_SCREEN_HANDLER, NetheriteChestScreen::new);
    }
}
