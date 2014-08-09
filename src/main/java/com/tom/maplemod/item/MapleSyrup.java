package com.tom.maplemod.item;

import com.tom.maplemod.creativetab.CreativeTabMapleMod;
import com.tom.maplemod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * Created by theyes on 08/08/2014.
 */
public class MapleSyrup extends ItemFood  {

    private static final int healAmount = 2;
    private static final float saturation = 2.0f;
    private static final boolean isWolfFavMeat = false;

    public MapleSyrup() {
        super(healAmount, saturation, isWolfFavMeat);
        this.setUnlocalizedName("mapleSyrup");
        this.setCreativeTab(CreativeTabMapleMod.MyFirstMod_Tab);
        this.setAlwaysEdible();
    }



    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
