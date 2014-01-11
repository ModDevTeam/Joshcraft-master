package net.josh.joshcraft.items;

import net.josh.joshcraft.core.info.Info;
import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DimRoseGem extends Item {
	
	public DimRoseGem(int id) {
		
		super(id);
		setCreativeTab(JoshsCreativeTabs.tabJItems);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		
		itemIcon = icon.registerIcon(Info.MODID + ":DimRoseGem");
		
	}

}
