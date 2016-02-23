package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.*;
import ch.ax1m.aximtech.utils.Reference;
import net.minecraft.init.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemAT nuggetIron= new ItemAT(Reference.Names.Items.IRON_NUGGET);
    public static final ItemAT ingotTin= new ItemAT(Reference.Names.Items.TIN);
    public static final ItemAT nuggetTin= new ItemAT(Reference.Names.Items.TIN_NUGGET);
    public static final ItemAT ingotCopper= new ItemAT(Reference.Names.Items.COPPER);
    public static final ItemAT nuggetCopper= new ItemAT(Reference.Names.Items.COPPER_NUGGET);
    public static final ItemAT ingotBronze= new ItemAT(Reference.Names.Items.BRONZE);
    public static final ItemAT nuggetBronze= new ItemAT(Reference.Names.Items.BRONZE_NUGGET);
    public static final ItemAT ingotSteel = new ItemAT(Reference.Names.Items.STEEL);
    public static final ItemAT nuggetSteel = new ItemAT(Reference.Names.Items.STEEL_NUGGET);
    public static final ItemAT ingotTungstenCoated = new ItemAT(Reference.Names.Items.TCOATED);
    public static final ItemAT ingotTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL);
    public static final ItemAT nuggetTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_NUGGET);

    public static final ItemAT dustBronze = new ItemAT(Reference.Names.Items.BRONZE_DUST);

    public static final ItemAT oreRocksTin = new ItemAT(Reference.Names.Items.TIN_ROCKS);
    public static final ItemAT oreGravelTin = new ItemAT(Reference.Names.Items.TIN_GRAVEL);
    public static final ItemAT oreSandTin = new ItemAT(Reference.Names.Items.TIN_SAND);
    public static final ItemAT dustTin = new ItemAT(Reference.Names.Items.TIN_DUST);

    public static final ItemAT oreRocksCopper = new ItemAT(Reference.Names.Items.COPPER_ROCKS);
    public static final ItemAT oreGravelCopper = new ItemAT(Reference.Names.Items.COPPER_GRAVEL);
    public static final ItemAT oreSandCopper = new ItemAT(Reference.Names.Items.COPPER_SAND);
    public static final ItemAT dustCopper = new ItemAT(Reference.Names.Items.COPPER_DUST);

    public static final ItemAT oreRocksTungsten = new ItemAT(Reference.Names.Items.TUNGSTEN_ROCKS);
    public static final ItemAT oreGravelTungsten = new ItemAT(Reference.Names.Items.TUNGSTEN_GRAVEL);
    public static final ItemAT oreSandTungsten = new ItemAT(Reference.Names.Items.TUNGSTEN_SAND);
    public static final ItemAT dustTungsten = new ItemAT(Reference.Names.Items.TUNGSTEN_DUST);

    public static final ItemToolAT swordFlint = new ItemToolAT(Reference.Names.Items.FLINT_SWORD, "sword", Reference.Materials.FLINT);
    public static final ItemToolAT swordBronze = new ItemToolAT(Reference.Names.Items.BRONZE_SWORD, "sword", Reference.Materials.BRONZE);
    public static final ItemToolAT swordSteel = new ItemToolAT(Reference.Names.Items.STEEL_SWORD, "sword", Reference.Materials.STEEL);
    public static final ItemToolAT swordTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_SWORD, "sword", Reference.Materials.TSTEEL);

    public static final ItemToolAT pickaxeFlint = new ItemToolAT(Reference.Names.Items.FLINT_PICKAXE, "pickaxe", Reference.Materials.FLINT);
    public static final ItemToolAT pickaxeBronze = new ItemToolAT(Reference.Names.Items.BRONZE_PICKAXE, "pickaxe", Reference.Materials.BRONZE);
    public static final ItemToolAT pickaxeSteel = new ItemToolAT(Reference.Names.Items.STEEL_PICKAXE, "pickaxe", Reference.Materials.STEEL);
    public static final ItemToolAT pickaxeTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_PICKAXE, "pickaxe", Reference.Materials.TSTEEL);

    public static final ItemToolAT axeFlint = new ItemToolAT(Reference.Names.Items.FLINT_AXE, "axe", Reference.Materials.FLINT);
    public static final ItemToolAT axeBronze = new ItemToolAT(Reference.Names.Items.BRONZE_AXE, "axe", Reference.Materials.BRONZE);
    public static final ItemToolAT axeSteel = new ItemToolAT(Reference.Names.Items.STEEL_AXE, "axe", Reference.Materials.STEEL);
    public static final ItemToolAT axeTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_AXE, "axe", Reference.Materials.TSTEEL);

    public static final ItemToolAT shovelFlint = new ItemToolAT(Reference.Names.Items.FLINT_SHOVEL, "shovel", Reference.Materials.FLINT);
    public static final ItemToolAT shovelBronze = new ItemToolAT(Reference.Names.Items.BRONZE_SHOVEL, "shovel", Reference.Materials.BRONZE);
    public static final ItemToolAT shovelSteel = new ItemToolAT(Reference.Names.Items.STEEL_SHOVEL, "shovel", Reference.Materials.STEEL);
    public static final ItemToolAT shovelTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_SHOVEL, "shovel", Reference.Materials.TSTEEL);

    public static final ItemToolAT hoeFlint = new ItemToolAT(Reference.Names.Items.FLINT_HOE, "hoe", Reference.Materials.FLINT);
    public static final ItemToolAT hoeBronze = new ItemToolAT(Reference.Names.Items.BRONZE_HOE, "hoe", Reference.Materials.BRONZE);
    public static final ItemToolAT hoeSteel = new ItemToolAT(Reference.Names.Items.STEEL_HOE, "hoe", Reference.Materials.STEEL);
    public static final ItemToolAT hoeTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_HOE, "hoe", Reference.Materials.TSTEEL);

    public static final ItemToolAT wrenchBronze = new ItemToolAT(Reference.Names.Items.BRONZE_WRENCH, "wrench", Reference.Materials.BRONZE);
    public static final ItemToolAT wrenchIron = new ItemToolAT(Reference.Names.Items.IRON_WRENCH, "wrench", Item.ToolMaterial.IRON);
    public static final ItemToolAT wrenchSteel = new ItemToolAT(Reference.Names.Items.STEEL_WRENCH, "wrench", Reference.Materials.STEEL);
    public static final ItemToolAT wrenchTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_WRENCH, "wrench", Reference.Materials.TSTEEL);

    public static final ItemToolAT hammerBronze = new ItemToolAT(Reference.Names.Items.BRONZE_HAMMER, "hammer", Reference.Materials.BRONZE);
    public static final ItemToolAT hammerIron = new ItemToolAT(Reference.Names.Items.IRON_HAMMER, "hammer", Item.ToolMaterial.IRON);
    public static final ItemToolAT hammerSteel = new ItemToolAT(Reference.Names.Items.STEEL_HAMMER, "hammer", Reference.Materials.STEEL);
    public static final ItemToolAT hammerTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_HAMMER, "hammer", Reference.Materials.TSTEEL);

    public static final ItemToolAT crowbarBronze = new ItemToolAT(Reference.Names.Items.BRONZE_CROWBAR, "crowbar", Reference.Materials.BRONZE);
    public static final ItemToolAT crowbarIron = new ItemToolAT(Reference.Names.Items.IRON_CROWBAR, "crowbar", Item.ToolMaterial.IRON);
    public static final ItemToolAT crowbarSteel = new ItemToolAT(Reference.Names.Items.STEEL_CROWBAR, "crowbar", Reference.Materials.STEEL);
    public static final ItemToolAT crowbarTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_CROWBAR, "crowbar", Reference.Materials.TSTEEL);

    public static final ItemToolAT fileBronze = new ItemToolAT(Reference.Names.Items.BRONZE_FILE, "file", Reference.Materials.BRONZE);
    public static final ItemToolAT fileIron = new ItemToolAT(Reference.Names.Items.IRON_FILE, "file", Item.ToolMaterial.IRON);
    public static final ItemToolAT fileSteel = new ItemToolAT(Reference.Names.Items.STEEL_FILE, "file", Reference.Materials.STEEL);
    public static final ItemToolAT fileTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_FILE, "file", Reference.Materials.TSTEEL);

    public static final ItemToolAT screwdriverBronze = new ItemToolAT(Reference.Names.Items.BRONZE_SCREWDRIVER, "screwdriver", Reference.Materials.BRONZE);
    public static final ItemToolAT screwdriverIron = new ItemToolAT(Reference.Names.Items.IRON_SCREWDRIVER, "screwdriver", Item.ToolMaterial.IRON);
    public static final ItemToolAT screwdriverSteel = new ItemToolAT(Reference.Names.Items.STEEL_SCREWDRIVER, "screwdriver", Reference.Materials.STEEL);
    public static final ItemToolAT screwdriverTungstenSteel = new ItemToolAT(Reference.Names.Items.TSTEEL_SCREWDRIVER, "screwdriver", Reference.Materials.TSTEEL);

    public static void init() {

        GameRegistry.registerItem(nuggetIron, Reference.Names.Items.IRON_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotTin, Reference.Names.Items.TIN, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetTin, Reference.Names.Items.TIN_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotCopper, Reference.Names.Items.COPPER, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetCopper, Reference.Names.Items.COPPER_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotBronze, Reference.Names.Items.BRONZE, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetBronze, Reference.Names.Items.BRONZE_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotSteel, Reference.Names.Items.STEEL, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetSteel, Reference.Names.Items.STEEL_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotTungstenCoated, Reference.Names.Items.TCOATED, Reference.MOD_ID);
        GameRegistry.registerItem(ingotTungstenSteel, Reference.Names.Items.TSTEEL, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetTungstenSteel, Reference.Names.Items.TSTEEL_NUGGET, Reference.MOD_ID);

        GameRegistry.registerItem(dustBronze, Reference.Names.Items.BRONZE_DUST, Reference.MOD_ID);

        GameRegistry.registerItem(oreRocksTin, Reference.Names.Items.TIN_ROCKS, Reference.MOD_ID);
        GameRegistry.registerItem(oreGravelTin, Reference.Names.Items.TIN_GRAVEL, Reference.MOD_ID);
        GameRegistry.registerItem(oreSandTin, Reference.Names.Items.TIN_SAND, Reference.MOD_ID);
        GameRegistry.registerItem(dustTin, Reference.Names.Items.TIN_DUST, Reference.MOD_ID);

        GameRegistry.registerItem(oreRocksCopper, Reference.Names.Items.COPPER_ROCKS, Reference.MOD_ID);
        GameRegistry.registerItem(oreGravelCopper, Reference.Names.Items.COPPER_GRAVEL, Reference.MOD_ID);
        GameRegistry.registerItem(oreSandCopper, Reference.Names.Items.COPPER_SAND, Reference.MOD_ID);
        GameRegistry.registerItem(dustCopper, Reference.Names.Items.COPPER_DUST, Reference.MOD_ID);

        GameRegistry.registerItem(oreRocksTungsten, Reference.Names.Items.TUNGSTEN_ROCKS, Reference.MOD_ID);
        GameRegistry.registerItem(oreGravelTungsten, Reference.Names.Items.TUNGSTEN_GRAVEL, Reference.MOD_ID);
        GameRegistry.registerItem(oreSandTungsten, Reference.Names.Items.TUNGSTEN_SAND, Reference.MOD_ID);
        GameRegistry.registerItem(dustTungsten, Reference.Names.Items.TUNGSTEN_DUST, Reference.MOD_ID);

        OreDictionary.registerOre(Reference.Names.Items.FLINT, Items.flint);
        OreDictionary.registerOre(Reference.Names.Items.IRON_NUGGET, nuggetIron);
        OreDictionary.registerOre(Reference.Names.Items.TIN, ingotTin);
        OreDictionary.registerOre(Reference.Names.Items.TIN_NUGGET, nuggetTin);
        OreDictionary.registerOre(Reference.Names.Items.TIN_DUST, dustTin);
        OreDictionary.registerOre(Reference.Names.Items.COPPER, ingotCopper);
        OreDictionary.registerOre(Reference.Names.Items.COPPER_NUGGET, nuggetCopper);
        OreDictionary.registerOre(Reference.Names.Items.COPPER_DUST, dustCopper);
        OreDictionary.registerOre(Reference.Names.Items.BRONZE, ingotBronze);
        OreDictionary.registerOre(Reference.Names.Items.BRONZE_NUGGET, nuggetBronze);
        OreDictionary.registerOre(Reference.Names.Items.BRONZE_DUST, dustBronze);
        OreDictionary.registerOre(Reference.Names.Items.STEEL, ingotSteel);
        OreDictionary.registerOre(Reference.Names.Items.STEEL_NUGGET, nuggetSteel);
        OreDictionary.registerOre(Reference.Names.Items.TUNGSTEN_DUST, dustTungsten);
        OreDictionary.registerOre(Reference.Names.Items.TSTEEL, ingotTungstenSteel);
        OreDictionary.registerOre(Reference.Names.Items.TSTEEL_NUGGET, nuggetTungstenSteel);

        GameRegistry.registerItem(swordFlint, Reference.Names.Items.FLINT_SWORD, Reference.MOD_ID);
        GameRegistry.registerItem(swordBronze, Reference.Names.Items.BRONZE_SWORD, Reference.MOD_ID);
        GameRegistry.registerItem(swordSteel, Reference.Names.Items.STEEL_SWORD, Reference.MOD_ID);
        GameRegistry.registerItem(swordTungstenSteel, Reference.Names.Items.TSTEEL_SWORD, Reference.MOD_ID);

        GameRegistry.registerItem(pickaxeFlint, Reference.Names.Items.FLINT_PICKAXE, Reference.MOD_ID);
        GameRegistry.registerItem(pickaxeBronze, Reference.Names.Items.BRONZE_PICKAXE, Reference.MOD_ID);
        GameRegistry.registerItem(pickaxeSteel, Reference.Names.Items.STEEL_PICKAXE, Reference.MOD_ID);
        GameRegistry.registerItem(pickaxeTungstenSteel, Reference.Names.Items.TSTEEL_PICKAXE, Reference.MOD_ID);

        GameRegistry.registerItem(axeFlint, Reference.Names.Items.FLINT_AXE, Reference.MOD_ID);
        GameRegistry.registerItem(axeBronze, Reference.Names.Items.BRONZE_AXE, Reference.MOD_ID);
        GameRegistry.registerItem(axeSteel, Reference.Names.Items.STEEL_AXE, Reference.MOD_ID);
        GameRegistry.registerItem(axeTungstenSteel, Reference.Names.Items.TSTEEL_AXE, Reference.MOD_ID);

        GameRegistry.registerItem(shovelFlint, Reference.Names.Items.FLINT_SHOVEL, Reference.MOD_ID);
        GameRegistry.registerItem(shovelBronze, Reference.Names.Items.BRONZE_SHOVEL, Reference.MOD_ID);
        GameRegistry.registerItem(shovelSteel, Reference.Names.Items.STEEL_SHOVEL, Reference.MOD_ID);
        GameRegistry.registerItem(shovelTungstenSteel, Reference.Names.Items.TSTEEL_SHOVEL, Reference.MOD_ID);

        GameRegistry.registerItem(hoeFlint, Reference.Names.Items.FLINT_HOE, Reference.MOD_ID);
        GameRegistry.registerItem(hoeBronze, Reference.Names.Items.BRONZE_HOE, Reference.MOD_ID);
        GameRegistry.registerItem(hoeSteel, Reference.Names.Items.STEEL_HOE, Reference.MOD_ID);
        GameRegistry.registerItem(hoeTungstenSteel, Reference.Names.Items.TSTEEL_HOE, Reference.MOD_ID);

        GameRegistry.registerItem(wrenchBronze, Reference.Names.Items.BRONZE_WRENCH, Reference.MOD_ID);
        GameRegistry.registerItem(wrenchIron, Reference.Names.Items.IRON_WRENCH, Reference.MOD_ID);
        GameRegistry.registerItem(wrenchSteel, Reference.Names.Items.STEEL_WRENCH, Reference.MOD_ID);
        GameRegistry.registerItem(wrenchTungstenSteel, Reference.Names.Items.TSTEEL_WRENCH, Reference.MOD_ID);

        GameRegistry.registerItem(hammerBronze, Reference.Names.Items.BRONZE_HAMMER, Reference.MOD_ID);
        GameRegistry.registerItem(hammerIron, Reference.Names.Items.IRON_HAMMER, Reference.MOD_ID);
        GameRegistry.registerItem(hammerSteel, Reference.Names.Items.STEEL_HAMMER, Reference.MOD_ID);
        GameRegistry.registerItem(hammerTungstenSteel, Reference.Names.Items.TSTEEL_HAMMER, Reference.MOD_ID);

        GameRegistry.registerItem(crowbarBronze, Reference.Names.Items.BRONZE_CROWBAR, Reference.MOD_ID);
        GameRegistry.registerItem(crowbarIron, Reference.Names.Items.IRON_CROWBAR, Reference.MOD_ID);
        GameRegistry.registerItem(crowbarSteel, Reference.Names.Items.STEEL_CROWBAR, Reference.MOD_ID);
        GameRegistry.registerItem(crowbarTungstenSteel, Reference.Names.Items.TSTEEL_CROWBAR, Reference.MOD_ID);

        GameRegistry.registerItem(fileBronze, Reference.Names.Items.BRONZE_FILE, Reference.MOD_ID);
        GameRegistry.registerItem(fileIron, Reference.Names.Items.IRON_FILE, Reference.MOD_ID);
        GameRegistry.registerItem(fileSteel, Reference.Names.Items.STEEL_FILE, Reference.MOD_ID);
        GameRegistry.registerItem(fileTungstenSteel, Reference.Names.Items.TSTEEL_FILE, Reference.MOD_ID);

        GameRegistry.registerItem(screwdriverBronze, Reference.Names.Items.BRONZE_SCREWDRIVER, Reference.MOD_ID);
        GameRegistry.registerItem(screwdriverIron, Reference.Names.Items.IRON_SCREWDRIVER, Reference.MOD_ID);
        GameRegistry.registerItem(screwdriverSteel, Reference.Names.Items.STEEL_SCREWDRIVER, Reference.MOD_ID);
        GameRegistry.registerItem(screwdriverTungstenSteel, Reference.Names.Items.TSTEEL_SCREWDRIVER, Reference.MOD_ID);
    }
}
