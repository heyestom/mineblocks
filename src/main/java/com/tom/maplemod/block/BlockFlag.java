package com.tom.maplemod.block;

import com.tom.maplemod.creativetab.CreativeTabMapleMod;
import com.tom.maplemod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by theyes on 21/07/2014.
 */
public class BlockFlag extends BlockMyFirstMod {

    public BlockFlag(){
        super();
        this.setBlockName("flag");
        this.setBlockTextureName("flag");
        this.setCreativeTab(CreativeTabMapleMod.MyFirstMod_Tab);

    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.mapleLeaf;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return (4);
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta)
    {
        dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, block, meta);
    }
}

