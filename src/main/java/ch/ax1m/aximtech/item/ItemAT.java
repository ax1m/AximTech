package ch.ax1m.aximtech.item;

import ch.ax1m.aximtech.creativetab.CreativeTabAT;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAT extends Item {
    public ItemAT(String itemName) {
        super();
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(CreativeTabAT.AT_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return getUnlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public String getUnwrappedUnlocalizedName() {
        String unlocalizedName = super.getUnlocalizedName();
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }
}
