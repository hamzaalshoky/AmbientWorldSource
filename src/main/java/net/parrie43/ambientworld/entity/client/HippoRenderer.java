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
import net.parrie43.ambientworld.entity.variant.HippoVariant;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class HippoRenderer extends GeoEntityRenderer<HippoEntity> {
    public static final Map<HippoVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(HippoVariant.class), (p_114874_) -> {
                p_114874_.put(HippoVariant.DEFAULT,
                        new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/hippo/hippo.png"));
                p_114874_.put(HippoVariant.PALE,
                        new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/hippo/hippopale.png"));
            });
    
    
    
    public HippoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HippoModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(HippoEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }


    @Override
    public RenderType getRenderType(HippoEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
