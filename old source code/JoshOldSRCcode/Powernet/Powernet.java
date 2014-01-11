package Joshcraft.Powernet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Joshcraft.Powernet.generators.BlockEntityCoalGenerator;
import Joshcraft.Powernet.generators.TileEntityCoalGenerator;
import Joshcraft.configuration.config;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Powernet {

	public static Block coalGenerator;
	public static Block cables;
	public static void init() {
		
		coalGenerator = new BlockEntityCoalGenerator(config.BlockEntityCoalGeneratorID, Material.iron);
		cables = new BlockEntityCables(config.BlockEntityCableID, Material.sponge);
		
		
		
		GameRegistry.registerBlock(coalGenerator, ModInfo.ID + "coalGenerator");
		GameRegistry.registerTileEntity(TileEntityCoalGenerator.class, ModInfo.ID+ "TileEntity.coalGenerator");
		
		GameRegistry.registerBlock(cables, ModInfo.ID + "cabels");
		GameRegistry.registerTileEntity(TileEntityCables.class, ModInfo.ID+ "TileEntity.Cables");
		
		LanguageRegistry.addName(coalGenerator, "Coal Generator");
		LanguageRegistry.addName(cables, "Cables");
		
		
		
		
	}
	

}
