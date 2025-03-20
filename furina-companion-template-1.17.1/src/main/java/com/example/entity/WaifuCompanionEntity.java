package com.yourmod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class WaifuCompanionEntity extends MobEntity {

    public WaifuCompanionEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void tick() {
        super.tick();

        // Logic to make the waifu follow the player goes here
        // For example, checking if the player is nearby and moving towards them
    }

    @Override
    protected void initGoals() {
        // Add behavior goals here (e.g., follow player)
        this.goalSelector.add(0, new FollowPlayerGoal(this));
    }

    // You can customize more logic like AI and interactions here
}