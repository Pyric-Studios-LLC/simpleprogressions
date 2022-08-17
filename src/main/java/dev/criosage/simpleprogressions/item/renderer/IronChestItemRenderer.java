package dev.criosage.simpleprogressions.item.renderer;

import dev.criosage.simpleprogressions.item.custom.CopperChestItem;
import dev.criosage.simpleprogressions.item.custom.IronChestItem;
import dev.criosage.simpleprogressions.item.model.CopperChestItemModel;
import dev.criosage.simpleprogressions.item.model.IronChestItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class IronChestItemRenderer extends GeoItemRenderer<IronChestItem> {

    public IronChestItemRenderer() {
        super(new IronChestItemModel());
    }
}
