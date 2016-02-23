package ch.ax1m.aximtech.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.5F);
        GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin), 0.1F);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.5F);
        GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper), 0.1F);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustBronze, 4), "dustTin", "dustCopper", "dustCopper", "dustCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotTungstenCoated), "ingotSteel", "dustTungsten"));

        GameRegistry.addSmelting(ModItems.ingotTungstenCoated, new ItemStack(ModItems.ingotTungstenSteel), 1.0F);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordFlint), " X ", " X ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordBronze), " X ", " X ", " I ", 'X', "ingotBronze", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordSteel), " X ", " X ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordTungstenSteel), " X ", " X ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeFlint), "XXX", " I ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeBronze), "XXX", " I ", " I ", 'X', "ingotBronze", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeSteel), "XXX", " I ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeTungstenSteel), "XXX", " I ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeFlint), "XX ", "XI ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeBronze), "XX ", "XI ", " I ", 'X', "ingotBronze", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeSteel), "XX ", "XI ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeTungstenSteel), "XX ", "XI ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelFlint), " X ", " I ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelBronze), " X ", " I ", " I ", 'X', "ingotBronze", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelSteel), " X ", " I ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelTungstenSteel), " X ", " I ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeFlint), "XX ", " I ", " I ", 'X', "itemFlint", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeBronze), "XX ", " I ", " I ", 'X', "ingotBronze", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeSteel), "XX ", " I ", " I ", 'X', "ingotSteel", 'I', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeTungstenSteel), "XX ", " I ", " I ", 'X', "ingotTungstenSteel", 'I', "stickWood"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetIron, 9), "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot), "XXX", "XXX", "XXX", 'X', "nuggetIron"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetTin, 9), "ingotTin"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTin), "XXX", "XXX", "XXX", 'X', "nuggetTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotTin, 9), "blockTin"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTin), "XXX", "XXX", "XXX", 'X', "ingotTin"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetCopper, 9), "ingotCopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotCopper), "XXX", "XXX", "XXX", 'X', "nuggetCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotCopper, 9), "blockCopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCopper), "XXX", "XXX", "XXX", 'X', "ingotCopper"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetBronze, 9), "ingotBronze"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotBronze), "XXX", "XXX", "XXX", 'X', "nuggetBronze"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotBronze, 9), "blockBronze"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBronze), "XXX", "XXX", "XXX", 'X', "ingotBronze"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetSteel, 9), "ingotSteel"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotSteel), "XXX", "XXX", "XXX", 'X', "nuggetSteel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotSteel, 9), "blockSteel"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSteel), "XXX", "XXX", "XXX", 'X', "ingotSteel"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetTungstenSteel, 9), "ingotTungstenSteel"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTungstenSteel), "XXX", "XXX", "XXX", 'X', "nuggetTungstenSteel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotTungstenSteel, 9), "blockTungstenSteel"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTungstenSteel), "XXX", "XXX", "XXX", 'X', "ingotTungstenSteel"));
    }
}
