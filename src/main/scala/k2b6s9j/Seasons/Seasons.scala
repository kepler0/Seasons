package k2b6s9j.Seasons

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import k2b6s9j.Seasons.months.December

@Mod(name = "Seasons", modid = "seasons", version = "ModJam", modLanguage = "scala")
object Seasons {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) {

    Log.info("Seasons")
    Log.info("Copyright Kepler Sticka-Jones 2013")

  }

  @EventHandler
  def Init(event: FMLInitializationEvent) {

  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) {

    Log.info("Currently testing the month of December globally.")
    December.setWeather

  }

}