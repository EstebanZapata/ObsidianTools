package com.estebanzapata.obsidiantools.creativetab;

import com.estebanzapata.obsidiantools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOT extends CreativeTabs{

    public CreativeTabOT (String name) {
        super(name);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.gemOnyx;
    }
}
