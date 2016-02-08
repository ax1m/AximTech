package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.block.BlockAT;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockAT blockSteel = new BlockAT(Reference.Names.Blocks.STEEL_BLOCK);

    public static void init() {
        GameRegistry.registerBlock(blockSteel, Reference.Names.Blocks.STEEL_BLOCK);

        OreDictionary.registerOre("blockSteel", blockSteel);
    }
}
