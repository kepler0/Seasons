package k2b6s9j.Seasons.months

import k2b6s9j.Seasons.traits.Month
import k2b6s9j.Seasons.traits.seasons.Spring

object May extends Month with Spring {

  override def daysInMonth: Int = {
    31
  }

  override def temperature: Float = {
    1.25F
  }

}
