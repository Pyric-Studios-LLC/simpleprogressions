package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.entity.NetheriteChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NetheriteChestModel extends AnimatedGeoModel<NetheriteChestEntity> {
    @Override
    public Identifier getAnimationResource(NetheriteChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/netherite_chest.animation.json");
    }

    @Override
    public Identifier getModelResource(NetheriteChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/netherite_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(NetheriteChestEntity entity) {
        return new Identifier(SimpleProgressions.MOD_ID + ":textures/block/netherite_chest.png");
    }
}
