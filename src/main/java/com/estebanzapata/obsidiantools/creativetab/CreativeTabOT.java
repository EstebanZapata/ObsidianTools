package com.estebanzapata.obsidiantools.creativetab;

import com.estebanzapata.obsidiantools.init.ModItems;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOT {

    public static final CreativeTabs OT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.onyx;
        }
    };
}
