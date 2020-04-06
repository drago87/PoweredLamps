package drago87.mod.init;

import java.util.ArrayList;
import java.util.List;

import drago87.mod.objects.armour.ArmorBase;
import drago87.mod.objects.items.ItemBase;
import drago87.mod.objects.tools.ToolAxe;
import drago87.mod.objects.tools.ToolHoe;
import drago87.mod.objects.tools.ToolPickaxe;
import drago87.mod.objects.tools.ToolShovel;
import drago87.mod.objects.tools.ToolSword;
import drago87.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_COPPER = new EnumHelper().addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOUR_COPPER = new EnumHelper().addArmorMaterial("armour_copper", Reference.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	
	//Tools
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	
	//Armour
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOUR_COPPER, 2, EntityEquipmentSlot.FEET);
}
