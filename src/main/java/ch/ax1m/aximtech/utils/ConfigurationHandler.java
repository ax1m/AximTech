package ch.ax1m.aximtech.utils;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    private static Configuration configuration;
    public static boolean DO_HARVEST_LEVEL_TWEAK;
    public static boolean SPAWN_TIN;
    public static boolean SPAWN_COPPER;
    public static boolean SPAWN_TUNGSTEN;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {

        DO_HARVEST_LEVEL_TWEAK = configuration.get("main", "miningLevelNerf", true,
                "Increases harvest level of coal, iron, and diamond ores by 1 each").getBoolean(true);

        SPAWN_TIN = configuration.get("ores", "spawnTin", true,
                "Adds Tin Ore to your worldgen").getBoolean(true);

        SPAWN_COPPER = configuration.get("ores", "spawnCopper", true,
                "Adds Copper Ore to your worldgen").getBoolean(true);

        SPAWN_TUNGSTEN = configuration.get("ores", "spawnTungsten", true,
                "Adds Tungsten Ore to your worldgen").getBoolean(true);

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }
}
