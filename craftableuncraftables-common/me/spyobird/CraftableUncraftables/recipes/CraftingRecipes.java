package me.spyobird.CraftableUncraftables.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes
{            
    private static final CraftingRecipes instance = new CraftingRecipes();
    
    public static final CraftingRecipes getInstance()
    {
        return instance;
    }
        
    public static void init()
    {
        //Horse Items
        //Nametag
        GameRegistry.addRecipe(new ItemStack(Item.field_111212_ci, 2), new Object[]
        {
        " ZZ",
        "XYZ",
        "Y  ",
        'X', new ItemStack(Item.dyePowder, 1), 'Y', Item.paper, 'Z', Item.silk
        });
        GameRegistry.addRecipe(new ItemStack(Item.field_111212_ci, 2), new Object[]
        {
        " ZZ",
        " YZ",
        "YX ",
        'X', new ItemStack(Item.dyePowder, 1), 'Y', Item.paper, 'Z', Item.silk
        });
        GameRegistry.addRecipe(new ItemStack(Item.field_111212_ci, 3), new Object[]
        {
        " ZZ",
        "XYZ",
        "YX ",
        'X', new ItemStack(Item.dyePowder, 1, 7), 'Y', Item.paper, 'Z', Item.silk
        });
        GameRegistry.addRecipe(new ItemStack(Item.field_111212_ci, 3), new Object[]
        {
        " ZZ",
        "XYZ",
        "YX ",
        'X', new ItemStack(Item.dyePowder, 1, 8), 'Y', Item.paper, 'Z', Item.silk
        });
        
        //Iron Horse Armor
        GameRegistry.addRecipe(new ItemStack(Item.field_111215_ce, 1), new Object[]
        {
        " XX",
        "YX ",
        "XYX",
        'X', Item.ingotIron, 'Y', new ItemStack(Block.cloth, 1, 15)
        });
        
        //Gold Horse Armor
        GameRegistry.addRecipe(new ItemStack(Item.field_111216_cf, 1), new Object[]
        {
        " XX",
        "YX ",
        "XYX",
        'X', Item.ingotGold, 'Y', new ItemStack(Block.cloth, 1, 14)
        });
        
        //Diamond Horse Armor
        GameRegistry.addRecipe(new ItemStack(Item.field_111213_cg, 1), new Object[]
        {
        " ZX",
        "YX ",
        "ZYX",
        'X', Item.diamond, 'Y', new ItemStack(Block.cloth, 1, 3), 'Z', Item.ingotIron
        });
        
        //Decorative Blocks
        //Grass Block
        GameRegistry.addRecipe(new ItemStack(Block.grass, 1), new Object[]
        {
        "X",
        "Y",
        'X', new ItemStack(Block.tallGrass, 1, 1), 'Y', Block.dirt
        });
        
        //Mycelium
        GameRegistry.addRecipe(new ItemStack(Block.mycelium, 1), new Object[]
        {
        "X",
        "Y",
        'X', Block.mushroomBrown, 'Y', Block.grass
        });
        
        //Mossy Cobblestone
        GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy, 1), new Object[]
        {
        "XXX",
        "XYX",
        "XXX",
        'X', Block.vine, 'Y', Block.cobblestone
        });
        
        //Mossy Stone Brick
        GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 1), new Object[]
        {
        "XXX",
        "XYX",
        "XXX",
        'X', Block.vine, 'Y', Block.stoneBrick
        });
        
        //Ores
        //Coal
        GameRegistry.addRecipe(new ItemStack(Block.oreCoal, 1), new Object[]
        {
        "XXX",
        "YYY",
        "XXX",
        'X', Block.stone, 'Y', Item.coal
        });       
        
        //Diamond
        GameRegistry.addRecipe(new ItemStack(Block.oreDiamond, 1), new Object[]
        {
        "XXX",
        "YYY",
        "XXX",
        'X', Block.stone, 'Y', Item.diamond
        });
        
        //Emerald
        GameRegistry.addRecipe(new ItemStack(Block.oreEmerald, 1), new Object[]
        {
        "XXX",
        "YYY",
        "XXX",
        'X', Block.stone, 'Y', Item.emerald
        });
        
        //Misc
    }    
}
