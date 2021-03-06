package net.parrie43.ambientworld.entity.client;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.ModEntityTypes;
import net.parrie43.ambientworld.entity.custom.OpahEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = AmbientWorld.MOD_ID)
public class ClientEvents {

    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.HIPPO.get(), HippoRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.OPAH.get(), OpahRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.FLAMINGO.get(), FlamingoRenderer::new);
    }
}
