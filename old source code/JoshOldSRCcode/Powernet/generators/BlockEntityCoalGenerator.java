package Joshcraft.Powernet.generators;

import Joshcraft.JoshcraftMain;
import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEntityCoalGenerator extends Block {

	public BlockEntityCoalGenerator(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(JoshcraftMain.tabsJoshCraftBlock);
		
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir){
		
            this.blockIcon = ir.registerIcon(ModInfo.ID + ":" + "coalgeneratoroff");
           
    }
	
	public TileEntity createTileEntity(World world, int metadata)
	{
	   return new TileEntityCoalGenerator();
	}
}
