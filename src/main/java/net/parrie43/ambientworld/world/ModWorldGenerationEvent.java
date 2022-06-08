package net.parrie43.ambientworld.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.parrie43.ambientworld.AmbientWorld;

@Mod.EventBusSubscriber(modid = AmbientWorld.MOD_ID)
public class ModWorldGenerationEvent {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModEntityGeneration.onEntitySpawn(event);
    }
}
