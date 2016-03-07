package ch.ax1m.aximtech.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

public class OreDictHandler {

    private static final Map<String, Object> modMaterials = new HashMap<String, Object>();

    public static void register(String ore, Item item) {
        OreDictionary.registerOre(ore, item);
        modMaterials.put(ore, item);
    }
    public static void register(String ore, Block block) {
        OreDictionary.registerOre(ore, block);
        modMaterials.put(ore, block);
    }
    public static void register(String ore, ItemStack iStack) { OreDictionary.registerOre(ore, iStack); }

    public static Object get(String ore) {
        return modMaterials.get(ore);
    }

    public static boolean hasOre(String ore) { return modMaterials.containsKey(ore); }
}
