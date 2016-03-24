package com.estebanzapata.obsidiantools.init;

import com.estebanzapata.obsidiantools.item.ItemOT;
import com.estebanzapata.obsidiantools.item.ItemOnyx;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
    public static final ItemOT onyx = new ItemOnyx();

    public static void init() {
        GameRegistry.registerItem(onyx, "onyx");
    }
}
