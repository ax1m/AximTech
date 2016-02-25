package ch.ax1m.aximtech.init;

import ch.ax1m.aximtech.utils.ConfigurationHandler;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGenerator implements IWorldGenerator {
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGen, IChunkProvider chunkProv) {
        switch(world.provider.dimensionId) {
            case -1:
                generateNether(world, rand, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, rand, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateNether(World world, Random rand, int x, int z) {

    }
    private void generateOverworld(World world, Random rand, int x, int z) {
        if(ConfigurationHandler.SPAWN_TIN) { generateOre(ModBlocks.oreTin, world, rand, x, z, 4, 11, 6, 32, 72, Blocks.stone); }
        if(ConfigurationHandler.SPAWN_COPPER) { generateOre(ModBlocks.oreCopper, world, rand, x, z, 6, 13, 9, 42, 88, Blocks.stone); }
        if(ConfigurationHandler.SPAWN_TUNGSTEN) { generateOre(ModBlocks.oreTungsten, world, rand, x, z, 1, 4, 1, 1, 13, Blocks.stone); }
    }
    private void generateEnd(World world, Random rand, int x, int z) {

    }

    private void generateOre(Block block, World world, Random rand, int x, int z, int minVeinSize, int maxVeinSize,
                            int chance, int minY, int maxY, Block substrate) {
        int veinSize = minVeinSize + rand.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, substrate);
        for(int i=0; i < chance; i++) {
            int xRand = x + rand.nextInt(16);
            int yRand = minY + rand.nextInt(heightRange);
            int zRand = z + rand.nextInt(16);
            gen.generate(world, rand, xRand, yRand, zRand);
        }
    }
}
