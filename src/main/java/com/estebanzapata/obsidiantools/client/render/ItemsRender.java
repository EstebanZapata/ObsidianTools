package com.estebanzapata.obsidiantools.client.render;

import com.estebanzapata.obsidiantools.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemsRender {
    public static void init() {
        registerItem(ModItems.onyx);

        registerItem(ModItems.axeOnyx);
        registerItem(ModItems.hoeOnyx);
        registerItem(ModItems.pickaxeOnyx);
        registerItem(ModItems.spadeOnyx);
        registerItem(ModItems.swordOnyx);

        registerItem(ModItems.axeObsidian);
        registerItem(ModItems.hoeObsidian);
        registerItem(ModItems.pickaxeObsidian);
        registerItem(ModItems.spadeObsidian);
        registerItem(ModItems.swordObsidian);

        registerItem(ModItems.helmetObsidian);
        registerItem(ModItems.chestplateObsidian);
        registerItem(ModItems.leggingsObsidian);
        registerItem(ModItems.bootsObsidian);
    }

    public static void registerItem(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory")
        );
    }
}