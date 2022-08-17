package dev.criosage.simpleprogressions.item.renderer;

import dev.criosage.simpleprogressions.item.custom.CopperChestItem;
import dev.criosage.simpleprogressions.item.custom.GoldChestItem;
import dev.criosage.simpleprogressions.item.model.CopperChestItemModel;
import dev.criosage.simpleprogressions.item.model.GoldChestItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class GoldChestItemRenderer extends GeoItemRenderer<GoldChestItem> {

    public GoldChestItemRenderer() {
        super(new GoldChestItemModel());
    }
}
