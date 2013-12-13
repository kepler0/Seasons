package k2b6s9j.Seasons.traits.seasons

import k2b6s9j.Seasons.traits.Season

trait Summer extends Season {

  override def canRain: Boolean = {
    false
  }

  override def canSnow: Boolean = {
    false
  }

}
