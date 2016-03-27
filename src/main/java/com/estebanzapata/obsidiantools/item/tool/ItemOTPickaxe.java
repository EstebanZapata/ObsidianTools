package com.estebanzapata.obsidiantools.item.tool;

import com.estebanzapata.obsidiantools.creativetab.CreativeTabOT;
import com.estebanzapata.obsidiantools.reference.Reference;
import com.estebanzapata.obsidiantools.reference.Textures;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemOTPickaxe extends ItemPickaxe{

    public ItemOTPickaxe(ToolMaterial material) {
        super(material);
    }

    public ItemOTPickaxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Reference.CREATIVE_TAB_OT);
    }

    // Below methods are COPIED AND PASTED to ItemMod*

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //item.ObsidianTools:onyx.name
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
