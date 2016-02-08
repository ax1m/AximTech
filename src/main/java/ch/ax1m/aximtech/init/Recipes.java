package ch.ax1m.aximtech.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordFlint), " X ", " X ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordSteel), " X ", " X ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordTungstenSteel), " X ", " X ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeFlint), "XXX", " I ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeSteel), "XXX", " I ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeTungstenSteel), "XXX", " I ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeFlint), "XX ", "XI ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeSteel), "XX ", "XI ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeTungstenSteel), "XX ", "XI ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelFlint), " X ", " I ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelSteel), " X ", " I ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelTungstenSteel), " X ", " I ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeFlint), "XX ", " I ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeSteel), "XX ", " I ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeTungstenSteel), "XX ", " I ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetIron, 9), "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot), "XXX", "XXX", "XXX", 'X', "nuggetIron"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetSteel, 9), "ingotSteel"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotSteel), "XXX", "XXX", "XXX", 'X', "nuggetSteel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotSteel, 9), "blockSteel"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSteel), "XXX", "XXX", "XXX", 'X', "ingotSteel"));
    }
}
