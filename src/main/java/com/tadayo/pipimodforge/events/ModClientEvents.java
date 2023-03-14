package com.tadayo.pipimodforge.events;

import com.tadayo.pipimodforge.EntityInit;
import com.tadayo.pipimodforge.PipiModForge;
import com.tadayo.pipimodforge.client.models.PipiModel;
import com.tadayo.pipimodforge.client.renderer.PipiRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PipiModForge.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.PIPI.get(), PipiRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(PipiModel.LAYER_LOCATION, PipiModel::createBodyLayer);
    }
}
