package com.tom.myfirstmod.init;

import com.tom.myfirstmod.block.*;
import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

/**
 * Created by theyes on 21/07/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{

    public static final BlockMyFirstMod flag = new BlockFlag();
    public static final BlockMyFirstMod ukflag = new BlockUKFlag();
    public static final BlockMyFirstMod maplePlanks = new MaplePlanks();
    public static final MapleLog mapleLog = new MapleLog();
    public static final MapleTappedLog mapleTappedLog = new MapleTappedLog();
    public static final MapleLeaves mapleLeaves = new MapleLeaves();
    public static final MapleSapling mapleSapling = new MapleSapling();




    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(ukflag, "ukflag");
        GameRegistry.registerBlock(mapleLog, "mapleLog");
        GameRegistry.registerBlock(mapleTappedLog, "mapleTappedLog");
        GameRegistry.registerBlock(mapleLeaves, "mapleLeaves");
        GameRegistry.registerBlock(mapleSapling, "mapleSapling");
        GameRegistry.registerBlock(maplePlanks, "maplePlanks");


        // what catches fire???
        Blocks.fire.setFireInfo(mapleLog, 5, 20);
        Blocks.fire.setFireInfo(mapleTappedLog, 5, 20);
        Blocks.fire.setFireInfo(mapleLeaves, 5, 20);
        Blocks.fire.setFireInfo(maplePlanks, 5, 20);
    }

}
