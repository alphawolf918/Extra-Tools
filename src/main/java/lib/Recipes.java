package extratools.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import extratools.blocks.Blocks;
import extratools.items.Items;

public class Recipes {
	public static void init(){
		/*
		 * Stone
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.stoneBow, 1), new Object[]{
			" CS","C S"," CS", 'C', Block.cobblestone, 'S', Item.silk
		});
		/*
		 * Iron
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.ironBow, 1), new Object[]{
			" IS","I S"," IS", 'I', Item.ingotIron, 'S', Item.silk
		});
		/*
		 * Quartz
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.quartzBow, 1), new Object[]{
			" QS","Q S"," QS", 'Q', Item.netherQuartz, 'S', Item.silk
		});
		/*
		 * Gold
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.goldBow, 1), new Object[]{
			" GS","G S"," GS",'G', Item.ingotGold, 'S', Item.silk
		});
		/*
		 * Diamond
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.diamondBow, 1), new Object[]{
			" DS", "D S"," DS", 'D', Item.diamond, 'S', Item.silk
		});
		/*
		 * Emerald
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.emeraldBow, 1), new Object[]{
			" ES","E S"," ES", 'E', Item.emerald, 'S', Item.silk
		});
		/*
		 * Ruby
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.rubyBow, 1), new Object[]{
			" RS","R S"," RS", 'R', Items.rubyGem, 'S', Item.silk
		});
		/*
		 * Sapphire
		 */
		//Bow
		GameRegistry.addRecipe(new ItemStack(Items.sapphireBow, 1), new Object[]{
			" US","U S"," US", 'U', Items.sapphireGem, 'S', Item.silk
		});
		/*
		 * Ruby
		 */
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(Items.rubyPick, 1), new Object[]{
			"RRR"," S "," S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(Items.rubySpade, 1), new Object[]{
			" R "," S ", " S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		//Axe
		GameRegistry.addRecipe(new ItemStack(Items.rubyAxe, 1), new Object[]{
			" RR", " SR"," S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.rubyAxe, 1), new Object[]{
			"RR ", "RS "," S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		//Hoe
		GameRegistry.addRecipe(new ItemStack(Items.rubyHoe, 1), new Object[]{
			"RR "," S ", " S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.rubyHoe, 1), new Object[]{
			" RR"," S ", " S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		//Sword
		GameRegistry.addRecipe(new ItemStack(Items.rubySword, 1), new Object[]{
			" R "," R "," S ", 'R', Items.rubyGem, 'S', Item.stick
		});
		//Block
		GameRegistry.addRecipe(new ItemStack(Blocks.rubyBlock, 1), new Object[]{
			"RRR","RRR","RRR", 'R', Items.rubyGem
		});
		//Gem
		GameRegistry.addShapelessRecipe(new ItemStack(Items.rubyGem, 9), new Object[]{
			Blocks.rubyBlock
		});
		/*
		 * Emerald
		 */
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(Items.emeraldPick, 1), new Object[]{
			"EEE"," S "," S ", 'E', Item.emerald, 'S', Item.stick
		});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(Items.emeraldSpade, 1), new Object[]{
			" E "," S ", " S ", 'E', Item.emerald, 'S', Item.stick
		});
		//Axe
		GameRegistry.addRecipe(new ItemStack(Items.emeraldAxe, 1), new Object[]{
			" EE", " SE"," S ", 'E', Item.emerald, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldAxe, 1), new Object[]{
			"EE ", "ES "," S ", 'E', Item.emerald, 'S', Item.stick
		});
		//Hoe
		GameRegistry.addRecipe(new ItemStack(Items.emeraldHoe, 1), new Object[]{
			"EE "," S ", " S ", 'E', Item.emerald, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldHoe, 1), new Object[]{
			" EE"," S ", " S ", 'E', Item.emerald, 'S', Item.stick
		});
		//Sword
		GameRegistry.addRecipe(new ItemStack(Items.emeraldSword, 1), new Object[]{
			" E "," E "," S ", 'E', Item.emerald, 'S', Item.stick
		});
		/*
		 * Quartz
		 */
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(Items.quartzPick, 1), new Object[]{
			"EEE"," S "," S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(Items.quartzSpade, 1), new Object[]{
			" E "," S ", " S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		//Axe
		GameRegistry.addRecipe(new ItemStack(Items.quartzAxe, 1), new Object[]{
			" EE", " SE"," S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.quartzAxe, 1), new Object[]{
			"EE ", "ES "," S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		//Hoe
		GameRegistry.addRecipe(new ItemStack(Items.quartzHoe, 1), new Object[]{
			"EE "," S ", " S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.quartzHoe, 1), new Object[]{
			" EE"," S ", " S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		//Sword
		GameRegistry.addRecipe(new ItemStack(Items.quartzSword, 1), new Object[]{
			" E "," E "," S ", 'E', Item.netherQuartz, 'S', Item.stick
		});
		/*
		 * Sapphire
		 */
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(Items.sapphirePick, 1), new Object[]{
			"RRR"," S "," S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(Items.sapphireSpade, 1), new Object[]{
			" R "," S ", " S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		//Axe
		GameRegistry.addRecipe(new ItemStack(Items.sapphireAxe, 1), new Object[]{
			" RR", " SR"," S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.sapphireAxe, 1), new Object[]{
			"RR ", "RS "," S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		//Hoe
		GameRegistry.addRecipe(new ItemStack(Items.sapphireHoe, 1), new Object[]{
			"RR "," S ", " S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.sapphireHoe, 1), new Object[]{
			" RR"," S ", " S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		//Sword
		GameRegistry.addRecipe(new ItemStack(Items.sapphireSword, 1), new Object[]{
			" R "," R "," S ", 'R', Items.sapphireGem, 'S', Item.stick
		});
		//Block
		GameRegistry.addRecipe(new ItemStack(Blocks.sapphireBlock, 1), new Object[]{
			"RRR","RRR","RRR", 'R', Items.sapphireGem
		});
		//Gem
		GameRegistry.addShapelessRecipe(new ItemStack(Items.sapphireGem, 9), new Object[]{
			Blocks.sapphireBlock
		});
		
		/*
		 * Smelting
		 */
		//Ruby
		int input = Blocks.rubyOre.blockID;
		ItemStack output = new ItemStack(Items.rubyGem, 1);
		float xp = 20F;
		GameRegistry.addSmelting(input, output, xp);
		//Sapphire
		int input2 = Blocks.sapphireOre.blockID;
		ItemStack output2 = new ItemStack(Items.sapphireGem, 1);
		float xp2 = 30F;
		GameRegistry.addSmelting(input2, output2, xp2);
	}
}