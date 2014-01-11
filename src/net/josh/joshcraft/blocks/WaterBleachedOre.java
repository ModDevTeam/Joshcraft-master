package net.josh.joshcraft.blocks;

import net.josh.joshcraft.core.info.Info;
import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WaterBleachedOre extends Block {

	public WaterBleachedOre(int id) {

		super(id, Material.rock);
		setCreativeTab(JoshsCreativeTabs.tabJBlocks);
		setHardness(1.3F);
		setResistance(2.4F);

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {

		blockIcon = icon.registerIcon(Info.MODID + ":WaterBleachedOre");

	}

}
