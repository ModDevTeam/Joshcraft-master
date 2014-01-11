package net.josh.joshcraft;

import java.util.logging.Logger;

import net.josh.joshcraft.blocks.Blocks;
import net.josh.joshcraft.client.gui.GuiHandler;
import net.josh.joshcraft.core.config.Config;
import net.josh.joshcraft.core.info.Info;
import net.josh.joshcraft.core.proxys.CommonProxy;
import net.josh.joshcraft.creativetabs.JoshsCreativeTabs;
import net.josh.joshcraft.energy.Powernet;
import net.josh.joshcraft.items.Items;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(name = Info.NAME, modid = Info.MODID, version = Info.VERSION)
@NetworkMod(clientSideRequired = Info.CLIENT, serverSideRequired = Info.SERVER)
public class JoshCraft {

	@Instance(Info.MODID)
	public static JoshCraft instance;

	@SidedProxy(clientSide = Info.CLIENTPROXY, serverSide = Info.COMMONPROXY)
	public static CommonProxy proxy;

	public static Logger logger;
	private GuiHandler guiHandler = new GuiHandler();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		logger = Logger.getLogger(Info.MODID);
		logger.setParent(FMLLog.getLogger());

		Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
		Config.load(config);
		
		Powernet.init();
		Blocks.init();
		Items.init();

		new JoshsCreativeTabs();
		JoshsCreativeTabs();
		
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);

	}

	private void JoshsCreativeTabs() {
		
		 LanguageRegistry.instance().addStringLocalization("itemGroup.tabJBlocks" , "en_US" , "Josh's Blocks" );
		 LanguageRegistry.instance().addStringLocalization("itemGroup.tabJItems", "en_US", "Josh's Items");
		 
	}

}
