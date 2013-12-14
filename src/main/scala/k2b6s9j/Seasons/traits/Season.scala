package k2b6s9j.Seasons.traits

import net.minecraft.world.biome.BiomeGenBase
import net.minecraftforge.common.BiomeDictionary

trait Season {
  
  def setWeather() {
    for(biome: BiomeGenBase <- BiomeGenBase.biomeList) {
      if(biome != null) {
        if (!biomeBlacklisted(biome)) {
          //Ok. Now that we've ran through the blacklist...
          if (canSnow) {
            biome.setDisableRain().setEnableSnow()
          }
          biome.temperature = temperature
        }
      }
    }
  }

  def biomeBlacklisted(biome: BiomeGenBase): Boolean = {
    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WATER)) {
      //I would rather not freeze over the oceans
      true
    }
    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DESERT)) {
      true
    }
    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FROZEN)) {
      //And let's not melt any frozen biomes, they're frozen for a reason.
      true
    }
    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.NETHER)) {
      //Do not under any circumstances freeze over hell.
      true
    }
    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.END)) {
      //I would rather not piss of those of the Ender realm.
      true
    }
    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MUSHROOM)) {
      //I will not touch the majestic mushroom biomes. Plus, they kinda scare me.
      true
    }
    else {
      false
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