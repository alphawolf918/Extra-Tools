package extratools.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

public class QuartzSword extends ItemSword {
	public QuartzSword(int id, EnumToolMaterial material){
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(DataInfo.quartzSword_uname);
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.quartzSword_uname);
	}
}
