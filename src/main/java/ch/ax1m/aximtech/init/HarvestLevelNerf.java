package ch.ax1m.aximtech.init;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;

public class HarvestLevelNerf {

    public void setMiningLevel(BlockEvent.HarvestDropsEvent event, String tool, int level) {
        ItemStack holding;
        try { holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem); }
        catch (NullPointerException e) { return; }
        if(holding == null) { event.drops.clear(); return; }
        int harvestLevel = holding.getItem().getHarvestLevel(holding, tool);
        if(harvestLevel < level) {
            event.drops.clear();
            if(harvestLevel < 1) { event.harvester.destroyCurrentEquippedItem(); }
        }
    }

    public void setMiningLevel(PlayerEvent.BreakSpeed event, String tool, int level, int divisor) {
        ItemStack holding = event.entityPlayer.inventory.getStackInSlot(event.entityPlayer.inventory.currentItem);
        if(holding == null) { event.newSpeed = event.originalSpeed/divisor; return; }
        int harvestLevel = holding.getItem().getHarvestLevel(holding, tool);
        if(harvestLevel < level) { event.newSpeed = event.originalSpeed/divisor; }
    }

    @SubscribeEvent
    public void canHarvest(BlockEvent.HarvestDropsEvent event) {
        boolean isStone, isIron, isDiamond;
        isStone = event.block.getMaterial() == Material.rock;
        isIron = event.block == Blocks.iron_ore;
        isDiamond = event.block == Blocks.diamond_ore;
        if(isDiamond) { setMiningLevel(event, "pickaxe", 3); }
        else if(isIron) { setMiningLevel(event, "pickaxe", 2); }
        else if(isStone) { setMiningLevel(event, "pickaxe", 1); }
    }

    @SubscribeEvent
    public void breakSpeed(PlayerEvent.BreakSpeed event) {
        boolean isStone, isIron, isDiamond;
        isStone = event.block.getMaterial() == Material.rock;
        isIron = event.block == Blocks.iron_ore;
        isDiamond = event.block == Blocks.diamond_ore;
        if(isDiamond) { setMiningLevel(event, "pickaxe", 3, 8); }
        else if(isIron) { setMiningLevel(event, "pickaxe", 2, 5); }
        else if(isStone) { setMiningLevel(event, "pickaxe", 1, 12); }
    }
}
