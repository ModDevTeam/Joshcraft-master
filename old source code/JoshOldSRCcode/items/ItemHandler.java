package Joshcraft.items;

import net.minecraft.item.Item;
import Joshcraft.configuration.config;
import Joshcraft.res.ToolMaterial;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler {
	
	public static Item JustinaiteGem;
	public static Item DimRoseGem;
	public static Item WaterBleachedIngot;
	public static Item BrightRoseGem;
	
	public static Item JustinaitePick;
	public static Item DimRosePick;
	public static Item WaterBleachedPick;
	public static Item BrightRosePick;
	
	public static Item JustinaiteAxe;
	public static Item DimRoseAxe;
	public static Item WaterBleachedAxe;
	public static Item BrightRoseAxe;
	
	public static Item JustinaiteHoe;
	public static Item DimRoseHoe;
	public static Item WaterBleachedHoe;
	public static Item BrightRoseHoe;
	
	public static Item JustinaiteShovel;
	public static Item DimRoseShovel;
	public static Item WaterBleachedShovel;
	public static Item BrightRoseShovel;
	
	public static Item JustinaiteSword;
	public static Item DimRoseSword;
	public static Item WaterBleachedSword;
	public static Item BrightRoseSword;
	
	//public static ItemSeeds BeefSeed;
	
	public static void init(){
		
		JustinaiteGem = new ItemJustinaiteGem(config.ItemJustinaiteGemID - 256).setUnlocalizedName("JustinaiteGem");
		DimRoseGem = new ItemDimRoseGem(config.ItemDimRoseGemID - 256).setUnlocalizedName("DimRoseGem");
		BrightRoseGem = new ItemBrightRoseGem(config.ItemBrightRoseGemID - 256).setUnlocalizedName("BrightRoseGem");
		WaterBleachedIngot = new ItemWaterBleachedIngot(config.ItemWaterBleachedIngotID - 256).setUnlocalizedName("WaterBleachedIngot");
		
		JustinaitePick = new PickJustinaitePick(config.ItemJustinaitePickID - 256, ToolMaterial.JustinaiteTool).setUnlocalizedName("JustinaitePick");
		DimRosePick = new PickDimRosePick(config.ItemDimRosePickID - 256, ToolMaterial.RoseTool).setUnlocalizedName("DimRosePick");
		BrightRosePick = new PickBrightRosePick(config.ItemBrightRosePickID - 256, ToolMaterial.RoseTool).setUnlocalizedName("BrightRosePick");
		WaterBleachedPick = new PickWaterBleachedPick(config.ItemWaterBleachedPickID - 256, ToolMaterial.WaterBleachedTool).setUnlocalizedName("WaterBleachedPick");
		
		JustinaiteAxe = new AxeJustinaiteAxe(config.ItemJustinaiteAxeID - 256, ToolMaterial.JustinaiteTool).setUnlocalizedName("JustinaiteAxe");
		DimRoseAxe = new AxeDimRoseAxe(config.ItemDimRoseAxeID - 256, ToolMaterial.RoseTool).setUnlocalizedName("DimRoseAxe");
		BrightRoseAxe = new AxeBrightRoseAxe(config.ItemBrightRoseAxeID - 256, ToolMaterial.RoseTool).setUnlocalizedName("BrightRoseAxe");
		WaterBleachedAxe = new AxeWaterBleachedAxe(config.ItemWaterBleachedAxeID - 256, ToolMaterial.WaterBleachedTool).setUnlocalizedName("WaterBleachedAxe");
				
		JustinaiteHoe = new HoeJustinaiteHoe(config.ItemJustinaiteHoeID - 256, ToolMaterial.JustinaiteTool).setUnlocalizedName("JustinaiteHoe");
		DimRoseHoe = new HoeDimRoseHoe(config.ItemDimRoseHoeID - 256, ToolMaterial.RoseTool).setUnlocalizedName("DimRoseHoe");
		BrightRoseHoe = new HoeBrightRoseHoe(config.ItemBrightRoseHoeID - 256, ToolMaterial.RoseTool).setUnlocalizedName("BrightRoseHoe");
		WaterBleachedHoe = new HoeWaterBleachedHoe(config.ItemWaterBleachedHoeID - 256, ToolMaterial.WaterBleachedTool).setUnlocalizedName("WaterBleachedHoe");
		
		JustinaiteShovel = new ShovelJustinaiteShovel(config.ItemJustinaiteShovelID - 256, ToolMaterial.JustinaiteTool).setUnlocalizedName("JustinaiteShovel");
		DimRoseShovel = new ShovelDimRoseShovel(config.ItemDimRoseShovelID - 256, ToolMaterial.RoseTool).setUnlocalizedName("DimRoseShovel");
		BrightRoseShovel = new ShovelBrightRoseShovel(config.ItemBrightRoseShovelID - 256, ToolMaterial.RoseTool).setUnlocalizedName("BrightRoseShovel");
		WaterBleachedShovel = new ShovelWaterBleachedShovel(config.ItemWaterBleachedShovelID - 256, ToolMaterial.WaterBleachedTool).setUnlocalizedName("WaterBleachedShovel");
		
		JustinaiteSword = new SwordJustinaiteSword(config.ItemJustinaiteSwordID - 256, ToolMaterial.JustinaiteTool).setUnlocalizedName("JustinaiteSword");
		DimRoseSword = new SwordDimRoseSword(config.ItemDimRoseSwordID - 256, ToolMaterial.RoseTool).setUnlocalizedName("DimRoseSword");
		BrightRoseSword = new SwordBrightRoseSword(config.ItemBrightRoseSwordID - 256, ToolMaterial.RoseTool).setUnlocalizedName("BrightRoseSword");
		WaterBleachedSword = new SwordWaterBleachedSword(config.ItemWaterBleachedSwordID - 256, ToolMaterial.WaterBleachedTool).setUnlocalizedName("WaterBleachedSword");
		
		
		LanguageRegistry.addName(JustinaiteGem, "Justinaite");
		LanguageRegistry.addName(DimRoseGem, "Dim Rose");
		LanguageRegistry.addName(BrightRoseGem, "Bright Rose");
		LanguageRegistry.addName(WaterBleachedIngot, "Water Bleached Ingot");
		
		
		LanguageRegistry.addName(JustinaitePick, "Justinaite Pickaxe");
		LanguageRegistry.addName(DimRosePick, "Dim Rose Pick");
		LanguageRegistry.addName(BrightRosePick, "Bright Rose Pickaxe");
		LanguageRegistry.addName(WaterBleachedPick, "Water Bleached Pick");
		
		LanguageRegistry.addName(JustinaiteAxe, "Justinaite Axe");
		LanguageRegistry.addName(DimRoseAxe, "Dim Rose Axe");
		LanguageRegistry.addName(BrightRoseAxe, "Bright Rose Axe");
		LanguageRegistry.addName(WaterBleachedAxe, "Water Bleached Axe");
		
		LanguageRegistry.addName(JustinaiteHoe, "Justinaite Hoe");
		LanguageRegistry.addName(DimRoseHoe, "Dim Rose Hoe");
		LanguageRegistry.addName(BrightRoseHoe, "Bright Rose Hoe");
		LanguageRegistry.addName(WaterBleachedHoe, "Water Bleached Hoe");
		
		LanguageRegistry.addName(JustinaiteShovel, "Justinaite Shovel");
		LanguageRegistry.addName(DimRoseShovel, "Dim Rose Shovel");
		LanguageRegistry.addName(BrightRoseShovel, "Bright Rose Shovel");
		LanguageRegistry.addName(WaterBleachedShovel, "Water Bleached Shovel");
		
		LanguageRegistry.addName(JustinaiteSword, "Justinaite Sword");
		LanguageRegistry.addName(DimRoseSword, "Dim Rose Sword");
		LanguageRegistry.addName(BrightRoseSword, "Bright Rose Sword");
		LanguageRegistry.addName(WaterBleachedSword, "Water Bleached Sword");
	}

}
