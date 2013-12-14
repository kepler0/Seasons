package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase
import k2b6s9j.Seasons.Log
import cpw.mods.fml.common.ITickHandler

trait Season {
  
  def setWeather() {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {
        if (!canRain) {
          biome.setDisableRain()
        }
        if (canSnow) {
          biome.setEnableSnow()
        }
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