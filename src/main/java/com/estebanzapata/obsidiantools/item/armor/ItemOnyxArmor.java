package com.estebanzapata.obsidiantools.item.armor;

import com.estebanzapata.obsidiantools.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;


public class ItemOnyxArmor extends ItemOTArmor {
    public ItemOnyxArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(unlocalizedName, material, renderIndex, equipmentSlot);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (isWearingFullSet(player, ModItems.helmetOnyx, ModItems.chestplateOnyx, ModItems.leggingsOnyx, ModItems.bootsOnyx)) {
            // Fire resistance potion
            castPotionEffect(player, Potion.getPotionById(12), 1);
        }
    }
}

