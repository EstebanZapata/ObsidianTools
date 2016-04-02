package com.estebanzapata.obsidiantools.block;

import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOT extends Block {
    public BlockOT(Material material, float hardness, float resistance) {
        super(material);

        this.setHardness(hardness);
        this.setResistance(resistance);

        this.setCreativeTab(Reference.CREATIVE_TAB_OT);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {

        return Item.getItemFromBlock(this);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        // tile.modid:blockname.name
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
        // tile.blockname chop off tile.
    }
}
