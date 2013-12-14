package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase
import k2b6s9j.Seasons.Log

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
        Log.info("Setting rainfall at float " + rainTemp.toString + " in biome " + biome.toString)
        biome.setTemperatureRainfall(rainTemp, rainTemp)
      }
    }
  }

  def canSnow: Boolean = {
    false
  }

  def canRain: Boolean = {
    false
  }

  def rainTemp: Float = {
    1F
  }

}