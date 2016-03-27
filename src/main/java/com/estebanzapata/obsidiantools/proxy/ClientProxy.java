package com.estebanzapata.obsidiantools.proxy;

import com.estebanzapata.obsidiantools.client.render.RenderBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
        RenderBlocks.init();
    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
