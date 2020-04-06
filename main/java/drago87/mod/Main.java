package drago87.mod;

import drago87.mod.proxy.CommonProxy;
import drago87.mod.tabs.PoweredLampsTab;
import drago87.mod.util.Reference;
import drago87.mod.util.handelers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	public static final CreativeTabs POWEREDLAMPSTAB = new PoweredLampsTab("poweredlampstab");
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {RegistryHandler.otherRegistries();}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
	
}
