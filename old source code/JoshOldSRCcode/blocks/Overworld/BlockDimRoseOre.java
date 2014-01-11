package Joshcraft.blocks.Overworld;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import Joshcraft.items.ItemHandler;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDimRoseOre extends Block {

	public BlockDimRoseOre(int id, Material material) {
		
		super(id, material);

	}

	public int idDropped(int par1, Random random, int par3) {
		
		return ItemHandler.DimRoseGem.itemID;
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {

		this.blockIcon = ir.registerIcon(ModInfo.ID + ":" + "dimroseore");

	}

	public void dropBlockAsItemWithChance(World world, int par2, int par3, int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(world, par2, par3, par4, par5, par6, par7);

		if (this.idDropped(par5, world.rand, par3) != this.blockID) {

			int xp = 0;
			xp = MathHelper.getRandomIntegerInRange(world.rand, 2, 50);

			this.dropXpOnBlockBreak(world, par2, par3, par4, xp);

		}
	}
}
