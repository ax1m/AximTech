package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.ItemToolAT;
import ch.ax1m.aximtech.utils.LogHandler;
import ch.ax1m.aximtech.utils.Reference;
import ch.ax1m.aximtech.utils.Reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

import java.lang.reflect.Field;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModTools {

    public static final ItemToolAT swordFlint = new ItemToolAT(Names.Items.FLINT_SWORD, Names.Items.FLINT, "sword");
    public static final ItemToolAT swordBronze = new ItemToolAT(Names.Items.BRONZE_SWORD, Names.Items.BRONZE, "sword");
    public static final ItemToolAT swordSteel = new ItemToolAT(Names.Items.STEEL_SWORD, Names.Items.STEEL, "sword");
    public static final ItemToolAT swordTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_SWORD, Names.Items.TSTEEL, "sword");

    public static final ItemToolAT pickaxeFlint = new ItemToolAT(Names.Items.FLINT_PICKAXE, Names.Items.FLINT, "pickaxe");
    public static final ItemToolAT pickaxeBronze = new ItemToolAT(Names.Items.BRONZE_PICKAXE, Names.Items.BRONZE, "pickaxe");
    public static final ItemToolAT pickaxeSteel = new ItemToolAT(Names.Items.STEEL_PICKAXE, Names.Items.STEEL, "pickaxe");
    public static final ItemToolAT pickaxeTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_PICKAXE, Names.Items.TSTEEL, "pickaxe");

    public static final ItemToolAT axeFlint = new ItemToolAT(Names.Items.FLINT_AXE, Names.Items.FLINT, "axe");
    public static final ItemToolAT axeBronze = new ItemToolAT(Names.Items.BRONZE_AXE, Names.Items.BRONZE, "axe");
    public static final ItemToolAT axeSteel = new ItemToolAT(Names.Items.STEEL_AXE, Names.Items.STEEL, "axe");
    public static final ItemToolAT axeTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_AXE, Names.Items.TSTEEL, "axe");

    public static final ItemToolAT shovelFlint = new ItemToolAT(Names.Items.FLINT_SHOVEL, Names.Items.FLINT, "shovel");
    public static final ItemToolAT shovelBronze = new ItemToolAT(Names.Items.BRONZE_SHOVEL, Names.Items.BRONZE, "shovel");
    public static final ItemToolAT shovelSteel = new ItemToolAT(Names.Items.STEEL_SHOVEL, Names.Items.STEEL, "shovel");
    public static final ItemToolAT shovelTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_SHOVEL, Names.Items.TSTEEL, "shovel");

    public static final ItemToolAT hoeFlint = new ItemToolAT(Names.Items.FLINT_HOE, Names.Items.FLINT, "hoe");
    public static final ItemToolAT hoeBronze = new ItemToolAT(Names.Items.BRONZE_HOE, Names.Items.BRONZE, "hoe");
    public static final ItemToolAT hoeSteel = new ItemToolAT(Names.Items.STEEL_HOE, Names.Items.STEEL, "hoe");
    public static final ItemToolAT hoeTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_HOE, Names.Items.TSTEEL, "hoe");

    public static final ItemToolAT wrenchBronze = new ItemToolAT(Names.Items.BRONZE_WRENCH, Names.Items.BRONZE, "wrench");
    public static final ItemToolAT wrenchIron = new ItemToolAT(Names.Items.IRON_WRENCH, Names.Items.IRON, "wrench");
    public static final ItemToolAT wrenchSteel = new ItemToolAT(Names.Items.STEEL_WRENCH, Names.Items.STEEL, "wrench");
    public static final ItemToolAT wrenchTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_WRENCH, Names.Items.TSTEEL, "wrench");

    public static final ItemToolAT hammerBronze = new ItemToolAT(Names.Items.BRONZE_HAMMER, Names.Items.BRONZE, "hammer");
    public static final ItemToolAT hammerIron = new ItemToolAT(Names.Items.IRON_HAMMER, Names.Items.IRON, "hammer");
    public static final ItemToolAT hammerSteel = new ItemToolAT(Names.Items.STEEL_HAMMER, Names.Items.STEEL, "hammer");
    public static final ItemToolAT hammerTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_HAMMER, Names.Items.TSTEEL, "hammer");

    public static final ItemToolAT crowbarBronze = new ItemToolAT(Names.Items.BRONZE_CROWBAR, Names.Items.BRONZE, "crowbar");
    public static final ItemToolAT crowbarIron = new ItemToolAT(Names.Items.IRON_CROWBAR, Names.Items.IRON, "crowbar");
    public static final ItemToolAT crowbarSteel = new ItemToolAT(Names.Items.STEEL_CROWBAR, Names.Items.STEEL, "crowbar");
    public static final ItemToolAT crowbarTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_CROWBAR, Names.Items.TSTEEL, "crowbar");

    public static final ItemToolAT fileBronze = new ItemToolAT(Names.Items.BRONZE_FILE, Names.Items.BRONZE, "file");
    public static final ItemToolAT fileIron = new ItemToolAT(Names.Items.IRON_FILE, Names.Items.IRON, "file");
    public static final ItemToolAT fileSteel = new ItemToolAT(Names.Items.STEEL_FILE, Names.Items.STEEL, "file");
    public static final ItemToolAT fileTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_FILE, Names.Items.TSTEEL, "file");

    public static final ItemToolAT screwdriverBronze = new ItemToolAT(Names.Items.BRONZE_SCREWDRIVER, Names.Items.BRONZE, "screwdriver");
    public static final ItemToolAT screwdriverIron = new ItemToolAT(Names.Items.IRON_SCREWDRIVER, Names.Items.IRON, "screwdriver");
    public static final ItemToolAT screwdriverSteel = new ItemToolAT(Names.Items.STEEL_SCREWDRIVER, Names.Items.STEEL, "screwdriver");
    public static final ItemToolAT screwdriverTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_SCREWDRIVER, Names.Items.TSTEEL, "screwdriver");

    public static final ItemToolAT sawBronze = new ItemToolAT(Names.Items.BRONZE_SAW, Names.Items.BRONZE, "saw");
    public static final ItemToolAT sawIron = new ItemToolAT(Names.Items.IRON_SAW, Names.Items.IRON, "saw");
    public static final ItemToolAT sawSteel = new ItemToolAT(Names.Items.STEEL_SAW, Names.Items.STEEL, "saw");
    public static final ItemToolAT sawTungstenSteel = new ItemToolAT(Names.Items.TSTEEL_SAW, Names.Items.TSTEEL, "saw");

    public static void init() {
        Field[] fields = ModTools.class.getFields();
        for(Field field : fields) {
            ItemToolAT tool = null;
            try { tool = (ItemToolAT) field.get(null); }
            catch(IllegalAccessException e) { LogHandler.error(e); }
            GameRegistry.registerItem(tool, tool.getUnwrappedUnlocalizedName(), Reference.MOD_ID);
        }
    }
}
