package com.tom.myfirstmod.init;

import com.tom.myfirstmod.item.ItemMapleLeaf;
import com.tom.myfirstmod.item.ItemMyFirstMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by theyes on 20/07/2014.
 */
public class ModItems {
    public static final ItemMyFirstMod mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
