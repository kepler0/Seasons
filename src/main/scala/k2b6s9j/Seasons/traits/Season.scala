package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase

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
      }
    }
  }

  def canSnow: Boolean = {
    _
  }

  def canRain: Boolean = {
    _
  }

}