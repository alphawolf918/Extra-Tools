package extratools.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extratools.items.Items;
import extratools.lib.DataInfo;
import extratools.lib.ModInfo;

public class SapphireOre extends Block {
	public SapphireOre(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(DataInfo.sapphireOre_uname);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(6F);
		this.setResistance(4F);
		this.setStepSound(Block.soundStoneFootstep);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 5); //5 = Ruby
	}

	public int idDropped(int i, Random random, int j) {
		return Items.sapphireGem.itemID;
	}

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 50);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ DataInfo.sapphireOre_uname);
	}
}