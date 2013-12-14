package k2b6s9j.Seasons.months

import k2b6s9j.Seasons.traits.Month
import k2b6s9j.Seasons.traits.seasons.Autumn

object September extends Month with Autumn {

  override def daysInMonth: Int = {
    30
  }

  override def temperature: Float = {
    1.25F
  }

}
