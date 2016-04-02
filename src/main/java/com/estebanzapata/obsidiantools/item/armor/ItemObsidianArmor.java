package com.estebanzapata.obsidiantools.item.armor;

import com.estebanzapata.obsidiantools.init.ModItems;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;

public class ItemObsidianArmor extends ItemOTArmor {
    public ItemObsidianArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(unlocalizedName, material, renderIndex, equipmentSlot);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (isWearingFullSet(player, ModItems.helmetObsidian, ModItems.chestplateObsidian, ModItems.leggingsObsidian, ModItems.bootsObsidian)) {
            // Fire resistance potion
            castPotionEffect(player, Potion.getPotionById(12), 1);

            // Slowness potion
            castPotionEffect(player, Potion.getPotionById(2), 2);
        }
    }
}
