package com.momo.merchants.util;

import com.momo.merchants.util.NBTStrDef.IDLNBTDef;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import static com.momo.merchants.util.NBTStrDef.IDLNBTDef.*;
import static com.momo.merchants.util.NBTStrDef.IDLNBTUtil.*;

public class IDLSkillNBT {
    public static final String SUCCESS_DESC_KEY = ".on_sucess";
    public static final String IN_CD_DESC_KEY = ".on_cooldown";
    public int level;
    public int range_boost = 0;
    public int duration_boost = 0;
    public int[] gua_boost = new int[8];

//    private final NBTTagCompound basic;

//    public IDLSkillNBT()
//    {
//        level = 1;
//        range_boost = 0;
//        duration_boost = 0;
//
//        basic = new NBTTagCompound();
//    }
//
//    public IDLSkillNBT(NBTTagCompound srcNBT)
//    {
//        readFromBasic(srcNBT);
//        basic = srcNBT;
//    }
//
//    public void readFromBasic(NBTTagCompound tag)
//    {
//        if (tag != null)
//        {
//            level = tag.getInteger(IDLNBTDef.LEVEL_TAG);
//            range_boost = tag.getInteger(IDLNBTDef.RANGE_BOOST);
//            duration_boost = tag.getInteger(IDLNBTDef.DURA_BOOST);
//        }
//    }

//    public void writeToBasic(NBTTagCompound tag)
//    {
//        if (tag == null)
//        {
//            tag = new NBTTagCompound();
//        }
//
//        tag.setInteger(IDLNBTDef.LEVEL_TAG, level);
//        tag.setInteger(IDLNBTDef.RANGE_BOOST, range_boost);
//        tag.setInteger(IDLNBTDef.DURA_BOOST, duration_boost);
//    }
//
//    public NBTTagCompound getBasic()
//    {
//        NBTTagCompound tag = basic.copy();
//        writeToBasic(tag);
//
//        return tag;
//    }
//
//    public void save()
//    {
//        writeToBasic(basic);
//    }
    //----------------------
    //Integer

    @SideOnly(Side.CLIENT)
    public static void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag,
                                       boolean shiftToShowDesc, boolean showGuaSocketDesc, boolean use_flavor, String mainDescOrFlavor) {

        boolean shiftPressed = !shiftToShowDesc || CommonFunctions.isShiftPressed();
        if (shiftPressed)
        {
            if (!mainDescOrFlavor.isEmpty())
            {
                tooltip.add(mainDescOrFlavor);
            }

        }
    }

    public static int getLevel(ItemStack stack)
    {

        int level = GetInt(stack, LEVEL_TAG);

        if (level <= 0)
        {
            return 1;
        }


        return level;
    }



    public static boolean IsCasting(ItemStack stack)
    {
        return GetBoolean(stack, IDLNBTDef.IS_CASTING);
    }

    public static void SetCasting(ItemStack stack, boolean bool)
    {
        SetBoolean(stack, IDLNBTDef.IS_CASTING, bool);
    }


}
