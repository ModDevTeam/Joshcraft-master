package net.josh.joshcraft.energy;

import net.josh.joshcraft.core.config.Config;
import net.josh.joshcraft.energy.cables.TileEntityCableWaterBleached;
import net.josh.joshcraft.energy.cables.waterBleachedCable;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class Powernet {

	public static Block waterBleachedCable;
	public static Block coalgeneratorMultiBlock;
	
	public static BlockCoalGeneratorMultiBlock instance;
	public static void init() {
		
		waterBleachedCable = new waterBleachedCable(Config.WaterBleachedCableID);
		coalgeneratorMultiBlock = new BlockCoalGeneratorMultiBlock(Config.CoalGeneratorID);
		
		GameRegistry.registerBlock(coalgeneratorMultiBlock, "coalGenerator");
		GameRegistry.registerTileEntity(TileEntityCableWaterBleached.class, "entity.waterBleachedCable");
		
		GameRegistry.registerBlock(waterBleachedCable, "waterBleachedCable");
		GameRegistry.registerTileEntity(TileEntityCoalGeneratorMultiBlock.class, "entity.coalgeneratorMultiBlock");
		
	}
	
}
