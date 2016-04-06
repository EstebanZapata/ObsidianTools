package com.estebanzapata.obsidiantools.handler;

import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GolemObsidianDropHandler {

    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onLivingDropsEvent(LivingDropsEvent event) {
        if (event.getEntityLiving() instanceof EntityGolemObsidian) {
            event.getDrops().clear();

            ItemStack diamond = new ItemStack(Items.diamond, 1);
            ItemStack obsidian = new ItemStack(Blocks.obsidian, 4);

            event.getDrops().add(new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, diamond));
            event.getDrops().add(new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, obsidian));

        }
    }
}
