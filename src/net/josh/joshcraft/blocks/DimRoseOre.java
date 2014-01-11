package net.josh.joshcraft.blocks;

import java.util.Random;

import net.josh.joshcraft.core.info.Info;
import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.josh.joshcraft.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DimRoseOre extends Block {

	public DimRoseOre(int id) {

		super(id, Material.rock);
		setCreativeTab(JoshsCreativeTabs.tabJBlocks);
		setHardness(1.3F);
		setResistance(2.4F);

	}
	
	public int idDropped(int par1, Random random, int par3) {

		return Items.DimRoseGem.itemID;

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {

		blockIcon = icon.registerIcon(Info.MODID + ":DimRoseOre");

	}

	public void dropBlockAsItemWithChance(World world, int par2, int par3,int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(world, par2, par3, par4, par5, par6, par7);

		if (this.idDropped(par5, world.rand, par3) != this.blockID) {

			int xp = 0;
			xp = MathHelper.getRandomIntegerInRange(world.rand, 2, 50);

			this.dropXpOnBlockBreak(world, par2, par3, par4, xp);

		}
	}

}
