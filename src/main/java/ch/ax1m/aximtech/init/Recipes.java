package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.item.ItemToolAT;
import ch.ax1m.aximtech.utils.LogHandler;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import org.apache.commons.lang3.text.WordUtils;

import java.lang.reflect.Field;
import java.util.*;

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

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.bricksBronzePlated),
                "PPP", "hBw", "PPP", 'B', new ItemStack(Blocks.brick_block), 'P', "plateBronze", 'h', "hammer", 'w', "wrench"));

        overrideVanillaRecipes();

        for(String metal : Reference.Materials.allMetals) {
            if(Reference.Materials.modMetals.contains(metal)) { addStorageRecipes(metal); }
            addPartRecipes(metal);
        }

        Field[] fields = ModTools.class.getFields();
        for(Field field : fields) {
            ItemToolAT  tool = null;
            try { tool = (ItemToolAT) field.get(null); }
            catch(IllegalAccessException e) { LogHandler.error(e); }
            assert tool != null;
            addToolRecipe(tool, tool.getToolType(), tool.getOreMaterial(), tool.isMetal());
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

    private static void addToolRecipe(Item tool, String toolType, String mat, boolean isMetal) {
        String[] pattern = new String[3];
        switch(Reference.ToolData.toolTypes.indexOf(toolType)) {
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
        String baseMat = isMetal ? "ingot" + mat : mat;
        if(!isMetal) { for(int i=0; i<pattern.length; i++) {
            pattern[i] = pattern[i].replaceAll("[fh]", " ").replaceAll("[PR]", "X"); }}
        Object[] recipe = new Object[] { null, null, null, 'X', baseMat, 'P', "plate" + mat, 'R', "rod" + mat,
                'I', "stickWood", 'b', "dyeBlue", 'f', "file", 'h', "hammer", 's', "screwdriver" };
        System.arraycopy(pattern, 0, recipe, 0, 3);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool), !isMetal, recipe));
    }

    @SuppressWarnings("unchecked")
    private static void overrideVanillaRecipes() {
        Item[] items = new Item[] { Items.flint_and_steel, Items.stick, new ItemStack(Blocks.planks).getItem(),
                Items.iron_sword, Items.iron_pickaxe, Items.iron_axe, Items.iron_shovel, Items.iron_hoe,
                Items.golden_sword, Items.golden_pickaxe, Items.golden_axe, Items.golden_shovel, Items.golden_hoe };
        Set<Item> iSet = new HashSet<Item>(); iSet.addAll(Arrays.asList(items));
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        Iterator<IRecipe> iter = recipes.iterator();
        while(iter.hasNext()) {
            ItemStack iStack = iter.next().getRecipeOutput();
            if(iStack != null && iSet.contains(iStack.getItem())) iter.remove();
        }
        for(Item item : items) {
            if(item instanceof ItemTool) {
                String mat = WordUtils.capitalizeFully(((ItemTool) item).getToolMaterialName());
                String toolType = item.getToolClasses(null).iterator().next();
                addToolRecipe(item, toolType, mat, true);
            } else if(item instanceof ItemSword) {
                String mat = WordUtils.capitalizeFully(((ItemSword) item).getToolMaterialName());
                addToolRecipe(item, "sword", mat, true);
            } else if(item instanceof ItemHoe) {
                String mat = WordUtils.capitalizeFully(((ItemHoe) item).getToolMaterialName());
                addToolRecipe(item, "hoe", mat, true);
            } else if(item == Items.flint_and_steel) {
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(item), "nuggetSteel", "itemFlint"));
            } else if(item == Items.stick) {
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(item, 2), "P", "P", 'P', "plankWood"));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(item, 4), "s", "P", "P", 's', "saw", 'P', "plankWood"));
            } else {
                for(int i=0; i<4; i++) {
                    GameRegistry.addShapelessRecipe(new ItemStack(item, 2, i), new ItemStack((i < 4) ? Blocks.log : Blocks.log2, 1, i % 4));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(item, 4, i), "s", "L",
                            's', "saw", 'L', new ItemStack((i < 4) ? Blocks.log : Blocks.log2, 1, i % 4)));
                }
            }
        }
    }
}
