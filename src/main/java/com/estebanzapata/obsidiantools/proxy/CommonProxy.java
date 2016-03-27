package com.estebanzapata.obsidiantools.proxy;

import com.estebanzapata.obsidiantools.init.ModBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
