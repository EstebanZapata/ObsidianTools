package com.estebanzapata.obsidiantools.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
    public static void init() {
        // 9 gemOnyx = 1 gemOnyx block
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockOnyx), new ItemStack(ModItems.gemOnyx), new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx),new ItemStack(ModItems.gemOnyx));
        // Reverse, reverse
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemOnyx, 9), new ItemStack(ModBlocks.blockOnyx));

        // Onyx
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemOnyx), " o ", "odo", " o ", 'o', new ItemStack(Blocks.obsidian), 'd', "gemDiamond"));

        // Onyx pick
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeOnyx), "ooo", " s ", " s ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));
    }
}
