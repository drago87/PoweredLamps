package drago87.mod.tabs;

import drago87.mod.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PoweredLampsTab extends CreativeTabs
{

	public PoweredLampsTab(String label) 
	{
		super("poweredlampstab");
		this.setBackgroundImageName("poweredlamps.png");
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(BlockInit.BLOCK_COPPER));
	}
	
}
