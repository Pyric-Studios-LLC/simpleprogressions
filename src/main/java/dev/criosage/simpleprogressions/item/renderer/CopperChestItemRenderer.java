package dev.criosage.simpleprogressions.item.renderer;

import dev.criosage.simpleprogressions.item.custom.CopperChestItem;
import dev.criosage.simpleprogressions.item.model.CopperChestItemModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CopperChestItemRenderer extends GeoItemRenderer<CopperChestItem> {

    public CopperChestItemRenderer() {
        super(new CopperChestItemModel());
    }
}
