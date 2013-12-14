package k2b6s9j.Seasons.months

import k2b6s9j.Seasons.traits.Month
import k2b6s9j.Seasons.traits.seasons.Winter

object December extends Month with Winter {

  override def daysInMonth: Int = {
    31
  }

  override def temperature: Float = {
    0.0F
  }

  override def rainFrequency: Float = {
    0.5F
  }

}
