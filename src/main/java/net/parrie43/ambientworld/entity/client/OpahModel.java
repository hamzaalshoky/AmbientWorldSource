package net.parrie43.ambientworld.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.custom.HippoEntity;
import net.parrie43.ambientworld.entity.custom.OpahEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OpahModel extends AnimatedGeoModel<OpahEntity> {
    @Override
    public ResourceLocation getModelLocation(OpahEntity object) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "geo/opah.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OpahEntity object) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "textures/entity/opah/opah.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OpahEntity animatable) {
        return new ResourceLocation(AmbientWorld.MOD_ID, "animations/opah.animation.json");
    }
}
