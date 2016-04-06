package com.estebanzapata.obsidiantools.client.renderer.entity;

import com.estebanzapata.obsidiantools.client.model.ModelGolemObsidian;
import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.ResourceLocation;

public class RenderGolemObsidian extends RenderLiving<EntityGolemObsidian> {

   // private static final ResourceLocation[] golemLavaTextures =  new ResourceLocation[16];
    private static final ResourceLocation golemObsidianTexture = new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/entity/golemObsidian.png");
   // private static final ResourceLocation golemLavaTexture = new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/entity/golemLava.png")

    public RenderGolemObsidian(RenderManager rendermanagerIn, ModelBase modelIn, float shadowSizeIn) {
        super(rendermanagerIn, modelIn, shadowSizeIn);
        //this.initLavaTextures();
    }

    /*protected void initLavaTextures() {
        for(int i = 0; i < golemLavaTextures.length; i++) {
            golemLavaTextures[i] = new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/entity/golemLava" + i + ".png");
        }
    }*/


    @Override
    protected ResourceLocation getEntityTexture(EntityGolemObsidian entity) {
        return golemObsidianTexture;
    }


    protected void rotateCorpse(EntityGolemObsidian bat, float p_77043_2_, float p_77043_3_, float partialTicks)
    {
        super.rotateCorpse(bat, p_77043_2_, p_77043_3_, partialTicks);

        if ((double)bat.limbSwingAmount >= 0.01D)
        {
            float f = 13.0F;
            float f1 = bat.limbSwing - bat.limbSwingAmount * (1.0F - partialTicks) + 6.0F;
            float f2 = (Math.abs(f1 % f - f * 0.5F) - f * 0.25F) / (f * 0.25F);
            GlStateManager.rotate(6.5F * f2, 0.0F, 0.0F, 1.0F);
        }
    }
}
