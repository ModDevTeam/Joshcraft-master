package net.josh.joshcraft.energy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerCoalGeneratorMultiblock extends Container {

	public ContainerCoalGeneratorMultiblock(InventoryPlayer par1InventoryPlayer, TileEntityCoalGeneratorMultiBlock par2TileEntityFurnace) {

	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return false;
	}

}
