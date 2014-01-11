package Joshcraft;

import net.minecraft.creativetab.CreativeTabs;
import Joshcraft.items.ItemHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabJoshCraftItems extends CreativeTabs {

	public CreativeTabJoshCraftItems(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	   
	public int getTabIconItemIndex(){

		return ItemHandler.JustinaiteGem.itemID;
		
	}
}
