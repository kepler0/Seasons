package k2b6s9j.Seasons.test

import k2b6s9j.Seasons.TimeManager
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FlatSpec}

@RunWith(classOf[JUnitRunner])
class TimeManagerTest extends FlatSpec with Matchers {

  "A year" should "last 8,016,000 ticks." in {
    TimeManager.ticksInYear() should be (8016000)
  }

}