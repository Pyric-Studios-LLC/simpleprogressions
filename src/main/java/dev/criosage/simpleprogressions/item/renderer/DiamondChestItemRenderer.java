package dev.criosage.simpleprogressions.item.renderer;

import dev.criosage.simpleprogressions.item.custom.DiamondChestItem;
import dev.criosage.simpleprogressions.item.model.DiamondChestItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class DiamondChestItemRenderer extends GeoItemRenderer<DiamondChestItem> {

    public DiamondChestItemRenderer() {
        super(new DiamondChestItemModel());
    }
}
