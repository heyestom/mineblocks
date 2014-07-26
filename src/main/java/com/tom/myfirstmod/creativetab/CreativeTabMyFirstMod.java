package com.tom.myfirstmod.creativetab;

import com.tom.myfirstmod.init.ModItems;
import com.tom.myfirstmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by theyes on 22/07/2014.
 */
public class CreativeTabMyFirstMod {

    public static final CreativeTabs MyFirstMod_Tab = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {

            return ModItems.mapleLeaf;

        }

        public String getTranslatedTabLabel(){
            return "Mod Items";
        }
    };
}
