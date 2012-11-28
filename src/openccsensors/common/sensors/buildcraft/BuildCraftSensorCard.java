package openccsensors.common.sensors.buildcraft;

import cpw.mods.fml.common.registry.GameRegistry;
import openccsensors.common.core.ISensorCard;
import openccsensors.common.core.ISensorInterface;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class BuildCraftSensorCard extends Item implements ISensorCard
{

	public BuildCraftSensorCard(int par1)
	{
		super(par1);
		setCreativeTab(CreativeTabs.tabRedstone);

		GameRegistry.addRecipe(new ItemStack(this), 
				"ccr",
				"crp",
				"rrp",
				'r', new ItemStack(Item.redstone),
				'c', ic2.api.Items.getItem("uraniumIngot") ,
				'p', new ItemStack(Item.paper));
	}

	@Override
	public ISensorInterface getSensorInterface(ItemStack itemstack, boolean turtle) 
	{
		return new BuildCraftSensorInterface();
	}
	
	@Override
	public String getItemNameIS(ItemStack is)
	{
		return "openccsensors.item.buildcraftsensor";
	}
	
}
