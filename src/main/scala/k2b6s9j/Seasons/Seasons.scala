package k2b6s9j.Seasons

import cpw.mods.fml.common.{ITickHandler, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import cpw.mods.fml.common.registry.TickRegistry
import cpw.mods.fml.relauncher.Side

@Mod(name = "Seasons", modid = "seasons", version = "ModJam", modLanguage = "scala")
object Seasons {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) {

    Log.info("Seasons")
    Log.info("Copyright Kepler Sticka-Jones 2013")

  }

  @EventHandler
  def Init(event: FMLInitializationEvent) {

    TickRegistry.registerTickHandler(new SeasonalTickHandler.type, Side.SERVER)

  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) {

  }

}

object SeasonalTickHandler extends ITickHandler {

}