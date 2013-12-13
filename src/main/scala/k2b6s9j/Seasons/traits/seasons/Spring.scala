package k2b6s9j.Seasons.traits.seasons

import k2b6s9j.Seasons.traits.Season

trait Spring extends Season {

  override def canRain: Boolean = {
    true
  }

  override def canSnow: Boolean = {
    false
  }

}
