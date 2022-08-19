package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.block.custom.ChestType;
import dev.criosage.simpleprogressions.block.entity.GenericChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GenericChestModel extends AnimatedGeoModel<GenericChestEntity> {
    @Override
    public Identifier getAnimationResource(GenericChestEntity animatable) {
        return ChestType.animationResource(animatable.type);
    }

    @Override
    public Identifier getModelResource(GenericChestEntity animatable) {
        return ChestType.modelResource(animatable.type);
    }

    @Override
    public Identifier getTextureResource(GenericChestEntity entity) {
        return ChestType.textureResource(entity.type);
    }
}
