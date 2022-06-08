package net.parrie43.ambientworld.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.custom.FlamingoEntity;
import net.parrie43.ambientworld.entity.custom.HippoEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FlamingoModel extends AnimatedGeoModel<FlamingoEntity> {
    @Override
    public ResourceLocation getModelLocation(FlamingoEntity object) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "geo/flamingo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FlamingoEntity object) {
        return HippoRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FlamingoEntity animatable) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "animations/flamingo.animation.json");
    }
}
