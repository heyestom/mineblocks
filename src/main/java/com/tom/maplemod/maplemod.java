package com.tom.maplemod;

import com.tom.maplemod.common.myFirstWorldGenerator;
import com.tom.maplemod.handler.ConfigurationHandler;
import com.tom.maplemod.init.ModBlocks;
import com.tom.maplemod.init.ModItems;
import com.tom.maplemod.init.Recipes;
import com.tom.maplemod.proxy.IProxy;
import com.tom.maplemod.reference.Reference;
import com.tom.maplemod.utility.LogHelper;
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

public class maplemod {

    @Mod.Instance("myfirstmod")
    public static maplemod instance;

    @SidedProxy(clientSide = "com.tom.maplemod.proxy.ClientProxy",
                serverSide = "com.tom.maplemod.proxy.ServerProxy")
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
