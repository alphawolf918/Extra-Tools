package extratools.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import extratools.lib.DataInfo;

public class Blocks {
	
	//Ruby
	public static Block rubyBlock = new RubyBlock(DataInfo.rubyBlock);
	public static Block rubyOre = new RubyOre(DataInfo.rubyOre);
	
	//Sapphire
	public static Block sapphireBlock = new SapphireBlock(DataInfo.sapphireBlock);
	public static Block sapphireOre = new SapphireOre(DataInfo.sapphireOre);
	
	public static void init(){
		GameRegistry.registerBlock(rubyBlock, DataInfo.rubyBlock_name);
		GameRegistry.registerBlock(rubyOre, DataInfo.rubyOre_name);
		GameRegistry.registerBlock(sapphireBlock, DataInfo.sapphireBlock_name);
		GameRegistry.registerBlock(sapphireOre, DataInfo.sapphireOre_name);
		addNames();
	}
	
	public static void addNames(){
		LanguageRegistry.addName(rubyBlock, DataInfo.rubyBlock_name);
		LanguageRegistry.addName(rubyOre, DataInfo.rubyOre_name);
		LanguageRegistry.addName(sapphireBlock, DataInfo.sapphireBlock_name);
		LanguageRegistry.addName(sapphireOre, DataInfo.sapphireOre_name);
	}
}