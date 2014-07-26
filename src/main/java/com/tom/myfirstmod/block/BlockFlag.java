package com.tom.myfirstmod.block;

import com.tom.myfirstmod.creativetab.CreativeTabMyFirstMod;
import com.tom.myfirstmod.init.ModItems;
import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
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
        this.setCreativeTab(CreativeTabMyFirstMod.MyFirstMod_Tab);

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

