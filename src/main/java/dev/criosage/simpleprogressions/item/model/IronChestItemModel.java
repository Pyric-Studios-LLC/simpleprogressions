package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.item.custom.CopperChestItem;
import dev.criosage.simpleprogressions.item.custom.IronChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IronChestItemModel extends AnimatedGeoModel<IronChestItem> {
    @Override
    public Identifier getModelResource(IronChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/iron_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(IronChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "textures/block/iron_chest.png");
    }

    @Override
    public Identifier getAnimationResource(IronChestItem animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/iron_chest.animation.json");
    }
}
