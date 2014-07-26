package com.tom.myfirstmod.block;

import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

/**
 * Created by theyes on 26/07/2014.
 */
public class MapleLog extends BlockMyFirstMod {

    public MapleLog() {
        super(Material.wood);
        this.setBlockName("mapleLog");
        this.setBlockTextureName("mapleLog");
    }

    @SideOnly(Side.CLIENT)
    private IIcon topTexture;


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        topTexture = iconRegister.registerIcon((Reference.MOD_ID + ":" + "mapleLogTop"));
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if(side == 0 || side == 1){
            return this.topTexture;
        }
        return this.blockIcon;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
        return true;
    }
}
