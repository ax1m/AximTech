package ch.ax1m.aximtech.block;

import ch.ax1m.aximtech.creativetab.CreativeTabAT;
import ch.ax1m.aximtech.utils.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockAT extends Block {
    public BlockAT(String blockName, Material material, String harvestTool, float hardness, int harvestLevel) {
        super(material);
        this.setHardness(hardness);
        this.setHarvestLevel(harvestTool, harvestLevel);
        this.setBlockName(blockName);
        this.setCreativeTab(CreativeTabAT.AT_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public String getUnwrappedUnlocalizedName() {
        String unlocalizedName = super.getUnlocalizedName();
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }
}
