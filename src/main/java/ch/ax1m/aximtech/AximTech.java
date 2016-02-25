package ch.ax1m.aximtech;

import ch.ax1m.aximtech.init.*;
import ch.ax1m.aximtech.proxy.IProxyAT;
import ch.ax1m.aximtech.utils.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class AximTech
{
    @Mod.Instance(Reference.MOD_ID)
    public static AximTech instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxyAT proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHandler.info("Registering items");
        ModBlocks.init();
        ModItems.init();
        ModTools.init();
        LogHandler.info("Registering worldgen");
        GameRegistry.registerWorldGenerator(new OreGenerator(), 1);
        LogHandler.info("PreInitialization complete");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        if (ConfigurationHandler.DO_HARVEST_LEVEL_TWEAK) {
            LogHandler.info("Enabling HarvestLevel Nerfs");
            MinecraftForge.EVENT_BUS.register(new HarvestLevelNerf());
        }
        LogHandler.info("Registering recipes");
        Reference.ToolData.init();
        Recipes.init();
        LogHandler.info("Initialization complete");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) { LogHandler.info("PostInitialization complete"); }
}
