package dev.criosage.simpleprogressions.item.renderer;

import dev.criosage.simpleprogressions.item.custom.NetheriteChestItem;
import dev.criosage.simpleprogressions.item.model.NetheriteChestItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class NetheriteChestItemRenderer extends GeoItemRenderer<NetheriteChestItem> {

    public NetheriteChestItemRenderer() {
        super(new NetheriteChestItemModel());
    }
}
