package Joshcraft.blocks.Overworld;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWaterBleachedOre extends Block {

	public BlockWaterBleachedOre(int id, Material material) {
		
		super(id, material);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {
		
		this.blockIcon = ir.registerIcon(ModInfo.ID + ":waterbleachore");

	}
}
