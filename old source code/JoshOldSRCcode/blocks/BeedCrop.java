/*package Joshcraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import Joshcraft.items.ItemHandler;

public class BeedCrop extends Block {

    public BeedCrop (int id) {
        super(id,Material.plants);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
        setTickRandomly(true);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool (World world, int x,
            int y, int z) {
        return null;
    }

    @Override
    public int getRenderType () {
        return 6;
    }

    @Override
    public boolean isOpaqueCube () {
        return false;
    }


    @Override
    public void updateTick (World world, int x, int y, int z, Random random) {
        if (world.getBlockMetadata(x, y, z) == 1) {
            return;
        }

        if (random.nextInt(isFertile(world, x, y - 1, z) ? 12 : 25) != 0) {
            return;
        }

        world.setBlockMetadataWithNotify(blockID, getRenderType(), getBlockColor(), getMobilityFlag(), getRenderBlockPass());
    }

    @Override
    public void onNeighborBlockChange (World world, int x, int y, int z,
            int neighborId) {
        if (!canBlockStay(world, x, y, z)) {
            dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            
        }
    }

    @Override
    public boolean canBlockStay (World world, int x, int y, int z) {
        Block soil = blocksList[world.getBlockId(x, y - 1, z)];
        return (world.getFullBlockLightValue(x, y, z) >= 8 || world
                .canBlockSeeTheSky(x, y, z))
                && (soil != null && soil.canSustainPlant(world, x, y - 1, z,
                        ForgeDirection.UP, ItemHandler.BeefSeed));
    }

    @Override
    public int idDropped (int metadata, Random random, int par2) {
        switch (metadata) {
        case 0:
            return ItemHandler.BeefSeed.itemID;
        case 1:
            return Item.beefRaw.itemID;
        default:
            // Error case!
            return -1; // air
        }
    }

    @Override
    public int idPicked (World world, int x, int y, int z) {
        return ItemHandler.BeefSeed.itemID;
    }
}*/