package dev.criosage.simpleprogressions.block.renderer;

import dev.criosage.simpleprogressions.block.entity.GoldChestEntity;
import dev.criosage.simpleprogressions.block.model.GoldChestModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class GoldChestRenderer extends GeoBlockRenderer<GoldChestEntity> {
    public GoldChestRenderer() {
        super(new GoldChestModel());
    }

    @Override
    public RenderLayer getRenderType(GoldChestEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
