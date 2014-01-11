package net.josh.joshcraft.creativetabs;

import net.josh.joshcraft.blocks.Blocks;
import net.josh.joshcraft.items.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class JoshsCreativeTabs {

	public static CreativeTabs tabJBlocks = new CreativeTabs("tabJBlocks") {

		public ItemStack getIconItemStack() {

			return new ItemStack(Blocks.BrightRoseOre, 1, 0);

		}
	};
	
	public static CreativeTabs tabJItems = new CreativeTabs("tabJItems") {

		public ItemStack getIconItemStack() {

			return new ItemStack(Items.BrightRoseGem, 1, 0);

		}
	};
	
}
