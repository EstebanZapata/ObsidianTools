package com.estebanzapata.obsidiantools.init;

import com.estebanzapata.obsidiantools.ObsidianTools;
import com.estebanzapata.obsidiantools.client.renderer.entity.RenderGolemObsidian;
import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

    public static void init() {
        registerModEntityWithEgg(EntityGolemObsidian.class, "golemObsidian", 0x3F5505, 0x4E6414);

        EntityRegistry.addSpawn(EntityGolemObsidian.class, 6, 1, 1, EnumCreatureType.MONSTER, Biomes.forest);
    }

    public static void registerModEntityWithEgg(Class entityClass, String entityName, int eggColor, int eggSpotsColor) {
        int id = 0;

        EntityRegistry.registerModEntity(entityClass, entityName, id++, ObsidianTools.instance, 80, 3, false);
        EntityRegistry.registerEgg(entityClass, eggColor, eggSpotsColor);
    }
}
