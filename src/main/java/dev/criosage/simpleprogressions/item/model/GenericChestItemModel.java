package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.custom.ChestType;
import dev.criosage.simpleprogressions.block.entity.GenericChestEntity;
import dev.criosage.simpleprogressions.item.custom.GenericChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GenericChestItemModel extends AnimatedGeoModel<GenericChestItem> {
    @Override
    public Identifier getAnimationResource(GenericChestItem animatable) {
        return ChestType.animationResource(animatable.type);
    }

    @Override
    public Identifier getModelResource(GenericChestItem animatable) {
        return ChestType.modelResource(animatable.type);
    }

    @Override
    public Identifier getTextureResource(GenericChestItem entity) {
        return ChestType.textureResource(entity.type);
    }

}
