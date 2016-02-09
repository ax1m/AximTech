package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.block.BlockAT;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockAT blockCopper = new BlockAT(Reference.Names.Blocks.COPPER_BLOCK);
    public static final BlockAT blockBronze = new BlockAT(Reference.Names.Blocks.BRONZE_BLOCK);
    public static final BlockAT blockSteel = new BlockAT(Reference.Names.Blocks.STEEL_BLOCK);
    public static final BlockAT blockTungstenSteel = new BlockAT(Reference.Names.Blocks.TSTEEL_BLOCK);

    public static void init() {
        GameRegistry.registerBlock(blockCopper, Reference.Names.Blocks.COPPER_BLOCK);
        GameRegistry.registerBlock(blockBronze, Reference.Names.Blocks.BRONZE_BLOCK);
        GameRegistry.registerBlock(blockSteel, Reference.Names.Blocks.STEEL_BLOCK);
        GameRegistry.registerBlock(blockTungstenSteel, Reference.Names.Blocks.TSTEEL_BLOCK);

        OreDictionary.registerOre("blockCopper", blockCopper);
        OreDictionary.registerOre("blockBronze", blockBronze);
        OreDictionary.registerOre("blockSteel", blockSteel);
        OreDictionary.registerOre("blockTungstenSteel", blockTungstenSteel);
    }
}
