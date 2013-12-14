package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase
import k2b6s9j.Seasons.Log
import net.minecraft.server.MinecraftServer

trait Season {
  
  def setWeather() {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {
        if (canSnow) {
          biome.setDisableRain().setEnableSnow()
        }
        biome.temperature = temperature
      }
    }
    Log.info("Your world is " + MinecraftServer.getServer.worldServerForDimension(0).getWorldInfo.getWorldTotalTime.toString)
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