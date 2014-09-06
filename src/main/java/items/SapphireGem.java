package extratools.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

/*
 * Sapphire Gem
 */

public class SapphireGem extends Item {
	public SapphireGem(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(DataInfo.sapphire_uname);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.sapphire_uname);
	}
}