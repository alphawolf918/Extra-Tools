package extratools.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;
import extratools.lib.DataInfo;

public class Items {
	/*
	 * Bows
	 */
	public static Item stoneBow = new StoneBow(DataInfo.stoneBow);
	public static Item ironBow = new IronBow(DataInfo.ironBow);
	public static Item quartzBow = new QuartzBow(DataInfo.quartzBow);
	public static Item goldBow = new GoldBow(DataInfo.goldBow);
	public static Item diamondBow = new DiamondBow(DataInfo.diamondBow);
	public static Item emeraldBow = new EmeraldBow(DataInfo.emeraldBow);
	public static Item rubyBow = new RubyBow(DataInfo.rubyBow);
	public static Item sapphireBow = new SapphireBow(DataInfo.sapphireBow);
	/*
	 * Ruby
	 */
	public static Item rubyGem = new RubyGem(DataInfo.ruby);
	public static Item rubyPick = new RubyPickaxe(DataInfo.rubyPickaxe,
			EnumToolMaterial.EMERALD);
	public static Item rubySpade = new RubyShovel(DataInfo.rubySpade,
			EnumToolMaterial.EMERALD);
	public static Item rubyAxe = new RubyAxe(DataInfo.rubyAxe,
			EnumToolMaterial.EMERALD);
	public static Item rubyHoe = new RubyHoe(DataInfo.rubyHoe,
			EnumToolMaterial.EMERALD);
	public static Item rubySword = new RubySword(DataInfo.rubySword,
			EnumToolMaterial.EMERALD);
	/*
	 * Emerald
	 */
	public static Item emeraldAxe = new EmeraldAxe(DataInfo.emeraldAxe,
			EnumToolMaterial.EMERALD);
	public static Item emeraldHoe = new EmeraldHoe(DataInfo.emeraldHoe,
			EnumToolMaterial.EMERALD);
	public static Item emeraldSpade = new EmeraldShovel(DataInfo.emeraldSpade,
			EnumToolMaterial.EMERALD);
	public static Item emeraldSword = new EmeraldSword(DataInfo.emeraldSword,
			EnumToolMaterial.EMERALD);
	public static Item emeraldPick = new EmeraldPickaxe(DataInfo.emeraldPick,
			EnumToolMaterial.EMERALD);
	/*
	 * public static Item emeraldHelmet = new EmeraldHelmet(
	 * DataInfo.emeraldHelmet, MainMod.EmeraldArmor, 4, 0); /* Quartz
	 */
	public static Item quartzAxe = new QuartzAxe(DataInfo.quartzAxe,
			EnumToolMaterial.IRON);
	public static Item quartzHoe = new QuartzHoe(DataInfo.quartzHoe,
			EnumToolMaterial.IRON);
	public static Item quartzPick = new QuartzPickaxe(DataInfo.quartzPick,
			EnumToolMaterial.IRON);
	public static Item quartzSpade = new QuartzShovel(DataInfo.quartzSpade,
			EnumToolMaterial.IRON);
	public static Item quartzSword = new QuartzSword(DataInfo.quartzSword,
			EnumToolMaterial.IRON);
	/*
	 * Sapphire
	 */
	public static Item sapphireGem = new SapphireGem(DataInfo.sapphire);
	public static Item sapphireAxe = new SapphireAxe(DataInfo.sapphireAxe,
			EnumToolMaterial.EMERALD);
	public static Item sapphireHoe = new SapphireHoe(DataInfo.sapphireHoe,
			EnumToolMaterial.EMERALD);
	public static Item sapphirePick = new SapphirePickaxe(
			DataInfo.sapphirePick, EnumToolMaterial.EMERALD);
	public static Item sapphireSpade = new SapphireShovel(
			DataInfo.sapphireSpade, EnumToolMaterial.EMERALD);
	public static Item sapphireSword = new SapphireSword(
			DataInfo.sapphireSword, EnumToolMaterial.EMERALD);
	
	public static void init() {
		/*
		 * Bows
		 */
		LanguageRegistry.addName(stoneBow, "Stone Bow");
		LanguageRegistry.addName(ironBow, "Iron Bow");
		LanguageRegistry.addName(quartzBow, "Quartz Bow");
		LanguageRegistry.addName(goldBow, "Golden Bow");
		LanguageRegistry.addName(diamondBow, "Diamond Bow");
		LanguageRegistry.addName(emeraldBow, "Emerald Bow");
		LanguageRegistry.addName(rubyBow, "Ruby Bow");
		LanguageRegistry.addName(sapphireBow, "Sapphire Bow");
		/*
		 * Ruby
		 */
		LanguageRegistry.addName(rubyGem, "Ruby");
		LanguageRegistry.addName(rubyPick, "Ruby Pickaxe");
		LanguageRegistry.addName(rubySpade, "Ruby Shovel");
		LanguageRegistry.addName(rubyAxe, "Ruby Axe");
		LanguageRegistry.addName(rubyHoe, "Ruby Hoe");
		LanguageRegistry.addName(rubySword, "Ruby Sword");
		/*
		 * Emerald
		 */
		LanguageRegistry.addName(emeraldAxe, "Emerald Axe");
		LanguageRegistry.addName(emeraldHoe, "Emerald Hoe");
		LanguageRegistry.addName(emeraldSpade, "Emerald Shovel");
		LanguageRegistry.addName(emeraldSword, "Emerald Sword");
		LanguageRegistry.addName(emeraldPick, "Emerald Pickaxe");
		// LanguageRegistry.addName(emeraldHelmet, "Emerald Helmet");
		/*
		 * Quartz
		 */
		LanguageRegistry.addName(quartzAxe, "Quartz Axe");
		LanguageRegistry.addName(quartzHoe, "Quartz Hoe");
		LanguageRegistry.addName(quartzPick, "Quartz Pickaxe");
		LanguageRegistry.addName(quartzSpade, "Quartz Shovel");
		LanguageRegistry.addName(quartzSword, "Quartz Sword");
		/*
		 * Sapphire
		 */
		LanguageRegistry.addName(sapphireGem, "Sapphire");
		LanguageRegistry.addName(sapphireSpade, "Sapphire Shovel");
		LanguageRegistry.addName(sapphirePick, "Sapphire Pickaxe");
		LanguageRegistry.addName(sapphireHoe, "Sapphire Hoe");
		LanguageRegistry.addName(sapphireAxe, "Sapphire Axe");
		LanguageRegistry.addName(sapphireSword, "Sapphire Sword");
	}
}