package com.estebanzapata.obsidiantools.client.model;

import com.estebanzapata.obsidiantools.entity.EntityGolemObsidian;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGolemObsidian extends ModelBase
{
    /** The head model for the iron golem. */
    public ModelRenderer golemObsidianHead;
    /** The body model for the iron golem. */
    public ModelRenderer golemObsidianBody;
    /** The right arm model for the iron golem. */
    public ModelRenderer golemObsidianRightArm;
    /** The left arm model for the iron golem. */
    public ModelRenderer golemObsidianLeftArm;
    /** The left leg model for the Iron Golem. */
    public ModelRenderer golemObsidianLeftLeg;
    /** The right leg model for the Iron Golem. */
    public ModelRenderer golemObsidianRightLeg;

    public ModelGolemObsidian()
    {
        this(0.0F);
    }

    public ModelGolemObsidian(float p_i1161_1_)
    {
        this(p_i1161_1_, -7.0F);
    }

    public ModelGolemObsidian(float p_i46362_1_, float p_i46362_2_)
    {
        int i = 128;
        int j = 128;
        this.golemObsidianHead = (new ModelRenderer(this)).setTextureSize(i, j);
        this.golemObsidianHead.setRotationPoint(0.0F, 0.0F + p_i46362_2_, -2.0F);
        this.golemObsidianHead.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, p_i46362_1_);
        this.golemObsidianHead.setTextureOffset(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, p_i46362_1_);
        this.golemObsidianBody = (new ModelRenderer(this)).setTextureSize(i, j);
        this.golemObsidianBody.setRotationPoint(0.0F, 0.0F + p_i46362_2_, 0.0F);
        this.golemObsidianBody.setTextureOffset(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, p_i46362_1_);
        this.golemObsidianBody.setTextureOffset(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, p_i46362_1_ + 0.5F);
        this.golemObsidianRightArm = (new ModelRenderer(this)).setTextureSize(i, j);
        this.golemObsidianRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.golemObsidianRightArm.setTextureOffset(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, p_i46362_1_);
        this.golemObsidianLeftArm = (new ModelRenderer(this)).setTextureSize(i, j);
        this.golemObsidianLeftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.golemObsidianLeftArm.setTextureOffset(60, 58).addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, p_i46362_1_);
        this.golemObsidianLeftLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(i, j);
        this.golemObsidianLeftLeg.setRotationPoint(-4.0F, 18.0F + p_i46362_2_, 0.0F);
        this.golemObsidianLeftLeg.setTextureOffset(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, p_i46362_1_);
        this.golemObsidianRightLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(i, j);
        this.golemObsidianRightLeg.mirror = true;
        this.golemObsidianRightLeg.setTextureOffset(60, 0).setRotationPoint(5.0F, 18.0F + p_i46362_2_, 0.0F);
        this.golemObsidianRightLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, p_i46362_1_);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entityIn, float p_78088_2_, float limbSwing, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.setRotationAngles(p_78088_2_, limbSwing, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.golemObsidianHead.render(scale);
        this.golemObsidianBody.render(scale);
        this.golemObsidianLeftLeg.render(scale);
        this.golemObsidianRightLeg.render(scale);
        this.golemObsidianRightArm.render(scale);
        this.golemObsidianLeftArm.render(scale);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.golemObsidianHead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.golemObsidianHead.rotateAngleX = headPitch * 0.017453292F;
        this.golemObsidianLeftLeg.rotateAngleX = -1.5F * this.func_78172_a(limbSwing, 13.0F) * limbSwingAmount;
        this.golemObsidianRightLeg.rotateAngleX = 1.5F * this.func_78172_a(limbSwing, 13.0F) * limbSwingAmount;
        this.golemObsidianLeftLeg.rotateAngleY = 0.0F;
        this.golemObsidianRightLeg.rotateAngleY = 0.0F;
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    /*public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
    {
        EntityGolemObsidian entityGolemObsidian = (EntityGolemObsidian) entitylivingbaseIn;
        int i = entityGolemObsidian.getAttackTimer();

        if (i > 0)
        {
            this.golemObsidianRightArm.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - partialTickTime, 10.0F);
            this.golemObsidianLeftArm.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - partialTickTime, 10.0F);
        }
        else
        {
            int j = entityGolemObsidian.getHoldRoseTick();

            if (j > 0)
            {
                this.golemObsidianRightArm.rotateAngleX = -0.8F + 0.025F * this.func_78172_a((float)j, 70.0F);
                this.golemObsidianLeftArm.rotateAngleX = 0.0F;
            }
            else
            {
                this.golemObsidianRightArm.rotateAngleX = (-0.2F + 1.5F * this.func_78172_a(p_78086_2_, 13.0F)) * p_78086_3_;
                this.golemObsidianLeftArm.rotateAngleX = (-0.2F - 1.5F * this.func_78172_a(p_78086_2_, 13.0F)) * p_78086_3_;
            }
        }
    }*/

    private float func_78172_a(float p_78172_1_, float p_78172_2_)
    {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
    }
}