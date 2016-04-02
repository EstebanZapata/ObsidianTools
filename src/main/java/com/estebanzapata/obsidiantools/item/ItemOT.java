package com.estebanzapata.obsidiantools.item;

import com.estebanzapata.obsidiantools.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

// Wrap vanilla item class to add own methods
public class ItemOT extends Item{
    public ItemOT(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Reference.CREATIVE_TAB_OT);

    }

    // Below methods are COPIED AND PASTED to ItemMod*

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //item.ObsidianTools:gemOnyx.name
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
