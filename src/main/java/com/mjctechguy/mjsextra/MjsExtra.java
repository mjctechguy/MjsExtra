package com.mjctechguy.mjsextra;



import com.mjctechguy.mjsextra.init.ModCreativeTab;
import com.mjctechguy.mjsextra.init.ModItems;
import com.mjctechguy.mjsextra.proxy.CommonProxy;
import com.mjctechguy.mjsextra.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class MjsExtra {

    @Instance(Reference.MOD_ID)
    public static MjsExtra instance = new MjsExtra();

    @SidedProxy(clientSide = Reference.MOD_CLIENT_PROXY_CLASS, serverSide = Reference.MOD_SERVER_PROXY_CLASS )
    public static CommonProxy proxy;

    public static final ModCreativeTab creativeTab = new ModCreativeTab(Reference.MOD_ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.LoadItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerItemRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
