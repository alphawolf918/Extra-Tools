package extratools.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

/*
 * Ruby Gem
 */

public class RubyGem extends Item {
	public RubyGem(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(DataInfo.ruby_uname);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.ruby_uname);
	}
}