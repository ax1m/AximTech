package ch.ax1m.aximtech.utils;

import ch.ax1m.aximtech.init.ModBlocks;
import ch.ax1m.aximtech.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import scala.reflect.internal.Types;

import java.util.*;

public class Reference {
    public static final String MOD_ID = "AximTech";
    public static final String MOD_NAME = MOD_ID;
    public static final String MOD_VERSION = "0.1.12";
    public static final String CLIENT_PROXY_CLASS = "ch.ax1m.aximtech.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "ch.ax1m.aximtech.proxy.ServerProxy";

    public static final class Names {
        public static final class Items {
            public static final String FLINT = "itemFlint";
            public static final String IRON = "ingotIron";
            public static final String IRON_NUGGET = "nuggetIron";
            public static final String TIN = "ingotTin";
            public static final String TIN_NUGGET = "nuggetTin";
            public static final String COPPER = "ingotCopper";
            public static final String COPPER_NUGGET = "nuggetCopper";
            public static final String BRONZE = "ingotBronze";
            public static final String BRONZE_NUGGET = "nuggetBronze";
            public static final String STEEL = "ingotSteel";
            public static final String STEEL_NUGGET = "nuggetSteel";
            public static final String TCOATED = "ingotTungstenCoated";
            public static final String TSTEEL = "ingotTungstenSteel";
            public static final String TSTEEL_NUGGET = "nuggetTungstenSteel";

            public static final String BRONZE_DUST = "dustBronze";

            public static final String IRON_ROCKS = "oreRocksIron";
            public static final String IRON_GRAVEL = "oreGravelIron";
            public static final String IRON_SAND = "oreSandIron";
            public static final String IRON_DUST = "dustIron";

            public static final String GOLD_ROCKS = "oreRocksGold";
            public static final String GOLD_GRAVEL = "oreGravelGold";
            public static final String GOLD_SAND = "oreSandGold";
            public static final String GOLD_DUST = "dustGold";

            public static final String TIN_ROCKS = "oreRocksTin";
            public static final String TIN_GRAVEL = "oreGravelTin";
            public static final String TIN_SAND = "oreSandTin";
            public static final String TIN_DUST = "dustTin";

            public static final String COPPER_ROCKS = "oreRocksCopper";
            public static final String COPPER_GRAVEL = "oreGravelCopper";
            public static final String COPPER_SAND = "oreSandCopper";
            public static final String COPPER_DUST = "dustCopper";

            public static final String TUNGSTEN_ROCKS = "oreRocksTungsten";
            public static final String TUNGSTEN_GRAVEL = "oreGravelTungsten";
            public static final String TUNGSTEN_SAND = "oreSandTungsten";
            public static final String TUNGSTEN_DUST = "dustTungsten";

            public static final String FLINT_SWORD = "swordFlint";
            public static final String BRONZE_SWORD = "swordBronze";
            public static final String STEEL_SWORD = "swordSteel";
            public static final String TSTEEL_SWORD = "swordTungstenSteel";

            public static final String FLINT_PICKAXE = "pickaxeFlint";
            public static final String BRONZE_PICKAXE = "pickaxeBronze";
            public static final String STEEL_PICKAXE = "pickaxeSteel";
            public static final String TSTEEL_PICKAXE = "pickaxeTungstenSteel";

            public static final String FLINT_AXE = "axeFlint";
            public static final String BRONZE_AXE = "axeBronze";
            public static final String STEEL_AXE = "axeSteel";
            public static final String TSTEEL_AXE = "axeTungstenSteel";

            public static final String FLINT_SHOVEL = "shovelFlint";
            public static final String BRONZE_SHOVEL = "shovelBronze";
            public static final String STEEL_SHOVEL = "shovelSteel";
            public static final String TSTEEL_SHOVEL = "shovelTungstenSteel";

            public static final String FLINT_HOE = "hoeFlint";
            public static final String BRONZE_HOE = "hoeBronze";
            public static final String STEEL_HOE = "hoeSteel";
            public static final String TSTEEL_HOE = "hoeTungstenSteel";

            public static final String IRON_WRENCH = "wrenchIron";
            public static final String BRONZE_WRENCH = "wrenchBronze";
            public static final String STEEL_WRENCH = "wrenchSteel";
            public static final String TSTEEL_WRENCH = "wrenchTungstenSteel";

            public static final String IRON_HAMMER = "hammerIron";
            public static final String BRONZE_HAMMER = "hammerBronze";
            public static final String STEEL_HAMMER = "hammerSteel";
            public static final String TSTEEL_HAMMER = "hammerTungstenSteel";

            public static final String IRON_CROWBAR = "crowbarIron";
            public static final String BRONZE_CROWBAR = "crowbarBronze";
            public static final String STEEL_CROWBAR = "crowbarSteel";
            public static final String TSTEEL_CROWBAR = "crowbarTungstenSteel";

            public static final String IRON_FILE = "fileIron";
            public static final String BRONZE_FILE = "fileBronze";
            public static final String STEEL_FILE = "fileSteel";
            public static final String TSTEEL_FILE = "fileTungstenSteel";

