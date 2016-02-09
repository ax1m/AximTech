package ch.ax1m.aximtech.utils;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Reference {
    public static final String MOD_ID = "AximTech";
    public static final String MOD_NAME = MOD_ID;
    public static final String MOD_VERSION = "0.1.9";
    public static final String CLIENT_PROXY_CLASS = "ch.ax1m.aximtech.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "ch.ax1m.aximtech.proxy.ServerProxy";

    public static final class Names {
        public static final class Items {
            public static final String BRONZE = "ingotBronze";
            public static final String BRONZE_NUGGET = "nuggetBronze";
            public static final String IRON_NUGGET = "nuggetIron";
            public static final String STEEL = "ingotSteel";
            public static final String STEEL_NUGGET = "nuggetSteel";
            public static final String TCOATED = "ingotTungstenCoated";
            public static final String TSTEEL = "ingotTungstenSteel";
            public static final String TSTEEL_NUGGET = "nuggetTungstenSteel";

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
        }
        public static final class Blocks {
            public static final String COPPER_BLOCK = "blockCopper";
            public static final String BRONZE_BLOCK = "blockBronze";
            public static final String STEEL_BLOCK = "blockSteel";
            public static final String TSTEEL_BLOCK = "blockTungstenSteel";
        }
    }
    public static class Materials {
        public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("itemFlint", 1, 96, 5.0F, 2.0F, 7);
        public static final Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial(Names.Items.BRONZE, 2, 192, 6.0F, 3.0F, 13);
        public static final Item.ToolMaterial STEEL = EnumHelper.addToolMaterial(Names.Items.STEEL, 2, 640, 7.5F, 3.5F, 9);
        public static final Item.ToolMaterial TSTEEL = EnumHelper.addToolMaterial(Names.Items.TSTEEL, 3, 2560, 9.0F, 5.0F, 7);
    }
}
