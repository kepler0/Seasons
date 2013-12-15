package k2b6s9j.Seasons

import k2b6s9j.Seasons.months._

object TimeManager {

  def ticksInYear(): Int = {
    January.ticksInMonth + February.ticksInMonth + March.ticksInMonth + April.ticksInMonth + May.ticksInMonth + June.ticksInMonth + July.ticksInMonth + August.ticksInMonth + September.ticksInMonth + October.ticksInMonth + November.ticksInMonth + December.ticksInMonth
  }

}