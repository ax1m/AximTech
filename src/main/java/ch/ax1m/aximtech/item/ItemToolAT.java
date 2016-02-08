package ch.ax1m.aximtech.item;

import ch.ax1m.aximtech.creativetab.CreativeTabAT;
import ch.ax1m.aximtech.utils.Reference;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ItemToolAT extends ItemTool {
    private static HashMap<String, Float> damageEnum = new HashMap<String, Float>()
    {{ put("hoe", 0.0F); put("shovel", 1.0F); put("pickaxe", 2.0F); put("axe", 3.0F); put("sword", 4.0F); }};
    private static Set<String> effectiveWeapons = new HashSet<String>() {{ add("sword"); add("hammer"); }};
    private String toolType;
    private float damageVsEntity;
    public ItemToolAT(String name, String type, ToolMaterial material) {
        super(damageEnum.get(type), material, new HashSet());
        toolType = type;
        damageVsEntity = damageEnum.get(type) + material.getDamageVsEntity();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabAT.ATTOOLS_TAB);
    }

    public boolean onItemUse(ItemStack holding, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        if(this.toolType == "hoe") {
            if(!player.canPlayerEdit(x, y, z, p_77648_7_, holding)) { return false; }
            else {
                UseHoeEvent event = new UseHoeEvent(player, holding, world, x, y, z);
                if(MinecraftForge.EVENT_BUS.post(event)) { return false; }
                if(event.getResult() == Event.Result.ALLOW) { holding.damageItem(1, player); return true; }
                Block block = world.getBlock(x, y, z);
                if(p_77648_7_ != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
                    Block block1 = Blocks.farmland;
                    world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F),
                            block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);
                    if(world.isRemote) { return true; }
                    else { world.setBlock(x, y, z, block1); holding.damageItem(1, player); return true; }
                } else { return false; }}} else { return false; }
    }

    public EnumAction getItemUseAction(ItemStack holding) { if(this.toolType == "sword") { return EnumAction.block; } else { return null; }}

    public boolean func_150897_b(Block block) { return block == Blocks.web; }

    public int getMaxItemUseDuration(ItemStack holding)
    {
        return 72000;
    }

    public ItemStack onItemRightClick(ItemStack holding, World world, EntityPlayer player) {
        if(this.toolType == "sword") { player.setItemInUse(holding, this.getMaxItemUseDuration(holding)); }
        return holding;
    }

    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass) {
        int level = super.getHarvestLevel(stack, toolClass);
        if (level == -1 && toolClass != null && toolClass.equals(this.toolType)) {
            return this.toolMaterial.getHarvestLevel();
        }
        else { return level; }
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return toolType != null ? ImmutableSet.of(toolType) : super.getToolClasses(stack);
    }

    @Override
    public boolean hitEntity(ItemStack holding, EntityLivingBase hit, EntityLivingBase player) {
        int damage = 2;
        if(effectiveWeapons.contains(this.toolType)) { damage = 1; }
        holding.damageItem(damage, player);
        return true;
    }

    @Override
    public Multimap getItemAttributeModifiers() {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.damageVsEntity, 0));
        return multimap;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }
}
