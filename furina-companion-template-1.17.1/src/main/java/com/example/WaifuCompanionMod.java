package com.yourmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.BuiltInRegistries;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemGroup;

public class WaifuCompanionMod {
    public static final String MOD_ID = "yourmod";
    public static final EntityType<WaifuCompanionEntity> WAIFU_COMPANION_ENTITY = (EntityType<WaifuCompanionEntity>) Registry.ENTITY_TYPE.get(new Identifier(MOD_ID, "waifu_companion"));

    public static final Item WAIFU_SPAWN_EGG = new SpawnEggItem(WAIFU_COMPANION_ENTITY, 0xFFD1E8, 0xF0A7A9, new Item.Settings().group(ItemGroup.MISC));

    public static void onInitialize() {
        // Register the Waifu Companion entity
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "waifu_companion"), EntityType.Builder.create(WaifuCompanionEntity::new, EntityCategory.CREATURE).build("waifu_companion"));
        
        // Register the spawn egg
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waifu_spawn_egg"), WAIFU_SPAWN_EGG);
    }
}