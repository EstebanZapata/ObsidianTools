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

        // Onyx axe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeOnyx), "oo ", "os ", " s ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));

        // Onyx hoe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeOnyx), "oo ", " s ", " s ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));

        // Onyx pickaxe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeOnyx), "ooo", " s ", " s ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));

        // Onyx Spade
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeOnyx), "o  ", "s  ", "s  ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeOnyx), " o ", " s ", " s ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeOnyx), "  o", "  s", "  s", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));


        // Onyx sword
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordOnyx), "o  ", "o  ", "s  ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordOnyx), " o ", " o ", " s ", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordOnyx), "  o", "  o", "  s", 'o', new ItemStack(ModItems.gemOnyx), 's', "stickWood"));

        // Onyx helmet
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmetOnyx), "ooo", "o o", "   ", 'o', new ItemStack(ModItems.gemOnyx)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmetOnyx), "   ", "ooo", "o o", 'o', new ItemStack(ModItems.gemOnyx)));

        // Onyx chestplate
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chestplateOnyx), "o o", "ooo", "ooo", 'o', new ItemStack(ModItems.gemOnyx)));

        // Onyx leggings
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.leggingsOnyx), "ooo", "o o", "o o", 'o', new ItemStack(ModItems.gemOnyx)));

        // Onyx boots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsOnyx), "o o", "o o", "   ", 'o', new ItemStack(ModItems.gemOnyx)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsOnyx), "   ", "o o", "o o", 'o', new ItemStack(ModItems.gemOnyx)));




        // Obsidian axe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeObsidian), "oo ", "os ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));

        // Obsidian hoe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeObsidian), "oo ", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));

        // Obsidian pickaxe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeObsidian), "ooo", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));

        // Obsidian Spade
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeObsidian), "o  ", "s  ", "s  ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeObsidian), " o ", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeObsidian), "  o", "  s", "  s", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));


        // Obsidian sword
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordObsidian), "o  ", "o  ", "s  ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordObsidian), " o ", " o ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordObsidian), "  o", "  o", "  s", 'o', new ItemStack(Blocks.obsidian), 's', "stickWood"));

        // Obsidian helmet
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmetObsidian), "ooo", "o o", "   ", 'o', new ItemStack(Blocks.obsidian)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmetObsidian), "   ", "ooo", "o o", 'o', new ItemStack(Blocks.obsidian)));

        // Obsidian chestplate
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chestplateObsidian), "o o", "ooo", "ooo", 'o', new ItemStack(Blocks.obsidian)));

        // Obsidian leggings
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.leggingsObsidian), "ooo", "o o", "o o", 'o', new ItemStack(Blocks.obsidian)));

        // Obsidian boots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsObsidian), "o o", "o o", "   ", 'o', new ItemStack(Blocks.obsidian)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsObsidian), "   ", "o o", "o o", 'o', new ItemStack(Blocks.obsidian)));


    }
}
