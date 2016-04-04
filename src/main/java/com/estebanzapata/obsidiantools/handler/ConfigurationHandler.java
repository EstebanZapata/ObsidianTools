package com.estebanzapata.obsidiantools.handler;

import com.estebanzapata.obsidiantools.reference.Reference;
import com.estebanzapata.obsidiantools.reference.Strings;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        boolean hardMode = configuration.get(Configuration.CATEGORY_GENERAL, "hardMode", false, Strings.HARD_MODE_CONFIG_COMMENT).getBoolean(false);

        if (configuration.hasChanged())
        {
            configuration.save();
        }



        /*try
        {
            configuration.load();

            boolean hardMode = configuration.get(Configuration.CATEGORY_GENERAL, "hardMode", false, Strings.HARD_MODE_CONFIG_COMMENT).getBoolean(false);
        }
        catch (Exception e)
        {

        }
        finally
        {
            if (configuration.hasChanged())
            {
                configuration.save();
            }
        }*/
    }
}
