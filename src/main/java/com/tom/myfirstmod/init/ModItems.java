package com.tom.myfirstmod.init;

import com.tom.myfirstmod.item.*;
import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by theyes on 20/07/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemMyFirstMod mapleLeaf = new ItemMapleLeaf();
    public static final ItemMyFirstMod mapleResin = new MapleResin();
    public static final ItemMyFirstMod mapleTap = new MapleTap();
    public static final MapleSyrup mapleSyrup = new MapleSyrup();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(mapleResin, "mapleResin");
        GameRegistry.registerItem(mapleTap, "mapleTap");
        GameRegistry.registerItem(mapleSyrup, "mapleSyrup");
    }
}

