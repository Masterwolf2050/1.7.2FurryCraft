package furcraft;

import furcraft.lib.Reference;
import cpw.mods.fml.common.mod;
import cpw.mods.fml.common.mod.Init;
import cpw.mods.fml.common.mod.PostInit;
import cpw.mods.fml.common.mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION)


public class FurCraft{
    @PreInit
    public void preInit(FMLPreInitializationEvent event) { }
    
    @Init
    public void load(FMLInitializationEvent event) { }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) { }
}
