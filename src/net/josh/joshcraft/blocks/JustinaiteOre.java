package net.josh.joshcraft.blocks;

import java.util.Random;

import net.josh.joshcraft.core.info.Info;
import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JustinaiteOre extends Block {

	public JustinaiteOre(int id) {

		super(id, Material.rock);
		setCreativeTab(JoshsCreativeTabs.tabJBlocks);
		setHardness(1.3F);
		setResistance(2.4F);

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {

		blockIcon = icon.registerIcon(Info.MODID + ":JustinaiteOre");

	}
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {

		for (int i = 0; i < 5; i++) {
			float particalX = x + random.nextFloat();
			float particalY = y + random.nextFloat();
			float particalZ = z + random.nextFloat();
			float particalMotionX = -0.5F + random.nextFloat();
			float particalMotionY = -0.5F + random.nextFloat();
			float particalMotionZ = -0.5F + random.nextFloat();

			world.spawnParticle("portal", particalX, particalY, particalZ, particalMotionX, particalMotionY, particalMotionZ);
		}

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
