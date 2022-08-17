package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.entity.GoldChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoldChestModel extends AnimatedGeoModel<GoldChestEntity> {
    @Override
    public Identifier getAnimationResource(GoldChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/gold_chest.animation.json");
    }

    @Override
    public Identifier getModelResource(GoldChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/gold_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(GoldChestEntity entity) {
        return new Identifier(SimpleProgressions.MOD_ID + ":textures/block/gold_chest.png");
    }
}
