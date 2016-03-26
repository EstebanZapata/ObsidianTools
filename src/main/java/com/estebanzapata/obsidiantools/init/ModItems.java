package com.estebanzapata.obsidiantools.init;

import com.estebanzapata.obsidiantools.item.ItemModPickaxe;
import com.estebanzapata.obsidiantools.item.ItemOT;
import com.estebanzapata.obsidiantools.item.ItemOnyx;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ModItems {
    // Durability half that of diamond: 1561/2
    // Name, harvest level, durability, speed, damage, enchantability
    public static Item.ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 4, 500, 10.0F, 4.0F, 15);
    public static Item.ToolMaterial ONYX = EnumHelper.addToolMaterial("ONYX", 4, 2000, 12.0F, 5.0F, 22);

    public static final ItemOT onyx = new ItemOnyx();
    public static final ItemModPickaxe pickaxeOnyx = new ItemModPickaxe(ONYX, "pickaxeOnyx");

    public static void init() {
        GameRegistry.registerItem(onyx, "onyx");

        GameRegistry.registerItem(pickaxeOnyx, "pickaxeOnyx");
    }
}
