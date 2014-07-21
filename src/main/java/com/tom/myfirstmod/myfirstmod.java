package com.tom.myfirstmod;

import com.tom.myfirstmod.handler.ConfigurationHandler;
import com.tom.myfirstmod.init.ModItems;
import com.tom.myfirstmod.proxy.IProxy;
import com.tom.myfirstmod.reference.Reference;
import com.tom.myfirstmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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

        LogHelper.info("pre init complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.info("init complete!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("post init complete!");

    }

}
