package com.estebanzapata.obsidiantools.init;

import com.estebanzapata.obsidiantools.item.tool.*;
import com.estebanzapata.obsidiantools.item.ItemOT;
import com.estebanzapata.obsidiantools.item.ItemOnyx;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ModItems {
    // Name, harvest level, durability, speed, damage, enchantability
    public static Item.ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 4, 500, 10.0F, 4.0F, 15);
    public static Item.ToolMaterial ONYX = EnumHelper.addToolMaterial("ONYX", 4, 2000, 12.0F, 5.0F, 22);

    public static final ItemOT onyx = new ItemOnyx();

    // TODO: Make them (or just axe) extend ItemTool
   // public static final ItemOTAxe axeOnyx = new ItemOTAxe(ONYX, "axeOnyx");
    public static final ItemOTHoe hoeOnyx = new ItemOTHoe(ONYX, "hoeOnyx");
    public static final ItemOTPickaxe pickaxeOnyx = new ItemOTPickaxe(ONYX, "pickaxeOnyx");
    public static final ItemOTSpade spadeOnyx = new ItemOTSpade(ONYX, "spadeOnyx");
    public static final ItemOTSword swordOnyx = new ItemOTSword(ONYX, "swordOnyx");

    public static void init() {
        GameRegistry.registerItem(onyx, "onyx");

    //    GameRegistry.registerItem(axeOnyx, "axeOnyx");
        GameRegistry.registerItem(hoeOnyx, "hoeOnyx");
        GameRegistry.registerItem(pickaxeOnyx, "pickaxeOnyx");
        GameRegistry.registerItem(spadeOnyx, "spadeOnyx");
        GameRegistry.registerItem(swordOnyx, "swordOnyx");
    }
}
