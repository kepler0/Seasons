package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase

trait Season {
  
  def setWeather {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {

      }
    }
  }

}