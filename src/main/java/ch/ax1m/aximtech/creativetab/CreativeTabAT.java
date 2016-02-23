package ch.ax1m.aximtech.creativetab;

import ch.ax1m.aximtech.init.ModItems;
import ch.ax1m.aximtech.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAT {
    public static final CreativeTabs AT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.ingotTungstenSteel;
        }
    };

    public static final CreativeTabs ATTOOLS_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "tools") {
        @Override
        public Item getTabIconItem() {
            return ModItems.pickaxeTungstenSteel;
        }
    };
}
