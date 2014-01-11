package net.josh.joshcraft.client.gui;

import net.josh.joshcraft.energy.ContainerCoalGeneratorMultiblock;
import net.josh.joshcraft.energy.TileEntityCoalGeneratorMultiBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch (id) {
		case GuiIDS.CoalGeneratorMultiBlock:
			return new ContainerCoalGeneratorMultiblock(player.inventory,
					(TileEntityCoalGeneratorMultiBlock) tile_entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch (id) {
		case GuiIDS.CoalGeneratorMultiBlock:
			return new GuiCoalGeneratorMultiBlock(player.inventory,
					(TileEntityCoalGeneratorMultiBlock) tile_entity);
		}
		return null;
	}
}