package com.tom.myfirstmod.init;

import com.tom.myfirstmod.item.ItemMapleLeaf;
import com.tom.myfirstmod.item.ItemMyFirstMod;
import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by theyes on 20/07/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemMyFirstMod mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}

