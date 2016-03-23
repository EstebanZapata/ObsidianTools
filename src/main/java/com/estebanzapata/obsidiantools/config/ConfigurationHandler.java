package com.estebanzapata.obsidiantools.config;

import com.estebanzapata.obsidiantools.reference.Strings;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by zapat on 3/22/2016.
 */
public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try {
            configuration.load();

            boolean hardMode = configuration.get(Configuration.CATEGORY_GENERAL, "hardMode", false, Strings.HARD_MODE_CONFIG_COMMENT).getBoolean(false);
        }
        catch (Exception e)
        {

        }
        finally
        {
          configuration.save();
        }
    }
}
