package k2b6s9j.Seasons.seasons

import k2b6s9j.Seasons.traits.Season

trait Winter extends Season{

  override def canRain: Boolean = {
    false
  }

  override def canSnow: Boolean = {
    true
  }

}
