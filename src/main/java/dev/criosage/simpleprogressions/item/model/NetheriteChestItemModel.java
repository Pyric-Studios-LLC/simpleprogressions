package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.item.custom.NetheriteChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NetheriteChestItemModel extends AnimatedGeoModel<NetheriteChestItem> {
    @Override
    public Identifier getModelResource(NetheriteChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/netherite_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(NetheriteChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "textures/block/netherite_chest.png");
    }

    @Override
    public Identifier getAnimationResource(NetheriteChestItem animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/netherite_chest.animation.json");
    }
}
