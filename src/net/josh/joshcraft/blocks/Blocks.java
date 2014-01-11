package net.josh.joshcraft.blocks;

import net.josh.joshcraft.core.config.Config;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Block BrightRoseOre;
	public static Block DimRoseOre;
	public static Block JustinaiteOre;
	public static Block WaterBleachedOre;
	
	public static void init() {
		
		initBlocks();
		registerBlocks();
		addNames();
		minecraftForge();
		
	}

	private static void initBlocks() {

		BrightRoseOre = new BrightRoseOre(Config.BrightRoseOreID).setUnlocalizedName("BrightRoseOre");
		DimRoseOre = new DimRoseOre(Config.DimRoseOreID).setUnlocalizedName("DimRoseOre");
		JustinaiteOre = new JustinaiteOre(Config.JustinaiteOreID).setUnlocalizedName("JustinaiteOre");
		WaterBleachedOre = new WaterBleachedOre(Config.WaterBleachedOreID).setUnlocalizedName("WaterBleachedOre");
		
	}

	private static void registerBlocks() {

		GameRegistry.registerBlock(BrightRoseOre, "BrightRoseOre");
		GameRegistry.registerBlock(DimRoseOre, "DimRoseOre");
		GameRegistry.registerBlock(JustinaiteOre, "JustinaiteOre");
		GameRegistry.registerBlock(WaterBleachedOre, "WaterBleachedOre");
		
	}

	private static void addNames() {

		LanguageRegistry.addName(BrightRoseOre, "Bright Rose Ore");
		LanguageRegistry.addName(DimRoseOre, "Dim Rose Ore");
		LanguageRegistry.addName(JustinaiteOre, "Justinaite Ore");
		LanguageRegistry.addName(WaterBleachedOre, "Water Bleached Ore");
		
	}

	private static void minecraftForge() {

		MinecraftForge.setBlockHarvestLevel(BrightRoseOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(DimRoseOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(JustinaiteOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(WaterBleachedOre, "pickaxe", 2);
		
	}

}
