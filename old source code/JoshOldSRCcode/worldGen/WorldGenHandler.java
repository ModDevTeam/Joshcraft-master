package Joshcraft.worldGen;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler {
	
	public static void init(){
		
		GameRegistry.registerWorldGenerator(new OreGenerator());
		
	}

}
