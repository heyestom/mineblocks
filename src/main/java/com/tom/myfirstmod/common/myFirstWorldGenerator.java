package com.tom.myfirstmod.common;

import com.tom.myfirstmod.block.BlockFlag;
import com.tom.myfirstmod.block.BlockUKFlag;
import com.tom.myfirstmod.block.MapleLog;
import com.tom.myfirstmod.init.ModBlocks;
import com.tom.myfirstmod.utility.LogHelper;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;

import java.util.Random;

/**
 * Created by theyes on 28/07/2014.
 */
public class myFirstWorldGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateEnd(World world, Random random, int i, int i1) {

    }

    private void generateSurface(World world, Random random, int chunkX, int chunkY) {
        for(int k = 0; k < 100; k++) {
            int firstBlockXCoord = chunkX + random.nextInt(16);
            int firstBlockYCoord = random.nextInt(70);
            int firstBlockZCoord = chunkY + random.nextInt(16);

            // minTreeHeight metaWood metaLeaves vinesGrow

            new ModGenMapleTrees(false,4,0,0,false).generate(world, random, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);;
//            new WorldGenMinable(ModBlocks.ukflag, 13).generate(world, random, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
    }

    private void generateNether(World world, Random random, int i, int i1) {

    }
}
