package extratools.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

public class EmeraldHoe extends ItemHoe {
	public EmeraldHoe(int id, EnumToolMaterial material){
		super(id, material);
		this.setUnlocalizedName(DataInfo.emeraldHoe_uname);
		this.setMaxDamage(600);
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.emeraldHoe_uname);
	}
}
