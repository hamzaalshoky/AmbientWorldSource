package net.parrie43.ambientworld.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.custom.HippoEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, AmbientWorld.MOD_ID);


    public static final RegistryObject<EntityType<HippoEntity>> HIPPO = ENTITY_TYPES.register("hippo",
            () -> EntityType.Builder.of(HippoEntity::new, MobCategory.CREATURE)
                    .sized(0.9f, 1.5f)
                    .build(new ResourceLocation(AmbientWorld.MOD_ID, "hippo").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
