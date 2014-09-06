package extratools.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

public class SapphireAxe extends ItemAxe {
	public SapphireAxe(int id, EnumToolMaterial material){
		super(id, material);
		this.setUnlocalizedName(DataInfo.sapphireAxe_uname);
		this.setMaxDamage(800);
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.sapphireAxe_uname);
	}
}
