package extratools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

public class RubyBlock extends Block {
	public RubyBlock(int id) {
		super(id, Material.iron);
		this.setUnlocalizedName(DataInfo.rubyBlock_uname);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(5F);
		this.setResistance(5F);
		this.setStepSound(Block.soundMetalFootstep);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.rubyBlock_uname);
	}
}