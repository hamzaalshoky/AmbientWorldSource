package net.parrie43.ambientworld.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.custom.HippoEntity;
import net.parrie43.ambientworld.entity.custom.OpahEntity;
import net.parrie43.ambientworld.entity.variant.HippoVariant;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class OpahRenderer extends GeoEntityRenderer<OpahEntity> {

    public OpahRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OpahModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(OpahEntity instance) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/opah/opah.png");
    }


    @Override
    public RenderType getRenderType(OpahEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
