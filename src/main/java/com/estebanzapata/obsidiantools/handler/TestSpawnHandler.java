package com.estebanzapata.obsidiantools.handler;

import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by zapat on 4/3/2016.
 */
public class TestSpawnHandler {

    @SubscribeEvent
    public void test(LivingSpawnEvent event) {
        if (event.getEntityLiving() instanceof EntityGolemObsidian) {
            System.out.println("Spawned at " + event.getX() + " " + event.getY() + " " + event.getZ());
        }
    }
}
