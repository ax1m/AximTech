package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.ItemToolAT;
import ch.ax1m.aximtech.utils.LogHandler;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.lang.reflect.Field;

public class Recipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.5F);
        GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin), 0.1F);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.5F);
        GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper), 0.1F);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustBronze, 4), "dustTin", "dustCopper", "dustCopper", "dustCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotTungstenCoated), "ingotSteel", "dustTungsten"));

        GameRegistry.addSmelting(ModItems.ingotTungstenCoated, new ItemStack(ModItems.ingotTungstenSteel), 1.0F);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetIron, 9), "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot), "XXX", "XXX", "XXX", 'X', "nuggetIron"));

        for(String metal : Reference.Materials.metals) { addStorageRecipes(metal); }

        Field[] fields = ModTools.class.getFields();
        for(Field field : fields) {
            ItemToolAT  tool = null;
            try { tool = (ItemToolAT) field.get(null); }
            catch(IllegalAccessException e) { LogHandler.error(e); }
            addToolRecipe(tool);
        }
    }

    private static void addStorageRecipes(String oreName) {
        Item nugget = null;
        Item ingot = null;
        Block block = null;
        try {
            nugget = (Item) ModItems.class.getField("nugget" + oreName).get(null);
            ingot = (Item) ModItems.class.getField("ingot" + oreName).get(null);
            block = (Block) ModBlocks.class.getField("block" + oreName).get(null);
        }
        catch(NoSuchFieldException e) { LogHandler.error(e); }
        catch(IllegalAccessException e) { LogHandler.error(e); }
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(nugget, 9), "ingot" + oreName));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ingot), "XXX", "XXX", "XXX", 'X', "nugget" + oreName));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingot, 9), "block" + oreName));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(block), "XXX", "XXX", "XXX", 'X', "ingot" + oreName));
    }

    private static void addToolRecipe(ItemToolAT tool) {
        String material = tool.getOreMaterial();
        String[] pattern = new String[3];
        switch(Reference.ToolData.toolTypes.indexOf(tool.getToolType())) {
            case 0:
                pattern[0] = " X "; pattern[1] = " X "; pattern[2] = " I ";
                break;
            case 1:
                pattern[0] = "XXX"; pattern[1] = " I "; pattern[2] = " I ";
                break;
            case 2:
                pattern[0] = "XX "; pattern[1] = "XI "; pattern[2] = " I ";
                break;
            case 3:
                pattern[0] = " X "; pattern[1] = " I "; pattern[2] = " I ";
                break;
            case 4:
                pattern[0] = "XX "; pattern[1] = " I "; pattern[2] = " I ";
                break;
            case 5:
                pattern[0] = "X X"; pattern[1] = "XXX"; pattern[2] = " X ";
                break;
            case 6:
                pattern[0] = "XXX"; pattern[1] = "XXX"; pattern[2] = " I ";
                break;
            case 7:
                pattern[0] = "  X"; pattern[1] = " X "; pattern[2] = "X  ";
                break;
            case 8:
                pattern[0] = "  X"; pattern[1] = " X "; pattern[2] = "I  ";
                break;
            case 9:
                pattern[0] = " X "; pattern[1] = "I  "; pattern[2] = "   ";
                break;
            case 10:
                pattern[0] = "III"; pattern[1] = "XXI"; pattern[2] = "   ";
                break;
        }
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool), pattern, 'X', material, 'I', "stickWood"));
    }
}
