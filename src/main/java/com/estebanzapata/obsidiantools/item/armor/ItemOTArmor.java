package com.estebanzapata.obsidiantools.item.armor;

import com.estebanzapata.obsidiantools.init.ModItems;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

// TODO: Figure out a way to remove fire when fallen into lava with obsidian armor set on
public class ItemOTArmor extends ItemArmor{
    public ItemOTArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(material, renderIndex, equipmentSlot);

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Reference.CREATIVE_TAB_OT);
    }



    public static boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
        boolean isWearingHelmet = player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet;
        boolean isWearingChestplate = player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate;
        boolean isWearingLeggings = player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings;
        boolean isWearingBoots = player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;

        if(isWearingHelmet && isWearingChestplate && isWearingLeggings && isWearingBoots) {
            return true;
        }
        else {
            return false;
        }

    }

    public void castPotionEffect(EntityPlayer player, Potion potion, int amplifier) {
        if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
            player.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, true));
        }
    }


    // Below methods are COPIED AND PASTED to ItemMod*

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //item.ObsidianTools:gemOnyx.name
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
