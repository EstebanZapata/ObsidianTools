package com.estebanzapata.obsidiantools.handler;

import com.estebanzapata.obsidiantools.init.ModItems;
import com.estebanzapata.obsidiantools.item.armor.ItemOTArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ObsidianArmorHandler {

    @SubscribeEvent
    public void onAttackEvent(LivingAttackEvent event) {

        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            if (ItemOTArmor.isWearingFullSet(player, ModItems.helmetObsidian, ModItems.chestplateObsidian, ModItems.leggingsObsidian, ModItems.bootsObsidian) && event.getSource() != DamageSource.starve) {



                if(event.getAmount() >= 25) {
                    event.setCanceled(true);

                    player.inventory.armorItemInSlot(3).damageItem(player.inventory.armorItemInSlot(3).getMaxDamage() * 2 / 3, player);
                    player.inventory.armorItemInSlot(2).damageItem(player.inventory.armorItemInSlot(2).getMaxDamage() * 2 / 3, player);
                    player.inventory.armorItemInSlot(1).damageItem(player.inventory.armorItemInSlot(1).getMaxDamage() * 2 / 3, player);
                    player.inventory.armorItemInSlot(0).damageItem(player.inventory.armorItemInSlot(0).getMaxDamage() * 2 / 3, player);

                    if (player.inventory.armorItemInSlot(3).getItemDamage() >= player.inventory.armorItemInSlot(3).getMaxDamage()) {

                        player.inventory.armorInventory[3] = null;
                    }

                    if (player.inventory.armorItemInSlot(2).getItemDamage() >= player.inventory.armorItemInSlot(2).getMaxDamage()) {

                        player.inventory.armorInventory[2] = null;
                    }

                    if (player.inventory.armorItemInSlot(1).getItemDamage() >= player.inventory.armorItemInSlot(1).getMaxDamage()) {

                        player.inventory.armorInventory[1] = null;
                    }

                    if (player.inventory.armorItemInSlot(0).getItemDamage() >= player.inventory.armorItemInSlot(0).getMaxDamage()) {

                        player.inventory.armorInventory[0] = null;
                    }

                }
                else {
                    event.setCanceled(true);
                }
            }
        }
    }
}
