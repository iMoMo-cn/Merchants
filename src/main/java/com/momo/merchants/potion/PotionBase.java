package com.momo.merchants.potion;

import com.momo.merchants.MoMoFramework;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class PotionBase extends Potion{
    public PotionBase(String name, boolean isBadEffect, int color) {
        super(isBadEffect, color);
        this.setRegistryName(name);
        this.setPotionName("effect." + name);

        ModPotion.POTIONS.add(this);
    }

    public boolean hasEffect(EntityLivingBase entity) {
        return hasEffect(entity, this);
    }

    public boolean hasEffect(EntityLivingBase entity, Potion potion) {
        return entity.getActivePotionEffect(potion) != null;
    }

    //continuousPotion Time trigger
    public boolean isReady(int duration, int amplifier)
    {
        return true;
    }


    public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, EntityLivingBase entityLivingBaseIn, int amplifier, double health)
    {

    }


    //tipped arrow effect
    public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier)
    {

    }

    private static final ResourceLocation TEXTURE = new ResourceLocation(MoMoFramework.MODID + ":textures/gui/potion.png");

    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect e, Minecraft mc){
        mc.getTextureManager().bindTexture(TEXTURE);
    }

    @Override
    public void renderHUDEffect(int x, int y, PotionEffect e, Minecraft mc, float alpha){
        mc.getTextureManager().bindTexture(TEXTURE);
   }
}
