package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.block.BlockAT;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockAT oreTin = new BlockAT(Reference.Names.Blocks.TIN_ORE, Material.rock, "pickaxe", 3.5F, 1);
    public static final BlockAT oreCopper = new BlockAT(Reference.Names.Blocks.COPPER_ORE, Material.rock, "pickaxe", 4.2F, 2);
    public static final BlockAT oreTungsten = new BlockAT(Reference.Names.Blocks.TUNGSTEN_ORE, Material.rock, "pickaxe", 5.6F, 3);
    public static final BlockAT blockTin = new BlockAT(Reference.Names.Blocks.TIN_BLOCK, Material.iron, "pickaxe", 3.5F, 2);
    public static final BlockAT blockCopper = new BlockAT(Reference.Names.Blocks.COPPER_BLOCK, Material.iron, "pickaxe", 4.2F, 2);
    public static final BlockAT blockBronze = new BlockAT(Reference.Names.Blocks.BRONZE_BLOCK, Material.iron, "pickaxe", 5.6F, 2);
    public static final BlockAT blockSteel = new BlockAT(Reference.Names.Blocks.STEEL_BLOCK, Material.iron, "pickaxe", 8.0F, 3);
    public static final BlockAT blockTungstenSteel = new BlockAT(Reference.Names.Blocks.TSTEEL_BLOCK, Material.iron, "pickaxe", 24.0F, 4);

    public static void init() {
        GameRegistry.registerBlock(oreTin, Reference.Names.Blocks.TIN_ORE);
        GameRegistry.registerBlock(oreCopper, Reference.Names.Blocks.COPPER_ORE);
        GameRegistry.registerBlock(oreTungsten, Reference.Names.Blocks.TUNGSTEN_ORE);
        GameRegistry.registerBlock(blockTin, Reference.Names.Blocks.TIN_BLOCK);
        GameRegistry.registerBlock(blockCopper, Reference.Names.Blocks.COPPER_BLOCK);
        GameRegistry.registerBlock(blockBronze, Reference.Names.Blocks.BRONZE_BLOCK);
        GameRegistry.registerBlock(blockSteel, Reference.Names.Blocks.STEEL_BLOCK);
        GameRegistry.registerBlock(blockTungstenSteel, Reference.Names.Blocks.TSTEEL_BLOCK);

        OreDictionary.registerOre("oreTin", oreTin);
        OreDictionary.registerOre("oreCopper", oreCopper);
        OreDictionary.registerOre("oreTungsten", oreTungsten);
        OreDictionary.registerOre("blockTin", blockTin);
        OreDictionary.registerOre("blockCopper", blockCopper);
        OreDictionary.registerOre("blockBronze", blockBronze);
        OreDictionary.registerOre("blockSteel", blockSteel);
        OreDictionary.registerOre("blockTungstenSteel", blockTungstenSteel);
    }
}
