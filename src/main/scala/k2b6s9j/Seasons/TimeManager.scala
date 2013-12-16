package k2b6s9j.Seasons

import k2b6s9j.Seasons.months._
import k2b6s9j.Seasons.traits.Month

object TimeManager {

  def ticksInYear(): Int = January.ticksInMonth + February.ticksInMonth + March.ticksInMonth + April.ticksInMonth + May.ticksInMonth + June.ticksInMonth + July.ticksInMonth + August.ticksInMonth + September.ticksInMonth + October.ticksInMonth + November.ticksInMonth + December.ticksInMonth

  def checkDivisibility(num:Int, divisor:Int) = num % divisor == 0

  def findMonth(totalTicks: Int): Month = {
    if(totalTicks > ticksInYear()) {
      null
    }
    else {
      val month:Int = totalTicks/ticksInYear()
      month match {
        case month <1 => January
        case month >1<2 => February
        case month >2<3 => March
        case month >3<4 => April
        case month >4<5 => May
        case month >5<6 => June
        case month >6<7 => July
        case month >7<8 => August
        case month >8<9 => September
        case month >9<10 => October
        case month >10<11 => November
        case month >11<12 => December
      }
    }
  }

}