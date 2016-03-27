package com.estebanzapata.obsidiantools.client.render;


import com.estebanzapata.obsidiantools.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlocksRender {
    public static void init() {
        registerBlock(ModBlocks.blockOnyx);
    }

    private static void registerBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName().substring(5), "inventory")
        );
    }
}