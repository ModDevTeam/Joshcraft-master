package Joshcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Joshcraft.blocks.Overworld.BlockBrightRoseOre;
import Joshcraft.blocks.Overworld.BlockDimRoseOre;
import Joshcraft.blocks.Overworld.BlockJustinaiteOre;
import Joshcraft.blocks.Overworld.BlockWaterBleachedOre;
import Joshcraft.configuration.config;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

	//Overworld ores
	public static Block JustinaiteOre;
	public static Block DimRoseOre;
	public static Block BrightRoseOre;
	public static Block WaterBleachedOre;
	
	public static Block JustinaiteBrick;
	public static Block DimRoseBrick;
	public static Block BrightRoseBrick;
	public static Block WaterBleachedBrick;
	
	public static Block JustinaiteSmallBrick;
	public static Block DimRoseSmallBrick;
	public static Block BrightRoseSmallBrick;
	public static Block WaterBleachedSmallBrick;
	
	

	
	
	public static void init(){
		
		JustinaiteOre = new BlockJustinaiteOre(config.OreJustinaiteID).setUnlocalizedName("JustinaiteOore").setHardness(0.8F);
		DimRoseOre = new BlockDimRoseOre(config.OreDimRoseID, Material.rock).setUnlocalizedName("DimroseOre").setHardness(0.8F);
		BrightRoseOre = new BlockBrightRoseOre(config.OreBrightRoseID, Material.rock).setUnlocalizedName("BrightRoseOre").setHardness(0.8F);
		WaterBleachedOre = new BlockWaterBleachedOre(config.OreWaterBleachedID, Material.rock).setUnlocalizedName("WaterBleachedOre").setHardness(0.8F);
		
		JustinaiteBrick = new BlockJustinaiteBrick(config.BlockJustinaiteBrickID, Material.rock).setUnlocalizedName("JustinaiteBrick").setHardness(0.6F);
		DimRoseBrick = new BlockDimRoseBrick(config.BlockDimRoseBrickID, Material.rock).setUnlocalizedName("DimRoseBrick").setHardness(0.6F);
		BrightRoseBrick = new BlockBrightRoseBrick(config.BlockBrightRoseBrickID, Material.rock).setUnlocalizedName("BrightRoseBrick").setHardness(0.6F);
		WaterBleachedBrick = new BlockWaterBleachedBrick(config.BlockWaterBleachedBrickID, Material.rock).setUnlocalizedName("WaterBleachedBrick").setHardness(0.6F);
		
		
		JustinaiteSmallBrick = new BlockJustinaiteSmallBrick(config.BlockJustinaiteSmallBrickID, Material.rock).setUnlocalizedName("JustinaiteSmallBrick").setHardness(0.6F);
		DimRoseSmallBrick = new BlockDimRoseSmallBrick(config.BlockDimRoseSmallBrickID, Material.rock).setUnlocalizedName("DimRoseSmallBrick").setHardness(0.6F);
		BrightRoseSmallBrick = new BlockBrightRoseSmallBrick(config.BlockBrightRoseSmallBrickID, Material.rock).setUnlocalizedName("BrightRoseSmallBright").setHardness(0.6F);
		WaterBleachedSmallBrick = new BlockWaterBleachedSmallBrick(config.BlockWaterBleachedSmallBrickID, Material.rock).setUnlocalizedName("WaterBleachedSmallBrick").setHardness(0.6F);
		
		GameRegistry.registerBlock(JustinaiteOre, ModInfo.ID + JustinaiteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DimRoseOre, ModInfo.ID + DimRoseOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BrightRoseOre, ModInfo.ID + BrightRoseOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(WaterBleachedOre, ModInfo.ID + WaterBleachedOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(JustinaiteBrick, ModInfo.ID + JustinaiteBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DimRoseBrick, ModInfo.ID + DimRoseBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BrightRoseBrick, ModInfo.ID + BrightRoseBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(WaterBleachedBrick, ModInfo.ID + WaterBleachedBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(JustinaiteSmallBrick, ModInfo.ID + JustinaiteSmallBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DimRoseSmallBrick, ModInfo.ID + DimRoseSmallBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BrightRoseSmallBrick, ModInfo.ID + BrightRoseSmallBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(WaterBleachedSmallBrick, ModInfo.ID + WaterBleachedSmallBrick.getUnlocalizedName().substring(5));
        
        LanguageRegistry.addName(JustinaiteOre, "Justinaite Ore");
        LanguageRegistry.addName(DimRoseOre, "Dim Rose Ore");
        LanguageRegistry.addName(BrightRoseOre, "Bright Rose Ore");
        LanguageRegistry.addName(WaterBleachedOre, "Water Bleached Ore");
        LanguageRegistry.addName(JustinaiteBrick, "Justinaite Brick");
        LanguageRegistry.addName(DimRoseBrick, "Dim Rose Brick");
        LanguageRegistry.addName(BrightRoseBrick, "Bright Rose Brick");
        LanguageRegistry.addName(WaterBleachedBrick, "Water Bleached Brick");
        LanguageRegistry.addName(JustinaiteSmallBrick, "Justinaite Small Brick");
		LanguageRegistry.addName(DimRoseSmallBrick, "Dim Rose Small Brick");
		LanguageRegistry.addName(BrightRoseSmallBrick, "Bright Rose Small Brick");
		LanguageRegistry.addName(WaterBleachedSmallBrick, "Water Bleached Small Brick");
		


		
	}
	
	
	
}
