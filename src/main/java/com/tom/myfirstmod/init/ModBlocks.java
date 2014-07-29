package com.tom.myfirstmod.init;

import com.tom.myfirstmod.block.*;
import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

/**
 * Created by theyes on 21/07/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{

    public static final BlockMyFirstMod flag = new BlockFlag();
    public static final BlockMyFirstMod ukflag = new BlockUKFlag();
    public static final MapleLog mapleLog = new MapleLog();
    public static final MapleLeaves mapleLeaves = new MapleLeaves();
    public static final MapleSapling mapleSapling = new MapleSapling();

    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(ukflag, "ukflag");
        GameRegistry.registerBlock(mapleLog, "mapleLog");
        GameRegistry.registerBlock(mapleLeaves, "mapleLeaves");
        GameRegistry.registerBlock(mapleSapling, "mapleSapling");

    }

}
