package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.entity.IronChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IronChestModel extends AnimatedGeoModel<IronChestEntity> {
    @Override
    public Identifier getAnimationResource(IronChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/iron_chest.animation.json");
    }

    @Override
    public Identifier getModelResource(IronChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/iron_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(IronChestEntity entity) {
        return new Identifier(SimpleProgressions.MOD_ID + ":textures/block/iron_chest.png");
    }
}
