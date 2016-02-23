package ch.ax1m.aximtech.item;

import ch.ax1m.aximtech.creativetab.CreativeTabAT;
import ch.ax1m.aximtech.event.UseHammerEvent;
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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import java.util.*;

public class ItemToolAT extends ItemTool {
    private final String oreMaterial;
    private final String toolType;
    private final float damageVsEntity;
    public ItemToolAT(String name, String oreMat, String type) {
        super(Reference.ToolData.damageEnum.get(type), Reference.Materials.modMats.get(oreMat), new HashSet());
        oreMaterial = oreMat;
        toolType = type;
        damageVsEntity = Reference.ToolData.damageEnum.get(type) + this.toolMaterial.getDamageVsEntity();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabAT.ATTOOLS_TAB);
    }

    @Override
    public boolean onItemUse(ItemStack holding, EntityPlayer player, World world, int x, int y, int z, int foo, float xx, float yy, float zz) {
        if(this.toolType.equals("hoe")) {
            if(!player.canPlayerEdit(x, y, z, foo, holding)) { return false; }
            else {
                UseHoeEvent event = new UseHoeEvent(player, holding, world, x, y, z);
                if(MinecraftForge.EVENT_BUS.post(event)) { return false; }
                if(event.getResult() == Event.Result.ALLOW) { holding.damageItem(1, player); return true; }
                Block block = world.getBlock(x, y, z);
                if(foo != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
                    Block block1 = Blocks.farmland;
                    world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F),
                            block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);
                    if(world.isRemote) { return true; }
                    else { world.setBlock(x, y, z, block1); holding.damageItem(1, player); return true; }
                } else { return false; }
            }
        }

        else if(this.toolType.equals("hammer")) {
            if(!player.canPlayerEdit(x, y, z, foo, holding)) { return false; }
            else {
                UseHammerEvent event = new UseHammerEvent(player, holding, world, x, y, z);
                if(MinecraftForge.EVENT_BUS.post(event)) { return false; }
                if(event.getResult() == Event.Result.ALLOW) { holding.damageItem(1, player); return true; }
                Block block = world.getBlock(x, y, z);
                int meta = world.getBlockMetadata(x, y, z);
                String sound = "random.anvil_land";
                Random rand = new Random();
                if(foo != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && Reference.ToolData.anvils.containsKey(block)) {
                    if(world.isRemote) { return true; }
                    else {
                        if(rand.nextFloat() < Reference.ToolData.anvils.get(block)) {
                            if(meta < 8) { world.setBlockMetadataWithNotify(x, y, z, meta + 4, 2); }
                            else { world.setBlockToAir(x, y, z); sound = "random.anvil_break"; }
                        }
                        double dx = (double) x; double dy = (double) y + 1.0D; double dz = (double) z;
                        AxisAlignedBB scanAbove = AxisAlignedBB.getBoundingBox(dx, dy, dz, dx + 1, dy + 1, dz + 1);
                        List entitiesAbove = world.getEntitiesWithinAABB(EntityItem.class, scanAbove);
                        if(!entitiesAbove.isEmpty()) {
                            EntityItem first = (EntityItem) entitiesAbove.get(0);
                            ItemStack stack = first.getEntityItem();
                            Item item = stack.getItem();
                            double x_ = first.posX; double y_ = first.posY; double z_ = first.posZ;
                            if(Reference.ToolData.hammerRecipes.containsKey(item)) {
                                first.setEntityItemStack(new ItemStack(item, stack.stackSize - 1));
                                int amount = (rand.nextFloat() < 0.05F) ? 2 : 1;
                                EntityItem output = new EntityItem(world, x_, y_, z_, new ItemStack(Reference.ToolData.hammerRecipes.get(item), amount));
                                output.setVelocity(0.0D, 0.2D, 0.0D);
                                world.spawnEntityInWorld(output);
                            }
                        }
                        world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F),
                                sound, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
                        holding.damageItem(1, player); return true;
                    }
                } else { return false; }
            }
        }

        else { return false; }
    }

    @Override
    public EnumAction getItemUseAction(ItemStack holding) { if(this.toolType.equals("sword")) { return EnumAction.block; } else { return null; }}

    @Override
    public boolean func_150897_b(Block block) { return block == Blocks.web; }

    @Override
    public int getMaxItemUseDuration(ItemStack holding)
    {
        return 72000;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack holding, World world, EntityPlayer player) {
        if(this.toolType.equals("sword")) { player.setItemInUse(holding, this.getMaxItemUseDuration(holding)); }
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
        if(Reference.ToolData.effectiveWeapons.contains(this.toolType)) { damage = 1; }
        holding.damageItem(damage, player);
        return true;
    }

    @Override
    public Multimap getItemAttributeModifiers() {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.damageVsEntity, 0));
        return multimap;
    }

    public String getOreMaterial() { return this.oreMaterial; }

    public String getToolType() { return this.toolType; }

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
