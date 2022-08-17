package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.entity.DiamondChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DiamondChestModel extends AnimatedGeoModel<DiamondChestEntity> {
    @Override
    public Identifier getAnimationResource(DiamondChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/diamond_chest.animation.json");
    }

    @Override
    public Identifier getModelResource(DiamondChestEntity animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/diamond_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(DiamondChestEntity entity) {
        return new Identifier(SimpleProgressions.MOD_ID + ":textures/block/diamond_chest.png");
    }
}
