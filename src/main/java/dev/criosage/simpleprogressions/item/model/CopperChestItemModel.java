package dev.criosage.simpleprogressions.item.model;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.item.custom.CopperChestItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CopperChestItemModel extends AnimatedGeoModel<CopperChestItem> {
    @Override
    public Identifier getModelResource(CopperChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "geo/copper_chest.geo.json");
    }

    @Override
    public Identifier getTextureResource(CopperChestItem object) {
        return new Identifier(SimpleProgressions.MOD_ID, "textures/block/copper_chest.png");
    }

    @Override
    public Identifier getAnimationResource(CopperChestItem animatable) {
        return new Identifier(SimpleProgressions.MOD_ID, "animations/copper_chest.animation.json");
    }
}
