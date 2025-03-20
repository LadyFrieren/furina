package com.yourmod.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class WaifuCompanionRenderer extends EntityRenderer<WaifuCompanionEntity> {

    private static final Identifier TEXTURE = new Identifier("yourmod", "textures/entity/waifu_skin.png");

    public WaifuCompanionRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public void render(WaifuCompanionEntity entity, float yaw, float tickDelta, MatrixStack matrices, com.mojang.blaze3d.systems.RenderSystem.RendererRendererContext vertexConsumerProvider, int light) {
        RenderSystem.setShaderTexture(0, TEXTURE);
        super.render(entity, yaw, tickDelta, matrices, vertexConsumerProvider, light);
    }

    @Override
    public Identifier getTexture(WaifuCompanionEntity entity) {
        return TEXTURE;  // Return the texture location
    }
}