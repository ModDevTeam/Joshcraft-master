package Joshcraft.worldGen;

import java.util.Random;

import Joshcraft.blocks.BlockHandler;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreGenerator implements IWorldGenerator {
	
	private WorldGenerator JustinaiteGen;
	private WorldGenerator DimRoseGen;
	private WorldGenerator BrightRoseGen;
	private WorldGenerator WaterBleachedGen;
	
	
	public OreGenerator(){
		GameRegistry.registerWorldGenerator(this);
	
		JustinaiteGen = new WorldGenMinable(BlockHandler.JustinaiteOre.blockID, 5);
		DimRoseGen = new WorldGenMinable(BlockHandler.DimRoseOre.blockID, 10);
		BrightRoseGen = new WorldGenMinable(BlockHandler.BrightRoseOre.blockID, 10);
		WaterBleachedGen = new WorldGenMinable(BlockHandler.WaterBleachedOre.blockID, 16);
	}
	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen , int lowestY, int highestY){
		for( int i = 0; i < iterations; i++){
			
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY) + lowestY;
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}
	}

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
	generateStandardOre(rand, chunkX, chunkZ, world, 12, JustinaiteGen, 0, 128);
	generateStandardOre(rand, chunkX, chunkZ, world, 15, DimRoseGen, 0, 128);
	generateStandardOre(rand, chunkX, chunkZ, world, 15, BrightRoseGen, 0, 128);
	generateStandardOre(rand, chunkX, chunkZ, world, 25, WaterBleachedGen, 0, 128);
		
	}

}