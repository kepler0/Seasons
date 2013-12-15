package k2b6s9j.Seasons.test

import k2b6s9j.Seasons.TimeManager

class TimeManagerTest {

  "A year" should "last 8,016,000 ticks." in {
    TimeManager.ticksInYear() should be (8016000)
  }

}