package com.estebanzapata.obsidiantools.item.tool;

import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemOTSword extends ItemSword {
    public ItemOTSword(Item.ToolMaterial material) {
        super(material);
    }

    public ItemOTSword(ToolMaterial material, String unlocalizedName) {
        super(material);

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
