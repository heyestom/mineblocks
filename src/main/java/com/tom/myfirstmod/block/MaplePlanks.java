package com.tom.myfirstmod.block;

import com.tom.myfirstmod.creativetab.CreativeTabMyFirstMod;
import com.tom.myfirstmod.init.ModItems;
import com.tom.myfirstmod.utility.LogHelper;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by theyes on 31/07/2014.
 */
public class MaplePlanks extends BlockMyFirstMod {

    public MaplePlanks() {
        super(Material.wood);
        this.setBlockName("maplePlanks");
        this.setBlockTextureName("maplePlanks");
        this.setCreativeTab(CreativeTabMyFirstMod.MyFirstMod_Tab);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeWood);
    }

    @Override
    public int quantityDropped(Random random) {
        return (1);
    }


    @Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
        return true;
    }



}
