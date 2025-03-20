package com.yourmod.events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayNetworkHandler;

public class WaifuCompanionEvents {

    public static void onPlayerInteract(PlayerEntity player, Entity entity) {
        if (entity instanceof WaifuCompanionEntity) {
            // Handle the interaction event, for example, start following player
        }
    }
}