package com.estebanzapata.obsidiantools.proxy;

import com.estebanzapata.obsidiantools.client.model.ModelGolemObsidian;
import com.estebanzapata.obsidiantools.client.renderer.BlocksRender;
import com.estebanzapata.obsidiantools.client.renderer.ItemsRender;
import com.estebanzapata.obsidiantools.client.renderer.entity.RenderGolemObsidian;
import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        RenderingRegistry.registerEntityRenderingHandler(EntityGolemObsidian.class, new IRenderFactory<EntityGolemObsidian>() {
            @Override
            public Render<? super EntityGolemObsidian> createRenderFor(RenderManager manager) {
                return new RenderGolemObsidian(manager, new ModelGolemObsidian(), 0.5f);
            }
        });
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
        ItemsRender.init();
        BlocksRender.init();
    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
