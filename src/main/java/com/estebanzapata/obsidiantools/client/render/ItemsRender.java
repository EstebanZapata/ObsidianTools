package com.estebanzapata.obsidiantools.client.render;

import com.estebanzapata.obsidiantools.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by zapat on 3/27/2016.
 */
public class ItemsRender {
    public static void init() {
        registerItem(ModItems.onyx);
        registerItem(ModItems.pickaxeOnyx);
    }

    public static void registerItem(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory")
        );
    }
}