package com.tom.myfirstmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by theyes on 26/07/2014.
 */
public class Recipes {

    public static void init(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.maplePlanks, 4, 0),  "logWood"));

//        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.planks, 4, 0),  "logWood"));

    }
}
