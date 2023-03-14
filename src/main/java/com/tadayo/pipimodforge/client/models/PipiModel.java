// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

package com.tadayo.pipimodforge.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.tadayo.pipimodforge.PipiModForge;
import com.tadayo.pipimodforge.entities.Pipi;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class PipiModel extends EntityModel<Pipi> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(PipiModForge.MODID, "pipi"), "main");
	private final ModelPart body;
	private final ModelPart flower;

	public PipiModel(ModelPart root) {
		this.body = root.getChild("body");
		this.flower = root.getChild("flower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -12.0F, -6.0F, 16.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-7.0F, -5.0F, 3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(5.0F, -5.0F, 3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(4.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition flower = partdefinition.addOrReplaceChild("flower", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = flower.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 31).addBox(-4.0F, -4.0F, -0.3543F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2213F, -17.658F, -0.6457F, -0.3491F, 0.6545F, 0.0F));

		PartDefinition cube_r2 = flower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 37).addBox(-2.3904F, 0.5F, -0.33F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4096F, -14.5F, 0.0F, -0.9223F, 0.3189F, 1.8041F));

		PartDefinition cube_r3 = flower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(33, 37).addBox(0.0F, -17.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Pipi entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		flower.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}