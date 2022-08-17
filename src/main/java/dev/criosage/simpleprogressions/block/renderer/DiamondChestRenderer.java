package dev.criosage.simpleprogressions.block.renderer;

import dev.criosage.simpleprogressions.block.entity.DiamondChestEntity;
import dev.criosage.simpleprogressions.block.model.DiamondChestModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class DiamondChestRenderer extends GeoBlockRenderer<DiamondChestEntity> {
    public DiamondChestRenderer() {
        super(new DiamondChestModel());
    }

    @Override
    public RenderLayer getRenderType(DiamondChestEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
