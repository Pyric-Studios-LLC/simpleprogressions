package dev.criosage.simpleprogressions.block.renderer;

import dev.criosage.simpleprogressions.block.entity.CopperChestEntity;
import dev.criosage.simpleprogressions.block.model.CopperChestModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.example.client.model.tile.FertilizerModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class CopperChestRenderer extends GeoBlockRenderer<CopperChestEntity> {
    public CopperChestRenderer() {
        super(new CopperChestModel());
    }

    @Override
    public RenderLayer getRenderType(CopperChestEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
