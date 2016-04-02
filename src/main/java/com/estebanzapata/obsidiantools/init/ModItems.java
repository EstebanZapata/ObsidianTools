package com.estebanzapata.obsidiantools.init;

import com.estebanzapata.obsidiantools.item.armor.ItemOTArmor;
import com.estebanzapata.obsidiantools.item.armor.ItemObsidianArmor;
import com.estebanzapata.obsidiantools.item.tool.*;
import com.estebanzapata.obsidiantools.item.ItemOT;
import com.estebanzapata.obsidiantools.item.ItemOnyx;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ModItems {
    // Name, harvest level, durability, speed, damage, enchantability
//    Wood Tool: 59
//    Stone Tool: 131
//    Iron Tool: 250
//    Diamond Tool: 1561
//    Gold Tool: 32
    public static Item.ToolMaterial OBSIDIAN_TOOL = EnumHelper.addToolMaterial("OBSIDIAN_TOOL", 4, 400, 10.0F, 4.0F, 15);
    public static Item.ToolMaterial ONYX_TOOL = EnumHelper.addToolMaterial("ONYX_TOOL", 4, 2000, 12.0F, 5.0F, 22);

    public static ItemArmor.ArmorMaterial OBSIDIAN_ARMOR = EnumHelper.addArmorMaterial("OBSIDIAN_ARMOR",
            Reference.RESOURCE_PREFIX + "obsidian", 5, new int[] {2, 6, 5 ,2}, 9, SoundEvents.item_armor_equip_generic);


    public static final ItemOT gemOnyx = new ItemOnyx("gemOnyx");

    public static final ItemObsidianArmor helmetObsidian = new ItemObsidianArmor("helmetObsidian", OBSIDIAN_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final ItemObsidianArmor chestplateObsidian = new ItemObsidianArmor("chestplateObsidian", OBSIDIAN_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final ItemObsidianArmor leggingsObsidian = new ItemObsidianArmor("leggingsObsidian", OBSIDIAN_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final ItemObsidianArmor bootsObsidian = new ItemObsidianArmor("bootsObsidian", OBSIDIAN_ARMOR, 1, EntityEquipmentSlot.FEET);

    public static final ItemOTAxe axeOnyx = new ItemOTAxe(ONYX_TOOL, "axeOnyx");
    public static final ItemOTHoe hoeOnyx = new ItemOTHoe(ONYX_TOOL, "hoeOnyx");
    public static final ItemOTPickaxe pickaxeOnyx = new ItemOTPickaxe(ONYX_TOOL, "pickaxeOnyx");
    public static final ItemOTSpade spadeOnyx = new ItemOTSpade(ONYX_TOOL, "spadeOnyx");
    public static final ItemOTSword swordOnyx = new ItemOTSword(ONYX_TOOL, "swordOnyx");

    public static final ItemOTAxe axeObsidian = new ItemOTAxe(OBSIDIAN_TOOL, "axeObsidian");
    public static final ItemOTHoe hoeObsidian = new ItemOTHoe(OBSIDIAN_TOOL, "hoeObsidian");
    public static final ItemOTPickaxe pickaxeObsidian = new ItemOTPickaxe(OBSIDIAN_TOOL, "pickaxeObsidian");
    public static final ItemOTSpade spadeObsidian = new ItemOTSpade(OBSIDIAN_TOOL, "spadeObsidian");
    public static final ItemOTSword swordObsidian = new ItemOTSword(OBSIDIAN_TOOL, "swordObsidian");

    public static void init() {
        GameRegistry.registerItem(gemOnyx, "gemOnyx");

        GameRegistry.registerItem(helmetObsidian, "helmetObsidian");
        GameRegistry.registerItem(chestplateObsidian, "chestplateObsidian");
        GameRegistry.registerItem(leggingsObsidian, "leggingsObsidian");
        GameRegistry.registerItem(bootsObsidian, "bootsObsidian");

        GameRegistry.registerItem(axeOnyx, "axeOnyx");
        GameRegistry.registerItem(hoeOnyx, "hoeOnyx");
        GameRegistry.registerItem(pickaxeOnyx, "pickaxeOnyx");
        GameRegistry.registerItem(spadeOnyx, "spadeOnyx");
        GameRegistry.registerItem(swordOnyx, "swordOnyx");

        GameRegistry.registerItem(axeObsidian, "axeObsidian");
        GameRegistry.registerItem(hoeObsidian, "hoeObsidian");
        GameRegistry.registerItem(pickaxeObsidian, "pickaxeObsidian");
        GameRegistry.registerItem(spadeObsidian, "spadeObsidian");
        GameRegistry.registerItem(swordObsidian, "swordObsidian");

    }
}
