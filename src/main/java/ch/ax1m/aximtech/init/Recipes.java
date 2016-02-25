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
import java.util.HashSet;
import java.util.Set;

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

        for(String metal : Reference.Materials.allMetals) {
            if(Reference.Materials.modMetals.contains(metal)) { addStorageRecipes(metal); }
            addPartRecipes(metal);
        }

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

    private static void addPartRecipes(String mat) {
        Item plate = null;
        Item rod = null;
        Item bolt = null;
        Item screw = null;
        Item ring = null;
        Item gear = null;
        Item rotor = null;
        try {
            plate = (Item) ModItems.class.getField("plate" + mat).get(null);
            rod = (Item) ModItems.class.getField("rod" + mat).get(null);
            bolt = (Item) ModItems.class.getField("bolt" + mat).get(null);
            screw = (Item) ModItems.class.getField("screw" + mat).get(null);
            ring = (Item) ModItems.class.getField("ring" + mat).get(null);
            gear = (Item) ModItems.class.getField("gear" + mat).get(null);
            rotor = (Item) ModItems.class.getField("rotor" + mat).get(null);
        }
        catch(NoSuchFieldException e) { LogHandler.error(e); }
        catch(IllegalAccessException e) { LogHandler.error(e); }
        Set<ShapedOreRecipe> recipes = new HashSet<ShapedOreRecipe>();
        recipes.add(new ShapedOreRecipe(new ItemStack(plate), "h", "X", "X", 'X', "ingot" + mat, 'h', "hammer"));
        recipes.add(new ShapedOreRecipe(new ItemStack(rod), "f ", " X", 'X', "ingot" + mat, 'f', "file"));
        recipes.add(new ShapedOreRecipe(new ItemStack(bolt, 2), "s ", " X", 'X', "rod" + mat, 's', "saw"));
        recipes.add(new ShapedOreRecipe(new ItemStack(screw), "fX", "X ", 'X', "bolt" + mat, 'f', "file"));
        recipes.add(new ShapedOreRecipe(new ItemStack(ring), "h ", " X", 'X', "rod" + mat, 'h', "hammer"));
        recipes.add(new ShapedOreRecipe(new ItemStack(gear), "RPR", "PwP", "RPR", 'R', "rod" + mat, 'P', "plate" + mat, 'w', "wrench"));
        recipes.add(new ShapedOreRecipe(new ItemStack(rotor), "PhP", "SRf", "PsP", 'P', "plate" + mat, 'S', "screw" + mat, 'R', "ring" + mat, 'h', "hammer", 'f', "file", 's', "screwdriver"));
        for(ShapedOreRecipe recipe : recipes) { GameRegistry.addRecipe(recipe); }
    }

    private static void addToolRecipe(ItemToolAT tool) {
        String[] pattern = new String[3];
        switch(Reference.ToolData.toolTypes.indexOf(tool.getToolType())) {
            case 0:     // sword
                pattern[0] = " P "; pattern[1] = "fPh"; pattern[2] = " I "; break;
            case 1:     // pickaxe
                pattern[0] = "XXP"; pattern[1] = "fIh"; pattern[2] = " I "; break;
            case 2:     // axe
                pattern[0] = "PXh"; pattern[1] = "PI "; pattern[2] = "fI "; break;
            case 3:     // shovel
                pattern[0] = "fPh"; pattern[1] = " I "; pattern[2] = " I "; break;
            case 4:     // hoe
                pattern[0] = "PXh"; pattern[1] = "fI "; pattern[2] = " I "; break;
            case 5:     // wrench
                pattern[0] = "X X"; pattern[1] = "XXX"; pattern[2] = " X "; break;
            case 6:     // hammer
                pattern[0] = "XXX"; pattern[1] = "XXX"; pattern[2] = " I "; break;
            case 7:     // crowbar
                pattern[0] = "hbR"; pattern[1] = "bRb"; pattern[2] = "Rbf"; break;
            case 8:     // file
                pattern[0] = "P"; pattern[1] = "P"; pattern[2] = "I"; break;
            case 9:     // screwdriver
                pattern[0] = " fR"; pattern[1] = " Rh"; pattern[2] = "I  "; break;
            case 10:    // saw
                pattern[0] = "RRR"; pattern[1] = "XXR"; pattern[2] = "fh "; break;
            case 11:    // cutter
                pattern[0] = "PfP"; pattern[1] = "hPs"; pattern[2] = "RSR"; break;
        }
        boolean isMetal = tool.isMetal();
        String mat = tool.getOreMaterial();
        String baseMat = isMetal ? "ingot" + mat : mat;
        if(!isMetal) { for(int i=0; i<pattern.length; i++) {
            pattern[i] = pattern[i].replaceAll("[fh]", " ").replaceAll("[PR]", "X"); }}
        Object[] recipe = new Object[] { null, null, null, 'X', baseMat, 'P', "plate" + mat, 'R', "rod" + mat,
                'I', "stickWood", 'b', "dyeBlue", 'f', "file", 'h', "hammer", 's', "screwdriver" };
        for(int i=0; i<3; i++) { recipe[i] = pattern[i]; }
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool), !isMetal, recipe));
    }

    private static void overrideVanillaRecipes() {

    }
}
