package ch.ax1m.aximtech.item;

import ch.ax1m.aximtech.creativetab.CreativeTabAT;
import ch.ax1m.aximtech.event.UseHammerEvent;
import ch.ax1m.aximtech.init.ModBlocks;
import ch.ax1m.aximtech.init.ModItems;
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
    private static HashMap<String, Float> damageEnum = new HashMap<String, Float>()
    {{ put("hoe", 0.0F); put("shovel", 1.0F); put("pickaxe", 2.0F); put("axe", 3.0F); put("sword", 4.0F);
        put("wrench", 3.0F); put("hammer", 3.5F); put("crowbar", 4.5F); put("file", 2.0F); put("screwdriver", 2.5F); }};
    private static Set<String> effectiveWeapons = new HashSet<String>() {{ add("sword"); add("hammer"); add("crowbar"); }};
    private static HashMap<Block, Float> anvils = new HashMap<Block, Float>() {{ put(Blocks.anvil, 0.05F); }};
    private static HashMap<Item, Item> hammable;
    private String toolType;
    private float damageVsEntity;
    public ItemToolAT(String name, String type, ToolMaterial material) {
        super(damageEnum.get(type), material, new HashSet());
        toolType = type;
        damageVsEntity = damageEnum.get(type) + material.getDamageVsEntity();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabAT.ATTOOLS_TAB);
    }

    public static void popHammable() {
        hammable = new HashMap<Item, Item>() {{
            put(new ItemStack(Blocks.stone).getItem(), new ItemStack(Blocks.cobblestone).getItem());
            put(new ItemStack(Blocks.cobblestone).getItem(), new ItemStack(Blocks.gravel).getItem());
            put(new ItemStack(Blocks.gravel).getItem(), new ItemStack(Blocks.sand).getItem());
            put(new ItemStack(ModBlocks.oreTin).getItem(), ModItems.oreRocksTin);
            put(ModItems.oreRocksTin, ModItems.oreGravelTin);
            put(ModItems.oreGravelTin, ModItems.oreSandTin);
            put(ModItems.oreSandTin, ModItems.dustTin);
            put(new ItemStack(ModBlocks.oreCopper).getItem(), ModItems.oreRocksCopper);
            put(ModItems.oreRocksCopper, ModItems.oreGravelCopper);
            put(ModItems.oreGravelCopper, ModItems.oreSandCopper);
            put(ModItems.oreSandCopper, ModItems.dustCopper);
            put(new ItemStack(ModBlocks.oreTungsten).getItem(), ModItems.oreRocksTungsten);
            put(ModItems.oreRocksTungsten, ModItems.oreGravelTungsten);
            put(ModItems.oreGravelTungsten, ModItems.oreSandTungsten);
            put(ModItems.oreSandTungsten, ModItems.dustTungsten);
        }};
    }

    @Override
    public boolean onItemUse(ItemStack holding, EntityPlayer player, World world, int x, int y, int z, int foo, float xx, float yy, float zz) {
        if(this.toolType == "hoe") {
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

        else if(this.toolType == "hammer") {
            if(!player.canPlayerEdit(x, y, z, foo, holding)) { return false; }
            else {
                UseHammerEvent event = new UseHammerEvent(player, holding, world, x, y, z);
                if(MinecraftForge.EVENT_BUS.post(event)) { return false; }
                if(event.getResult() == Event.Result.ALLOW) { holding.damageItem(1, player); return true; }
                Block block = world.getBlock(x, y, z);
                int meta = world.getBlockMetadata(x, y, z);
                Block top = world.getBlock(x, y + 1, z);
                String sound = "random.anvil_land";
                Random rand = new Random();
                if(foo != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && anvils.containsKey(block)) {
                    if(world.isRemote) { return true; }
                    else {
                        if(rand.nextFloat() < anvils.get(block)) {
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
                            if(hammable.containsKey(item)) {
                                first.setEntityItemStack(new ItemStack(item, stack.stackSize - 1));
                                int amount = (rand.nextFloat() < 0.05F) ? 2 : 1;
                                EntityItem output = new EntityItem(world, x_, y_, z_, new ItemStack(hammable.get(item), amount));
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
    public EnumAction getItemUseAction(ItemStack holding) { if(this.toolType == "sword") { return EnumAction.block; } else { return null; }}

    @Override
    public boolean func_150897_b(Block block) { return block == Blocks.web; }

    @Override
    public int getMaxItemUseDuration(ItemStack holding)
    {
        return 72000;
    }

    @Override
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
