package Joshcraft.Powernet.generators;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCoalGenerator extends TileEntity {
	private int InternalBuffer;
	private int currentOutput;
	private int burnTime;

	@Override
	public void writeToNBT(NBTTagCompound par1){
		
		super.writeToNBT(par1);
		par1.setInteger("InternalBuffer", InternalBuffer);
		par1.setInteger("currentOutput", currentOutput);
		par1.setInteger("burnTime", burnTime);

	}

	@Override
	public void readFromNBT(NBTTagCompound par1){
		
	    super.readFromNBT(par1);
	    this.InternalBuffer = par1.getInteger("InternalBuffer");
	    this.currentOutput = par1.getInteger("currentOutput");
	    this.burnTime = par1.getInteger("burnTime");
	}
}

