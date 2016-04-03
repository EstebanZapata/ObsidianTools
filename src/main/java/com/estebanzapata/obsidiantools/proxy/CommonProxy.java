package com.estebanzapata.obsidiantools.proxy;

import com.estebanzapata.obsidiantools.handler.ConfigurationHandler;
import com.estebanzapata.obsidiantools.handler.ObsidianArmorHandler;
import com.estebanzapata.obsidiantools.init.ModBlocks;
import com.estebanzapata.obsidiantools.init.ModEntities;
import com.estebanzapata.obsidiantools.init.ModItems;
import com.estebanzapata.obsidiantools.init.ModRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
        ModRecipes.init();
        ModEntities.init();

    }

    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ObsidianArmorHandler());

    }
}