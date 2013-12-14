package k2b6s9j.Seasons.months

import k2b6s9j.Seasons.traits.Month
import k2b6s9j.Seasons.traits.seasons.Summer

object July extends Month with Summer {

  override def daysInMonth: Int = {
    31
  }

  override def temperature: Float = {
    2.0F
  }

}
