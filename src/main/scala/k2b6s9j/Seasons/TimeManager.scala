package k2b6s9j.Seasons

import k2b6s9j.Seasons.months._
import k2b6s9j.Seasons.traits.Month

object TimeManager {

  def ticksInYear(): Int = January.ticksInMonth + February.ticksInMonth + March.ticksInMonth + April.ticksInMonth + May.ticksInMonth + June.ticksInMonth + July.ticksInMonth + August.ticksInMonth + September.ticksInMonth + October.ticksInMonth + November.ticksInMonth + December.ticksInMonth

  def checkDivisibility(num:Int, divisor:Int) = num % divisor == 0

  def findMonth(totalTicks: Int): Month = {
    if(totalTicks > ticksInYear()) {

    }
    else {

    }
  }

}