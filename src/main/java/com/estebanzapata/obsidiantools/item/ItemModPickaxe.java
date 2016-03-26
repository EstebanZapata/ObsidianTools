package com.estebanzapata.obsidiantools.item;

import com.estebanzapata.obsidiantools.creativetab.CreativeTabOT;
import com.estebanzapata.obsidiantools.reference.Textures;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemModPickaxe extends ItemPickaxe{

    public ItemModPickaxe(ToolMaterial material) {
        super(material);
    }

    public ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabOT.OT_TAB);
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

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
