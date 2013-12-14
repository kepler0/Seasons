package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase
import k2b6s9j.Seasons.Log
import cpw.mods.fml.common.ITickHandler

trait Season {
  
  def setWeather() {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {
        if (!canRain) {
          Log.info("Disabling Rain in biome " + biome.toString)
          biome.setDisableRain()
        }
        if (canSnow) {
          Log.info("Enabling Snow in biome " + biome.toString)
          biome.setEnableSnow()
        }
        Log.info("Setting temperature at float " + temperature.toString + " in biome " + biome.toString)
        Log.info("Setting rain frequency at float " + rainFrequency.toString + " in biome " + biome.toString)
        biome.setTemperatureRainfall(biome.getFloatTemperature, rainFrequency)
      }
    }
  }

  def canSnow: Boolean = {
    false
  }

  def canRain: Boolean = {
    false
  }

  def temperature: Float = {
    1.0F
  }

  def rainFrequency: Float = {
    0.0F
  }

}