package Joshcraft.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import Joshcraft.blocks.BlockHandler;
import Joshcraft.items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class CraftingHandler {
	
	public static void init(){
	

		FurnaceRecipes.smelting().addSmelting(BlockHandler.WaterBleachedOre.blockID, 0, new ItemStack(ItemHandler.WaterBleachedIngot), 0.1F);
		
		ItemStack BrightRoseStack = new ItemStack(ItemHandler.BrightRoseGem);
		ItemStack BrightRoseBrickStack = new ItemStack(BlockHandler.BrightRoseBrick);
		
		ItemStack DimRoseStack = new ItemStack(ItemHandler.DimRoseGem);
		ItemStack DimRoseBrickStack = new ItemStack(BlockHandler.DimRoseBrick);
		
		ItemStack JustinaiteStack = new ItemStack(ItemHandler.JustinaiteGem);
		ItemStack JustinaiteBrickStack = new ItemStack(BlockHandler.JustinaiteBrick);
		
		ItemStack WaterBleachedStack = new ItemStack(ItemHandler.WaterBleachedIngot);
		ItemStack WaterBleachedBlockStack = new ItemStack(BlockHandler.WaterBleachedBrick);
		
		ItemStack StickStack = new ItemStack(Item.stick);
		ItemStack BrickStack = new ItemStack(Block.stoneBrick);
		

		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRosePick), "III", " S ", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRosePick), "III", " S ", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaitePick), "III", " S ", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedPick), "III", " S ", " S ",'I', WaterBleachedStack, 'S', StickStack);
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRoseAxe), "II ", "IS ", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRoseAxe), "II ", "IS ", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaiteAxe), "II ", "IS ", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedAxe), "II ", "IS ", " S ",'I', WaterBleachedStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRoseAxe), " II", " SI", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRoseAxe), " II", " SI", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaiteAxe), " II", " SI", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedAxe), " II", " SI", " S ",'I', WaterBleachedStack, 'S', StickStack);
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRoseHoe), "II ", " S ", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRoseHoe), "II ", " S ", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaiteHoe), "II ", " S ", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedHoe), "II ", " S ", " S ",'I', WaterBleachedStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRoseHoe), " II", " S ", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRoseHoe), " II", " S ", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaiteHoe), " II", " S ", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedHoe), " II", " S ", " S ",'I', WaterBleachedStack, 'S', StickStack);
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRoseShovel), " I ", " S ", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRoseShovel), " I ", " S ", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaiteShovel), " I ", " S ", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedShovel), " I ", " S ", " S ",'I', WaterBleachedStack, 'S', StickStack);
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BrightRoseSword), " I ", " I ", " S ",'I', BrightRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.DimRoseSword), " I ", " I ", " S ",'I', DimRoseStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.JustinaiteSword), " I ", " I ", " S ", 'I', JustinaiteStack, 'S', StickStack);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.WaterBleachedSword), " I ", " I ", " S ",'I', WaterBleachedStack, 'S', StickStack);
		
		GameRegistry.addRecipe(new ItemStack(BlockHandler.WaterBleachedBrick), "III", "IBI", "III",'I', WaterBleachedStack, 'B', BrickStack);
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BrightRoseBrick), "III", "IBI", "III",'I', BrightRoseStack, 'B', BrickStack);
		GameRegistry.addRecipe(new ItemStack(BlockHandler.DimRoseBrick), "III", "IBI", "III",'I', DimRoseStack, 'B', BrickStack);
		GameRegistry.addRecipe(new ItemStack(BlockHandler.WaterBleachedBrick), "III", "IBI", "III",'I', JustinaiteStack, 'B', BrickStack);
		
		GameRegistry.addRecipe(new ItemStack(BlockHandler.WaterBleachedSmallBrick), "BB", "BB", 'B', WaterBleachedBlockStack);
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BrightRoseSmallBrick), "BB", "BB", 'B', BrightRoseBrickStack);
		GameRegistry.addRecipe(new ItemStack(BlockHandler.DimRoseSmallBrick), "BB", "BB", 'B', DimRoseBrickStack);
		GameRegistry.addRecipe(new ItemStack(BlockHandler.JustinaiteSmallBrick), "BB", "BB", 'B', JustinaiteBrickStack);
		
		
	
	}
}
