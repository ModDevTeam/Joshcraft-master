package Joshcraft.Powernet;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCables extends TileEntity {
	
	private int InternalBuffer;
	private int currentOutput;
	
	@Override
    public void updateEntity() {
    			
		
		
    }
	
	@Override
	public void writeToNBT(NBTTagCompound par1){
		
		super.writeToNBT(par1);
		par1.setInteger("InternalBuffer", InternalBuffer);
		par1.setInteger("currentOutput", currentOutput);
		

	}

	@Override
	public void readFromNBT(NBTTagCompound par1){
		
	    super.readFromNBT(par1);
	    this.InternalBuffer = par1.getInteger("InternalBuffer");
	    this.currentOutput = par1.getInteger("currentOutput");
	    
	}
}


