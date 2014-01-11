package net.josh.joshcraft.client.gui;

import net.josh.joshcraft.core.info.Info;
import net.josh.joshcraft.energy.ContainerCoalGeneratorMultiblock;
import net.josh.joshcraft.energy.TileEntityCoalGeneratorMultiBlock;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiCoalGeneratorMultiBlock extends GuiContainer
{
    private static final ResourceLocation furnaceGuiTextures = new ResourceLocation(Info.MODID + ":textures/gui/container/CoalGeneratorMultiBlock.png");

    public GuiCoalGeneratorMultiBlock(InventoryPlayer par1InventoryPlayer, TileEntityCoalGeneratorMultiBlock par2TileEntityIronOreWasher)
    {
        super(new ContainerCoalGeneratorMultiblock(par1InventoryPlayer, par2TileEntityIronOreWasher));
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString("Coal Generator", this.xSize / 3, 3 + 2, 4210752);
        this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

    }
}
