package Joshcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWaterBleachedSmallBrick extends Block {

	public BlockWaterBleachedSmallBrick(int par1, Material par2Material) {
		
		super(par1, par2Material);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {
		
		this.blockIcon = ir.registerIcon(ModInfo.ID + ":waterbleachedbricksmall");

	}

}
