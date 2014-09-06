package extratools;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import extratools.blocks.Blocks;
import extratools.items.Items;
import extratools.lib.ModInfo;
import extratools.lib.Recipes;
import extratools.managers.EventManager;
import extratools.proxies.CommonProxy;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true,
		serverSideRequired = true)
public class MainMod {
	
	public static EnumArmorMaterial EmeraldArmor = EnumHelper
			.addArmorMaterial("EmeraldArmorMaterial", 39, new int[] { 3,
					8, 6, 4 }, 11);
	
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy",
			serverSide = ModInfo.PROXY_LOCATION
					+ ".CommonProxy")
	public static CommonProxy proxy;
	public static EventManager em = new EventManager();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Items.init();
		Blocks.init();
		Recipes.init();
		GameRegistry.registerWorldGenerator(em);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
