package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.item.custom.DiamondChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DiamondChestItemModel extends AnimatedGeoModel<DiamondChestItem> {
    @Override
    public Identifier getModelResource(DiamondChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/diamond_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(DiamondChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "textures/block/diamond_chest.png");
    }

    @Override
    public Identifier getAnimationResource(DiamondChestItem animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/diamond_chest.animation.json");
    }
}
