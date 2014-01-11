package Joshcraft.configuration;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class config {
	
	//Blocks
	public static int OreJustinaiteID;
	public static int OreBrightRoseID;
	public static int OreDimRoseID;
	public static int OreWaterBleachedID;
		
	public static int BlockJustinaiteBrickID;
	public static int BlockDimRoseBrickID;
	public static int BlockBrightRoseBrickID;
	public static int BlockWaterBleachedBrickID;
		
	public static int BlockJustinaiteSmallBrickID;
	public static int BlockDimRoseSmallBrickID;
	public static int BlockBrightRoseSmallBrickID;
	public static int BlockWaterBleachedSmallBrickID;
	
	public static int BlockEntityCoalGeneratorID;
	public static int BlockEntityCableID;
	
	//Items
	public static int ItemJustinaiteGemID;
	public static int ItemDimRoseGemID;
	public static int ItemWaterBleachedIngotID;
	public static int ItemBrightRoseGemID;
	
	public static int ItemJustinaitePickID;
	public static int ItemDimRosePickID;
	public static int ItemWaterBleachedPickID;
	public static int ItemBrightRosePickID;
	
	public static int ItemJustinaiteAxeID;
	public static int ItemDimRoseAxeID;
	public static int ItemWaterBleachedAxeID;
	public static int ItemBrightRoseAxeID;
	
	public static int ItemJustinaiteHoeID;
	public static int ItemDimRoseHoeID;
	public static int ItemWaterBleachedHoeID;
	public static int ItemBrightRoseHoeID;
	
	public static int ItemJustinaiteShovelID;
	public static int ItemDimRoseShovelID;
	public static int ItemWaterBleachedShovelID;
	public static int ItemBrightRoseShovelID;
	
	public static int ItemJustinaiteSwordID;
	public static int ItemDimRoseSwordID;
	public static int ItemWaterBleachedSwordID;
	public static int ItemBrightRoseSwordID;
	 
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		
		//Blocks
		OreJustinaiteID = config.get("Blocks", "OreJustinaiteID",1551).getInt();
		OreDimRoseID = config.get("Blocks", "OreDimRoseID", 1552).getInt();	
		OreBrightRoseID = config.get("Blocks", "OreBrightRoseID", 1553).getInt();
		OreWaterBleachedID = config.get("Blocks", "OreWaterBleachedID", 1554).getInt();
		
		BlockJustinaiteBrickID = config.get("Blocks", "BlockJustinaiteBrickID", 1555).getInt();
		BlockBrightRoseBrickID = config.get("Blocks", "BlockBrightRoseBrickID", 1556).getInt();
		BlockDimRoseBrickID = config.get("Blocks", "BlockDimRoseBrickID", 1557).getInt();
		BlockWaterBleachedBrickID = config.get("Blocks", "BlockWaterBleachedBrickID", 1558).getInt();
		
		BlockJustinaiteSmallBrickID = config.get("Blocks", "BlockJustinaiteSmallBrickID", 1559).getInt();
		BlockDimRoseSmallBrickID = config.get("Blocks", "BlockDimRoseSmallBrickID", 1560).getInt();
		BlockBrightRoseSmallBrickID = config.get("Blocks", "BlockBrightRoseSmallBrickID", 1561).getInt();
		BlockWaterBleachedSmallBrickID = config.get("Blocks", "BlockWaterBleachedSmallBrickID", 1562).getInt();
		
		BlockEntityCoalGeneratorID = config.get("Blocks", "BlockEntityCoalGeneratorID", 1563).getInt();
		BlockEntityCableID = config.get("Blocks", "BlockEntityCableID", 1564).getInt();
		
		//items
		ItemBrightRoseGemID = config.get("Items", "ItemBrightRoseGemID", 16001).getInt();
		ItemBrightRosePickID = config.get("Items", "ItemBrightRosePickID", 16002).getInt();
		ItemBrightRoseAxeID = config.get("Items", "ItemBrightRoseAxeID", 16003).getInt();
		ItemBrightRoseHoeID = config.get("Items", "ItemBrightRoseHoeID", 16004).getInt();
		ItemBrightRoseShovelID = config.get("Items", "ItemBrightRoseShovelID", 16005).getInt();
		ItemBrightRoseSwordID = config.get("Items", "ItemBrightRoseSwordID", 16005).getInt();
		
		ItemDimRoseGemID = config.get("Items", "ItemDimRoseGemID", 16006).getInt();
		ItemDimRosePickID = config.get("Items", "ItemDimRosePick", 16007).getInt();
		ItemDimRoseAxeID = config.get("Items", "ItemDimRoseAxeID", 16008).getInt();
		ItemDimRoseHoeID = config.get("Items", "ItemDimRoseHoeID" , 16009).getInt();
		ItemDimRoseShovelID = config.get("Items", "ItemDimRoseShovelID", 16010).getInt();
		ItemDimRoseSwordID = config.get("Items", "ItemDimRoseSword", 16011).getInt();
		
		ItemJustinaiteGemID = config.get("Items", "ItemJustinaiteGenID", 16012).getInt();
		ItemJustinaitePickID = config.get("Items", "ItemJustinaitePickID", 16013).getInt();
		ItemJustinaiteAxeID = config.get("Items", "ItemJustinaiteAxeID", 16014).getInt();
		ItemJustinaiteHoeID = config.get("Items", "ItemJustinaiteHoeID", 16015).getInt();
		ItemJustinaiteShovelID = config.get("Items", "ItemJustinaiteShovelID", 16016).getInt();
		ItemJustinaiteSwordID = config.get("Items", "ItemJustinaiteSwordID", 16017).getInt();
		
		ItemWaterBleachedIngotID = config.get("Items", "ItemWaterBleachedIngotID", 16018).getInt();
		ItemWaterBleachedPickID = config.get("Items", "ItemWaterBleachedPickID", 16019).getInt();
		ItemWaterBleachedAxeID = config.get("Items", "ItemWaterBleachedAxeID", 16020).getInt();
		ItemWaterBleachedHoeID = config.get("Items", "ItemWaterBleachedHoeID", 16021).getInt();
		ItemWaterBleachedShovelID = config.get("Items", "ItemWaterBleachedShovelID", 16022).getInt();
		ItemWaterBleachedSwordID = config.get("Items", "ItemWaterBleachedSwordID", 16023).getInt();
		

		
	
		config.save();
	}

}
