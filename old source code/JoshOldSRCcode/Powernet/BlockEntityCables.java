package Joshcraft.Powernet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import Joshcraft.JoshcraftMain;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEntityCables extends Block {

	public BlockEntityCables(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(JoshcraftMain.tabsJoshCraftBlock);
		
		
	}
	@Override
    public int getRenderBlockPass(){
		
        return 1;
		
    }


	@Override
    public boolean isOpaqueCube(){
    	
        return false;
		
    }
	@Override
    public int getLightOpacity(World world, int x, int y, int z)
    {
        return 0;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir){
		
            this.blockIcon = ir.registerIcon(ModInfo.ID + ":" + "cabels");
           
    }
	
	public TileEntity createTileEntity(World world, int metadata)
	{
	   return new TileEntityCables();
	}

}
