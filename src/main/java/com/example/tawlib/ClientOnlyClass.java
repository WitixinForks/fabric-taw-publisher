package com.example.tawlib;


import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;

public class ClientOnlyClass {

    public static void isThisRemapped() {
        MinecraftClient mc = MinecraftClient.getInstance();
        VertexConsumerProvider bufferSource =  mc.worldRenderer.bufferBuilders.getEntityVertexConsumers();
    }
}
