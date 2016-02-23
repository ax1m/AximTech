package ch.ax1m.aximtech.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class UseHammerEvent extends PlayerEvent {
    public final ItemStack current;
    public final World world;
    public final int x;
    public final int y;
    public final int z;

    public UseHammerEvent(EntityPlayer player, ItemStack current, World world, int x, int y, int z) {
        super(player);
        this.current = current;
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
