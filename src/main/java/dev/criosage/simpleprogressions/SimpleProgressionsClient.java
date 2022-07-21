package dev.criosage.simpleprogressions;

import dev.criosage.simpleprogressions.screenhandler.CopperChestScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class SimpleProgressionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(SimpleProgressions.COPPER_CHEST_SCREEN_HANDLER, CopperChestScreen::new);
    }
}
