package net.josh.joshcraft.energy.cables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public abstract class CableHelper extends Block{
	
	public CableHelper(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}

	public TileEntityCableWaterBleached container;
	public World getWorld() {
		return container.worldObj;
	}

	public void readFromNBT(NBTTagCompound nbttagcompound) {
	}

	public void writeToNBT(NBTTagCompound nbttagcompound) {
	}

	public void updateEntity() {
	}

	public void setTile(TileEntityCableWaterBleached tile) {
		this.container = tile;
	}

	public boolean canPipeConnect(TileEntity tile, ForgeDirection side) {
		return true;
	}

	public void onNeighborBlockChange(int blockId) {
	}

	public void onBlockPlaced() {
	}

	public void initialize() {
	}

	public boolean inputOpen(ForgeDirection from) {
		return true;
	}

	public boolean outputOpen(ForgeDirection to) {
		return true;
	}

	public void dropContents() {
	}

	public void sendDescriptionPacket() {
	}

	public boolean delveIntoUnloadedChunks() {
		return false;
	}
}



