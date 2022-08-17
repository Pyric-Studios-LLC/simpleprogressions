package dev.criosage.simpleprogressions.block.renderer;

import dev.criosage.simpleprogressions.block.entity.IronChestEntity;
import dev.criosage.simpleprogressions.block.model.IronChestModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class IronChestRenderer extends GeoBlockRenderer<IronChestEntity> {
    public IronChestRenderer() {
        super(new IronChestModel());
    }

    @Override
    public RenderLayer getRenderType(IronChestEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
