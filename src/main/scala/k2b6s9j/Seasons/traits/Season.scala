package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase

trait Season {

  def setWeather() {
    for (biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if (biome != null) {
        if (canSnow) {
          biome.setDisableRain().setEnableSnow()
        }
        biome.temperature = temperature
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

}