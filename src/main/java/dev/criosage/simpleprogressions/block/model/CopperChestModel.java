package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.entity.CopperChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CopperChestModel extends AnimatedGeoModel<CopperChestEntity> {
    @Override
    public Identifier getAnimationResource(CopperChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/copper_chest.animation.json");
    }

    @Override
    public Identifier getModelResource(CopperChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/copper_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(CopperChestEntity entity) {
        return new Identifier(SimpleProgressions.MOD_ID + ":textures/block/copper_chest.png");
    }
}
