package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.block.custom.ContainerType;
import dev.criosage.simpleprogressions.item.custom.GenericChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GenericChestItemModel extends AnimatedGeoModel<GenericChestItem> {
    @Override
    public Identifier getAnimationResource(GenericChestItem animatable) {
        return ContainerType.animationResource(animatable.type);
    }

    @Override
    public Identifier getModelResource(GenericChestItem animatable) {
        return ContainerType.modelResource(animatable.type);
    }

    @Override
    public Identifier getTextureResource(GenericChestItem entity) {
        return ContainerType.textureResource(entity.type);
    }

}
