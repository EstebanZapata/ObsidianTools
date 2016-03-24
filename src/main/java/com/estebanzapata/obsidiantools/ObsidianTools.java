package com.estebanzapata.obsidiantools;

import com.estebanzapata.obsidiantools.handler.ConfigurationHandler;
import com.estebanzapata.obsidiantools.init.ModItems;
import com.estebanzapata.obsidiantools.proxy.IProxy;
import com.estebanzapata.obsidiantools.reference.Reference;
import com.estebanzapata.obsidiantools.util.LogHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ObsidianTools {


    @Mod.Instance(Reference.MOD_ID)
    public static ObsidianTools instance;

    @SidedProxy(clientSide = Reference.PROXY_CLIENT_CLASS, serverSide = Reference.PROXY_SERVER_CLASS)
    public static IProxy iproxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //bus is deprecated????
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Substring 5 to get rid of "item."
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.onyx, 0, new ModelResourceLocation(ModItems.onyx.getUnlocalizedName().substring(5) ,"inventory"));

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
