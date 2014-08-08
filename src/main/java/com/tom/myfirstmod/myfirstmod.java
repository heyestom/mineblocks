package com.tom.myfirstmod;

import com.tom.myfirstmod.common.myFirstWorldGenerator;
import com.tom.myfirstmod.handler.ConfigurationHandler;
import com.tom.myfirstmod.init.ModBlocks;
import com.tom.myfirstmod.init.ModItems;
import com.tom.myfirstmod.init.Recipes;
import com.tom.myfirstmod.proxy.IProxy;
import com.tom.myfirstmod.reference.Reference;
import com.tom.myfirstmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class myfirstmod {

    @Mod.Instance("myfirstmod")
    public static myfirstmod instance;

    @SidedProxy(clientSide = "com.tom.myfirstmod.proxy.ClientProxy",
                serverSide = "com.tom.myfirstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("pre init complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.mapleLog,1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.mapleTappedLog,1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("plankWood", new ItemStack(ModBlocks.maplePlanks,1, OreDictionary.WILDCARD_VALUE));

        Recipes.init();

        GameRegistry.registerWorldGenerator(new myFirstWorldGenerator(),1);

        LogHelper.info("init complete!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("post init complete!");

    }

}
