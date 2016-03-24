package com.estebanzapata.obsidiantools.block;

import com.estebanzapata.obsidiantools.creativetab.CreativeTabOT;
import com.estebanzapata.obsidiantools.reference.Reference;
import com.estebanzapata.obsidiantools.reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockOT extends Block {

    // Manually specify material
    public BlockOT(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabOT.OT_TAB);
    }

    // Or generic constructor
    public BlockOT() {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        // tile.modid:blockname.name
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
