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
import net.parrie43.ambientworld.entity.custom.FlamingoEntity;
import net.parrie43.ambientworld.entity.custom.HippoEntity;
import net.parrie43.ambientworld.entity.variant.FlamingoVariant;
import net.parrie43.ambientworld.entity.variant.HippoVariant;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class FlamingoRenderer extends GeoEntityRenderer<FlamingoEntity> {
    public static final Map<FlamingoVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(FlamingoVariant.class), (p_114874_) -> {
                p_114874_.put(FlamingoVariant.DEFAULT,
                        new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/flamingo/flamingo.png"));
                p_114874_.put(FlamingoVariant.WHITE,
                        new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/flamingo/flamingo2.png"));
                p_114874_.put(FlamingoVariant.RED,
                        new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/flamingo/flamingo3.png"));
                p_114874_.put(FlamingoVariant.DARK_EYED,
                        new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/flamingo/flamingo4.png"));
            });



    public FlamingoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FlamingoModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(FlamingoEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }


    @Override
    public RenderType getRenderType(FlamingoEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
