package com.tom.myfirstmod;

import com.tom.myfirstmod.proxy.IProxy;
import com.tom.myfirstmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class myfirstmod {

    @Mod.Instance("myfirstmod")
    public static myfirstmod instance;

    @SidedProxy(clientSide = "com.tom.myfirstmod.proxy.ClientProxy",
                serverSide = "com.tom.myfirstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
