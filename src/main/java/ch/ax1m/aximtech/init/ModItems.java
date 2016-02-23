package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.ItemAT;
import ch.ax1m.aximtech.utils.LogHandler;
import ch.ax1m.aximtech.utils.Reference;
import net.minecraft.init.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Field;

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

    public static final ItemAT oreRocksIron = new ItemAT(Reference.Names.Items.IRON_ROCKS);
    public static final ItemAT oreGravelIron = new ItemAT(Reference.Names.Items.IRON_GRAVEL);
    public static final ItemAT oreSandIron = new ItemAT(Reference.Names.Items.IRON_SAND);
    public static final ItemAT dustIron = new ItemAT(Reference.Names.Items.IRON_DUST);

    public static final ItemAT oreRocksGold = new ItemAT(Reference.Names.Items.GOLD_ROCKS);
    public static final ItemAT oreGravelGold = new ItemAT(Reference.Names.Items.GOLD_GRAVEL);
    public static final ItemAT oreSandGold = new ItemAT(Reference.Names.Items.GOLD_SAND);
    public static final ItemAT dustGold = new ItemAT(Reference.Names.Items.GOLD_DUST);

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

    public static void init() {
        Field[] fields = ModItems.class.getFields();
        for(Field field : fields) {
            ItemAT item = null;
            try { item = (ItemAT) field.get(null); }
            catch(IllegalAccessException e) { LogHandler.error(e); }
            String name = item.getUnwrappedUnlocalizedName();
            GameRegistry.registerItem(item, name, Reference.MOD_ID);
            if(name.substring(0, 3).matches("ing|nug|dus")) { OreDictionary.registerOre(name, item); }
        }

        OreDictionary.registerOre(Reference.Names.Items.FLINT, Items.flint);
    }
}
