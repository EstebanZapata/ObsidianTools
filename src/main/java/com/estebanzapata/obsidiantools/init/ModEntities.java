package com.estebanzapata.obsidiantools.init;

import com.estebanzapata.obsidiantools.ObsidianTools;
import com.estebanzapata.obsidiantools.client.renderer.entity.RenderGolemObsidian;
import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

    public static void init() {
        registerModEntityWithEgg(EntityGolemObsidian.class, "golemObsidian", 0x3F5505, 0x4E6414);
    }

    public static void registerModEntityWithEgg(Class entityClass, String entityName, int eggColor, int eggSpotsColor) {
        int id = 0;

        EntityRegistry.registerModEntity(entityClass, entityName, id++, ObsidianTools.instance, 80, 3, false);
        EntityRegistry.registerEgg(entityClass, eggColor, eggSpotsColor);
    }
}
