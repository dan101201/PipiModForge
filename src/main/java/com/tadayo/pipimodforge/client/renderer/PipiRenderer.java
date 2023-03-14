package com.tadayo.pipimodforge.client.renderer;

import com.tadayo.pipimodforge.PipiModForge;
import com.tadayo.pipimodforge.client.models.PipiModel;
import com.tadayo.pipimodforge.entities.Pipi;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PipiRenderer extends MobRenderer<Pipi, PipiModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(PipiModForge.MODID, "textures/pipi.png");
    public PipiRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new PipiModel(ctx.bakeLayer(PipiModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Pipi entity) {
        return TEXTURE;
    }
}
