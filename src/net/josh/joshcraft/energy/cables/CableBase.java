package net.josh.joshcraft.energy.cables;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class CableBase extends CableHelper{
	
	public static boolean transferOut;

	public CableBase(int id) {
		
		super(id, Material.glass);
		
		
	}
	
	public void onNeighborBlockChange(int blockId) {
		onNeighborBlockChange(blockId);
		
	}
		 
	public int tickRate(World par1World)
    {
        return 30;
    }
	
	public void calculateEnergyMovement(int oraginPipe, int conectingPipe){
		if (oraginPipe < conectingPipe) {

			transferOut = false;
			int diffrence;
			diffrence = conectingPipe - oraginPipe;
			diffrence = diffrence / 2;
			conectingPipe = -diffrence;
			oraginPipe = +diffrence;

		} else if (oraginPipe > conectingPipe) {

			transferOut = true;
			int diffrence;
			diffrence = oraginPipe - conectingPipe;
			diffrence = diffrence / 2;
			conectingPipe = +diffrence;
			oraginPipe = -diffrence;
			
		}
		
	}
	
	
}
