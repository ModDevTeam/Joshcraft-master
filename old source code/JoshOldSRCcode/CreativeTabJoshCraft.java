package Joshcraft;

import net.minecraft.creativetab.CreativeTabs;
import Joshcraft.blocks.BlockHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabJoshCraft extends CreativeTabs {

	public CreativeTabJoshCraft(int par1, String par2Str) {
		super(par1, par2Str);
		
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	   
	public int getTabIconItemIndex(){

		return BlockHandler.JustinaiteSmallBrick.blockID;
		
	}
}
