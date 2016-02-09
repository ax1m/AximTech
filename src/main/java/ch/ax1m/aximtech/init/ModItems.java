package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.*;
import ch.ax1m.aximtech.utils.Reference;
import net.minecraft.init.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

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

    public static final ItemAT ingotBronze= new ItemAT(Reference.Names.Items.BRONZE);
    public static final ItemAT nuggetBronze= new ItemAT(Reference.Names.Items.BRONZE_NUGGET);
    public static final ItemAT nuggetIron= new ItemAT(Reference.Names.Items.IRON_NUGGET);
    public static final ItemAT ingotSteel = new ItemAT(Reference.Names.Items.STEEL);
    public static final ItemAT nuggetSteel = new ItemAT(Reference.Names.Items.STEEL_NUGGET);
    public static final ItemAT ingotTungstenCoated = new ItemAT(Reference.Names.Items.TCOATED);
    public static final ItemAT ingotTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL);
    public static final ItemAT nuggetTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_NUGGET);

    public static void init() {

        GameRegistry.registerItem(ingotBronze, Reference.Names.Items.BRONZE, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetBronze, Reference.Names.Items.BRONZE_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetIron, Reference.Names.Items.IRON_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotSteel, Reference.Names.Items.STEEL, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetSteel, Reference.Names.Items.STEEL_NUGGET, Reference.MOD_ID);
        GameRegistry.registerItem(ingotTungstenCoated, Reference.Names.Items.TCOATED, Reference.MOD_ID);
        GameRegistry.registerItem(ingotTungstenSteel, Reference.Names.Items.TSTEEL, Reference.MOD_ID);
        GameRegistry.registerItem(nuggetTungstenSteel, Reference.Names.Items.TSTEEL_NUGGET, Reference.MOD_ID);

        OreDictionary.registerOre("itemFlint", Items.flint);
        OreDictionary.registerOre("ingotBronze", ingotBronze);
        OreDictionary.registerOre("nuggetBronze", nuggetBronze);
        OreDictionary.registerOre("nuggetIron", nuggetIron);
        OreDictionary.registerOre("ingotSteel", ingotSteel);
        OreDictionary.registerOre("nuggetSteel", nuggetSteel);
        OreDictionary.registerOre("ingotTungstenSteel", ingotTungstenSteel);
        OreDictionary.registerOre("nuggetTungstenSteel", nuggetTungstenSteel);


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
    }
}