            public static final String IRON_SCREWDRIVER = "screwdriverIron";
            public static final String BRONZE_SCREWDRIVER = "screwdriverBronze";
            public static final String STEEL_SCREWDRIVER = "screwdriverSteel";
            public static final String TSTEEL_SCREWDRIVER = "screwdriverTungstenSteel";

            public static final String IRON_SAW = "sawIron";
            public static final String BRONZE_SAW = "sawBronze";
            public static final String STEEL_SAW = "sawSteel";
            public static final String TSTEEL_SAW = "sawTungstenSteel";
        }
        public static final class Blocks {
            public static final String TIN_ORE = "oreTin";
            public static final String COPPER_ORE = "oreCopper";
            public static final String TUNGSTEN_ORE = "oreTungsten";
            public static final String TIN_BLOCK = "blockTin";
            public static final String COPPER_BLOCK = "blockCopper";
            public static final String BRONZE_BLOCK = "blockBronze";
            public static final String STEEL_BLOCK = "blockSteel";
            public static final String TSTEEL_BLOCK = "blockTungstenSteel";
        }
    }
    public static class Materials {
        public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial(Names.Items.FLINT, 1, 96, 5.0F, 2.0F, 7);
        public static final Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial(Names.Items.BRONZE, 2, 192, 6.0F, 2.5F, 13);
        public static final Item.ToolMaterial STEEL = EnumHelper.addToolMaterial(Names.Items.STEEL, 3, 640, 7.5F, 3.5F, 9);
        public static final Item.ToolMaterial TSTEEL = EnumHelper.addToolMaterial(Names.Items.TSTEEL, 4, 2560, 9.0F, 5.0F, 7);
        public static final Set<String> metals = new HashSet<String>()
        {{ add("Tin"); add("Copper"); add("Bronze"); add("Steel"); add("TungstenSteel"); }};
        public static final Map<String, Item.ToolMaterial> modMats = new HashMap<String, Item.ToolMaterial>() {{
            put(Names.Items.FLINT, FLINT);
            put(Names.Items.IRON , Item.ToolMaterial.IRON);
            put(Names.Items.BRONZE, BRONZE);
            put(Names.Items.STEEL, STEEL);
            put(Names.Items.TSTEEL, TSTEEL);
        }};
    }
    public static class ToolData {
        public static final List<String> toolTypes = Arrays.asList("sword", "pickaxe", "axe", "shovel", "hoe", "wrench", "hammer", "crowbar", "file", "screwdriver", "saw");
        public static final HashMap<String, Float> damageEnum = new HashMap<String, Float>()
        {{ put("hoe", 0.0F); put("shovel", 1.0F); put("pickaxe", 2.0F); put("axe", 3.0F); put("sword", 4.0F); put("wrench", 3.0F);
            put("hammer", 3.5F); put("crowbar", 4.5F); put("file", 2.0F); put("screwdriver", 2.5F); put("saw", 3.0F); }};
        public static final Set<String> effectiveWeapons = new HashSet<String>() {{ add("sword"); add("hammer"); add("crowbar"); }};
        public static final HashMap<Block, Float> anvils = new HashMap<Block, Float>() {{ put(Blocks.anvil, 0.05F); }};
        public static HashMap<Item, Item> hammerRecipes;
    }

    public static void init() {
        ToolData.hammerRecipes = new HashMap<Item, Item>() {{
            put(new ItemStack(Blocks.stone).getItem(), new ItemStack(Blocks.cobblestone).getItem());
            put(new ItemStack(Blocks.cobblestone).getItem(), new ItemStack(Blocks.gravel).getItem());
            put(new ItemStack(Blocks.gravel).getItem(), new ItemStack(Blocks.sand).getItem());
            put(new ItemStack(Blocks.iron_ore).getItem(), ModItems.oreRocksIron);
            put(ModItems.oreRocksIron, ModItems.oreGravelIron);
            put(ModItems.oreGravelIron, ModItems.oreSandIron);
            put(ModItems.oreSandIron, ModItems.dustIron);
            put(new ItemStack(Blocks.gold_ore).getItem(), ModItems.oreRocksGold);
            put(ModItems.oreRocksGold, ModItems.oreGravelGold);
            put(ModItems.oreGravelGold, ModItems.oreSandGold);
            put(ModItems.oreSandGold, ModItems.dustGold);
            put(new ItemStack(ModBlocks.oreTin).getItem(), ModItems.oreRocksTin);
            put(ModItems.oreRocksTin, ModItems.oreGravelTin);
            put(ModItems.oreGravelTin, ModItems.oreSandTin);
            put(ModItems.oreSandTin, ModItems.dustTin);
            put(new ItemStack(ModBlocks.oreCopper).getItem(), ModItems.oreRocksCopper);
            put(ModItems.oreRocksCopper, ModItems.oreGravelCopper);
            put(ModItems.oreGravelCopper, ModItems.oreSandCopper);
            put(ModItems.oreSandCopper, ModItems.dustCopper);
            put(new ItemStack(ModBlocks.oreTungsten).getItem(), ModItems.oreRocksTungsten);
            put(ModItems.oreRocksTungsten, ModItems.oreGravelTungsten);
            put(ModItems.oreGravelTungsten, ModItems.oreSandTungsten);
            put(ModItems.oreSandTungsten, ModItems.dustTungsten);
        }};
    }
}
