package k2b6s9j.Seasons.traits

trait Month {

  val ticksInDay: Int = 24000

  def daysInMonth: Int = {
    0
  }

  def ticksInMonth: Int = {
    daysInMonth * ticksInDay
  }

}
