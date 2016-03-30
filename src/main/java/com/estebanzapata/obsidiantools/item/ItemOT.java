package com.estebanzapata.obsidiantools.item;

import com.estebanzapata.obsidiantools.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

// Wrap vanilla item class to add own methods
public class ItemOT extends Item{
    public ItemOT() {
        super();
        this.setCreativeTab(Reference.CREATIVE_TAB_OT);

    }

    // Below methods are COPIED AND PASTED to ItemMod*

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //item.ObsidianTools:onyx.name
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
