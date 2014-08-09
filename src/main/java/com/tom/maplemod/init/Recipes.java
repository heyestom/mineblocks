package com.tom.maplemod.init;

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

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleTap, 1),  new ItemStack(Items.iron_ingot, 1)));


        GameRegistry.addSmelting(new ItemStack(ModBlocks.mapleLog), new ItemStack(Items.coal,1),0.35f);
        GameRegistry.addSmelting(new ItemStack(ModItems.mapleResin) , new ItemStack(ModItems.mapleSyrup,1), 0.35f);

    }
}
