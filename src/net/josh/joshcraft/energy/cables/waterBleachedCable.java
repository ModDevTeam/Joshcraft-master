package net.josh.joshcraft.energy.cables;

import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class waterBleachedCable extends CableBase  {
	
	public waterBleachedCable(int id) {
		
		super(id);
		this.setCreativeTab(JoshsCreativeTabs.tabJBlocks);
		this.setUnlocalizedName("waterBleachedCable");
		
	}
	

	public TileEntity createTileEntity(World world, int metadata){
		
	   return new TileEntityCableWaterBleached();
	   
	}
	 

	

}
