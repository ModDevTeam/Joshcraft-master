package net.josh.joshcraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.josh.joshcraft.core.config.Config;
import net.minecraft.item.Item;

public class Items {

	public static Item BrightRoseGem;
	public static Item DimRoseGem;
	
	public static void init() {
		
		initItems();
		addNames();
		
	}

	private static void initItems() {

		BrightRoseGem = new BrightRoseGem(Config.BrightRoseGemID).setUnlocalizedName("BrightRoseGem");
		DimRoseGem = new DimRoseGem(Config.DimRoseGemID).setUnlocalizedName("DimRoseGem");
		
	}

	private static void addNames() {

		LanguageRegistry.addName(BrightRoseGem, "Bright Rose Gem");
		LanguageRegistry.addName(DimRoseGem, "Dim Rose Gem");
		
	}
	
}
