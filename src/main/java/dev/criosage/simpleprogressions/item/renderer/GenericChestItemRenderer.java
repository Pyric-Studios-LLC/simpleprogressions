package dev.criosage.simpleprogressions.item.renderer;

import dev.criosage.simpleprogressions.item.custom.GenericChestItem;
import dev.criosage.simpleprogressions.item.model.GenericChestItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class GenericChestItemRenderer extends GeoItemRenderer<GenericChestItem> {

    public GenericChestItemRenderer() {
        super(new GenericChestItemModel());
    }
}