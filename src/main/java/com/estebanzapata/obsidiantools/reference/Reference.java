package com.estebanzapata.obsidiantools.reference;

import com.estebanzapata.obsidiantools.creativetab.CreativeTabOT;

public class Reference {

    public static final String MOD_ID = "ObsidianTools";
    public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
    public static final String MOD_NAME = "Obsidian Tools";
    public static final String MOD_VERSION = "1.9-1.0";
    public static final String PROXY_SERVER_CLASS = "com.estebanzapata.obsidiantools.proxy.ServerProxy";
    public static final String PROXY_CLIENT_CLASS = "com.estebanzapata.obsidiantools.proxy.ClientProxy";
    public static final String GUI_FACTORY_CLASS = "com.estebanzapata.obsidiantools.client.gui.GuiFactory";

    public static final CreativeTabOT CREATIVE_TAB_OT = new CreativeTabOT(MOD_ID);

}
