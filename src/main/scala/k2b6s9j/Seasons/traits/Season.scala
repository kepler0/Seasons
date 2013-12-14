package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase
import net.minecraftforge.common.BiomeDictionary
import scala.util.control.Breaks._

trait Season {
  
  def setWeather() {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WATER)) {
          //I would rather not freeze over the oceans
          break()
        }
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DESERT)) {
          biome.setDisableRain()
          break()
        }
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FROZEN)) {
          //And let's not melt any frozen biomes, they're frozen for a reason.
          break()
        }
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.NETHER)) {
          //Do not under any circumstances freeze over hell.
          break()
        }
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.END)) {
          //I would rather not piss of those of the Ender realm.
          break()
        }
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MUSHROOM)) {
          //I will not touch the majestic mushroom biomes. Plus, they kinda scare me.
          break()
        }
        else {
          //Ok. No that we've ran through the black list...
          if (canSnow) {
            biome.setDisableRain().setEnableSnow()
          }
          biome.temperature = temperature
        }
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