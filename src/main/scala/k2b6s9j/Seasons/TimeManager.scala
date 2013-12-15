package k2b6s9j.Seasons

import k2b6s9j.Seasons.months._

object TimeManager {

  def ticksInYear(): Int = January.ticksInMonth + February.ticksInMonth + March.ticksInMonth + April.ticksInMonth + May.ticksInMonth + June.ticksInMonth + July.ticksInMonth + August.ticksInMonth + September.ticksInMonth + October.ticksInMonth + November.ticksInMonth + December.ticksInMonth

  def divisibleBy1(num:Int) = num % 1 == 0
  def divisibleBy2(num:Int) = num % 2 == 0
  def divisibleBy3(num:Int) = num % 3 == 0
  def divisibleBy4(num:Int) = num % 4 == 0
  def divisibleBy5(num:Int) = num % 5 == 0
  def divisibleBy6(num:Int) = num % 6 == 0
  def divisibleBy7(num:Int) = num % 7 == 0
  def divisibleBy8(num:Int) = num % 8 == 0
  def divisibleBy9(num:Int) = num % 9 == 0
  def divisibleBy10(num:Int) = num % 10 == 0
  def divisibleBy11(num:Int) = num % 11 == 0
  def divisibleBy12(num:Int) = num % 12 == 0

}