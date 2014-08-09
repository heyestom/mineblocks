package com.tom.maplemod.block;

import com.tom.maplemod.creativetab.CreativeTabMapleMod;
import com.tom.maplemod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

/**
 * Created by theyes on 02/08/2014.
 */
public class MapleTappedLog extends MapleLog {

    public MapleTappedLog()
    {
        super();
        this.setBlockName("mapleTappedLog");
        this.setBlockTextureName("mapleTappedLog");
        this.setCreativeTab(CreativeTabMapleMod.MyFirstMod_Tab);
    }

    @SideOnly(Side.CLIENT)
    private IIcon topTexture;


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        topTexture = iconRegister.registerIcon((Reference.MOD_ID + ":" + "mapleTappedLogTop"));
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int p_150163_1_)
    {
        return blockIcon;
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int p_150161_1_)
    {
        return topTexture;
    }


    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
        return false;
    }

}
