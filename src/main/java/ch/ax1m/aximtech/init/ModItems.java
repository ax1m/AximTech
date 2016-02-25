package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.ItemAT;
import ch.ax1m.aximtech.utils.LogHandler;
import ch.ax1m.aximtech.utils.OreDictHandler;
import ch.ax1m.aximtech.utils.Reference;
import net.minecraft.init.Items;
import cpw.mods.fml.common.registry.GameRegistry;

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

    public static final ItemAT plateIron = new ItemAT(Reference.Names.Items.IRON_PLATE);
    public static final ItemAT plateGold = new ItemAT(Reference.Names.Items.GOLD_PLATE);
    public static final ItemAT plateTin = new ItemAT(Reference.Names.Items.TIN_PLATE);
    public static final ItemAT plateCopper = new ItemAT(Reference.Names.Items.COPPER_PLATE);
    public static final ItemAT plateBronze = new ItemAT(Reference.Names.Items.BRONZE_PLATE);
    public static final ItemAT plateSteel = new ItemAT(Reference.Names.Items.STEEL_PLATE);
    public static final ItemAT plateTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_PLATE);

    public static final ItemAT rodIron = new ItemAT(Reference.Names.Items.IRON_ROD);
    public static final ItemAT rodGold = new ItemAT(Reference.Names.Items.GOLD_ROD);
    public static final ItemAT rodTin = new ItemAT(Reference.Names.Items.TIN_ROD);
    public static final ItemAT rodCopper = new ItemAT(Reference.Names.Items.COPPER_ROD);
    public static final ItemAT rodBronze = new ItemAT(Reference.Names.Items.BRONZE_ROD);
    public static final ItemAT rodSteel = new ItemAT(Reference.Names.Items.STEEL_ROD);
    public static final ItemAT rodTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_ROD);

    public static final ItemAT boltIron = new ItemAT(Reference.Names.Items.IRON_BOLT);
    public static final ItemAT boltGold = new ItemAT(Reference.Names.Items.GOLD_BOLT);
    public static final ItemAT boltTin = new ItemAT(Reference.Names.Items.TIN_BOLT);
    public static final ItemAT boltCopper = new ItemAT(Reference.Names.Items.COPPER_BOLT);
    public static final ItemAT boltBronze = new ItemAT(Reference.Names.Items.BRONZE_BOLT);
    public static final ItemAT boltSteel = new ItemAT(Reference.Names.Items.STEEL_BOLT);
    public static final ItemAT boltTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_BOLT);

    public static final ItemAT screwIron = new ItemAT(Reference.Names.Items.IRON_SCREW);
    public static final ItemAT screwGold = new ItemAT(Reference.Names.Items.GOLD_SCREW);
    public static final ItemAT screwTin = new ItemAT(Reference.Names.Items.TIN_SCREW);
    public static final ItemAT screwCopper = new ItemAT(Reference.Names.Items.COPPER_SCREW);
    public static final ItemAT screwBronze = new ItemAT(Reference.Names.Items.BRONZE_SCREW);
    public static final ItemAT screwSteel = new ItemAT(Reference.Names.Items.STEEL_SCREW);
    public static final ItemAT screwTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_SCREW);

    public static final ItemAT ringIron = new ItemAT(Reference.Names.Items.IRON_RING);
    public static final ItemAT ringGold = new ItemAT(Reference.Names.Items.GOLD_RING);
    public static final ItemAT ringTin = new ItemAT(Reference.Names.Items.TIN_RING);
    public static final ItemAT ringCopper = new ItemAT(Reference.Names.Items.COPPER_RING);
    public static final ItemAT ringBronze = new ItemAT(Reference.Names.Items.BRONZE_RING);
    public static final ItemAT ringSteel = new ItemAT(Reference.Names.Items.STEEL_RING);
    public static final ItemAT ringTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_RING);

    public static final ItemAT gearIron = new ItemAT(Reference.Names.Items.IRON_GEAR);
    public static final ItemAT gearGold = new ItemAT(Reference.Names.Items.GOLD_GEAR);
    public static final ItemAT gearTin = new ItemAT(Reference.Names.Items.TIN_GEAR);
    public static final ItemAT gearCopper = new ItemAT(Reference.Names.Items.COPPER_GEAR);
    public static final ItemAT gearBronze = new ItemAT(Reference.Names.Items.BRONZE_GEAR);
    public static final ItemAT gearSteel = new ItemAT(Reference.Names.Items.STEEL_GEAR);
    public static final ItemAT gearTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_GEAR);

    public static final ItemAT rotorIron = new ItemAT(Reference.Names.Items.IRON_ROTOR);
    public static final ItemAT rotorGold = new ItemAT(Reference.Names.Items.GOLD_ROTOR);
    public static final ItemAT rotorTin = new ItemAT(Reference.Names.Items.TIN_ROTOR);
    public static final ItemAT rotorCopper = new ItemAT(Reference.Names.Items.COPPER_ROTOR);
    public static final ItemAT rotorBronze = new ItemAT(Reference.Names.Items.BRONZE_ROTOR);
    public static final ItemAT rotorSteel = new ItemAT(Reference.Names.Items.STEEL_ROTOR);
    public static final ItemAT rotorTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_ROTOR);

    public static final ItemAT dustBronze = new ItemAT(Reference.Names.Items.BRONZE_DUST);
    public static final ItemAT dustSteel = new ItemAT(Reference.Names.Items.STEEL_DUST);
    public static final ItemAT dustTungstenSteel = new ItemAT(Reference.Names.Items.TSTEEL_DUST);

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
        OreDictHandler.register(Reference.Names.Items.FLINT, Items.flint);
        Field[] fields = ModItems.class.getFields();
        for(Field field : fields) {
            ItemAT item = null;
            try { item = (ItemAT) field.get(null); }
            catch(IllegalAccessException e) { LogHandler.error(e); }
            String name = item.getUnwrappedUnlocalizedName();
            GameRegistry.registerItem(item, name, Reference.MOD_ID);
            if(name.substring(0, 3).matches("ing|nug|dus|pla|rod|bol|scr|rin|gea|rot")) { OreDictHandler.register(name, item); }
        }
    }
}
