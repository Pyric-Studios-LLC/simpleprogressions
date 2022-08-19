package dev.criosage.simpleprogressions.block.model;

import dev.criosage.simpleprogressions.block.custom.ContainerType;
import dev.criosage.simpleprogressions.block.entity.GenericChestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GenericChestModel extends AnimatedGeoModel<GenericChestEntity> {
    @Override
    public Identifier getAnimationResource(GenericChestEntity animatable) {
        return ContainerType.animationResource(animatable.type);
    }

    @Override
    public Identifier getModelResource(GenericChestEntity animatable) {
        return ContainerType.modelResource(animatable.type);
    }

    @Override
    public Identifier getTextureResource(GenericChestEntity entity) {
        return ContainerType.textureResource(entity.type);
    }
}
