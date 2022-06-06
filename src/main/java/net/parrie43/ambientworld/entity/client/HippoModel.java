package net.parrie43.ambientworld.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.custom.HippoEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HippoModel extends AnimatedGeoModel<HippoEntity> {
    @Override
    public ResourceLocation getModelLocation(HippoEntity object) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "geo/hippo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HippoEntity object) {
        return HippoRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HippoEntity animatable) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "animations/hippo.animation.json");
    }
}
