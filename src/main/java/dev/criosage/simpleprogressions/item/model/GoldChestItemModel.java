package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.item.custom.GoldChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoldChestItemModel extends AnimatedGeoModel<GoldChestItem> {
    @Override
    public Identifier getModelResource(GoldChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/gold_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(GoldChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "textures/block/gold_chest.png");
    }

    @Override
    public Identifier getAnimationResource(GoldChestItem animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/gold_chest.animation.json");
    }
}
