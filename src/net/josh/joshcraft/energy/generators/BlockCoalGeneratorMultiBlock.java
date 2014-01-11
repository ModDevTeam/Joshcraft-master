package net.josh.joshcraft.energy;

import java.util.Random;

import net.josh.joshcraft.JoshCraft;
import net.josh.joshcraft.client.gui.GuiIDS;
import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCoalGeneratorMultiBlock extends BlockContainer {

	public BlockCoalGeneratorMultiBlock(int id) {
		super(id, Material.iron);
		this.setUnlocalizedName("coalGeneratorMultiBlock");
		this.setCreativeTab(JoshsCreativeTabs.tabJBlocks);
		this.setHardness(2F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		
		return new TileEntityCoalGeneratorMultiBlock();
	}
	
	@Override
	public void breakBlock(World world,int x,int y,int z, int par5, int par6){
		dropItems(world, x, y, z);
		super.breakBlock(world, x, y, z, par5, par6);
	}

	private void dropItems(World world, int x, int y, int z) {
		
		Random rand = new Random();
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		
		if(!(tile instanceof IInventory)){
			return;
		}
		
		IInventory inventory = (IInventory) tile;
		
		for(int i = 0; i < inventory.getSizeInventory(); i++){
			
			ItemStack item = inventory.getStackInSlot(i);
			
			if(item != null && item.stackSize > 0){
				
				float rx = rand.nextFloat() * 0.8F + 0.1F;
				float ry = rand.nextFloat() * 0.8F + 0.1F;
				float rz = rand.nextFloat() * 0.8F + 0.1F;
				
				EntityItem entity =  new EntityItem(world, x + rx, y + ry, z + rz, new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));
				
				if(item.hasTagCompound()){
					entity.getEntityItem().setTagCompound((NBTTagCompound)item.getTagCompound().copy());
				}
				float factor = 0.05F;
				entity.motionX = rand.nextGaussian() * factor;
				entity.motionY = rand.nextGaussian() * factor + 0.2F;
				entity.motionZ = rand.nextGaussian() * factor;
				world.spawnEntityInWorld(entity);
				item.stackSize = 0;
			}
			
		}
		
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int metadata, float what, float these, float are) {
		if (world.isRemote) {
			return true;
		} else {
			TileEntityCoalGeneratorMultiBlock tileentityfurnace = (TileEntityCoalGeneratorMultiBlock) world
					.getBlockTileEntity(x, y, z);

			if (tileentityfurnace != null) {
				player.openGui(JoshCraft.instance,
						GuiIDS.CoalGeneratorMultiBlock, world, x, y, z);
			}

			return true;
		}
	}
}
