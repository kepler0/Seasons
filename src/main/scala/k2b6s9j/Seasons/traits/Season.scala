package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase

trait Season {
  
  def setWeather() {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {
        if (canSnow) {
          biome.setDisableRain().setEnableSnow()
        }
        biome.setTemperatureRainfall(temperature, rainFrequency)
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