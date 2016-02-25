package ch.ax1m.aximtech.init;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;

public class HarvestLevelNerf {

    @SubscribeEvent
    public void canHarvest(BlockEvent.HarvestDropsEvent event) {
        if(event.harvester instanceof FakePlayer) { return; }
        boolean isStone, isIron, isDiamond;
        Block block = event.block;
        isStone = block.getMaterial() == Material.rock;
        isIron = block == Blocks.iron_ore || block.getMaterial() == Material.iron;
        isDiamond = block == Blocks.diamond_ore || block == Blocks.diamond_block || block == Blocks.obsidian;
        if(isDiamond) { setMiningLevel(event, "pickaxe", 4); }
        else if(isIron) { setMiningLevel(event, "pickaxe", 2); }
        else if(isStone) { setMiningLevel(event, "pickaxe", 1); }
    }

    @SubscribeEvent
    public void breakSpeed(PlayerEvent.BreakSpeed event) {
        if(event.entity instanceof FakePlayer) { return; }
        boolean isStone, isIron, isDiamond;
        Block block = event.block;
        isStone = block.getMaterial() == Material.rock;
        isIron = block == Blocks.iron_ore || block.getMaterial() == Material.iron;
        isDiamond = block == Blocks.diamond_ore || block == Blocks.diamond_block || block == Blocks.obsidian;
        if(isDiamond) { setMiningLevel(event, "pickaxe", 4, 8); }
        else if(isIron) { setMiningLevel(event, "pickaxe", 2, 5); }
        else if(isStone) { setMiningLevel(event, "pickaxe", 1, 12); }
    }

    private void setMiningLevel(BlockEvent.HarvestDropsEvent event, String tool, int level) {
        ItemStack holding;
        try { holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem); }
        catch (NullPointerException e) { return; }
        if(holding == null) { event.drops.clear(); return; }
        int harvestLevel;
        if(holding.getItem() == Items.diamond_pickaxe) { harvestLevel = 4; }
        else { harvestLevel = holding.getItem().getHarvestLevel(holding, tool); }
        if(harvestLevel < level) {
            event.drops.clear();
            if(harvestLevel < 1) { event.harvester.destroyCurrentEquippedItem(); }
        }
    }

    private void setMiningLevel(PlayerEvent.BreakSpeed event, String tool, int level, int divisor) {
        ItemStack holding = event.entityPlayer.inventory.getStackInSlot(event.entityPlayer.inventory.currentItem);
        if(holding == null) { event.newSpeed = event.originalSpeed/divisor; return; }
        int harvestLevel;
        if(holding.getItem() == Items.diamond_pickaxe) { harvestLevel = 4; }
        else { harvestLevel = holding.getItem().getHarvestLevel(holding, tool); }
        if(harvestLevel < level) { event.newSpeed = event.originalSpeed/divisor; }
    }
}
