package me.spyobird.CraftableUncraftables;

import me.spyobird.CraftableUncraftables.recipes.CraftingRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = "CraftableUncraftables", name = "Craftable Uncraftables", version = "v0.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
        
public class CraftableUncraftables
{   
    public static final String modid = "CraftbleUncraftables";
            
    @Instance("CraftableUncraftables")
    public static CraftableUncraftables instance;
            
    @EventHandler
    public void load(FMLPreInitializationEvent event)
    {
        
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        CraftingRecipes.init();
    }

    @EventHandler
    public static void load(FMLPostInitializationEvent event)
    {
        
    }
}