package k2b6s9j.Seasons.test

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FlatSpec}
import k2b6s9j.Seasons.Log
import java.util.logging.Logger

@RunWith(classOf[JUnitRunner])
class LogTest extends FlatSpec with Matchers {

  "The Mod Logger" should "return a logger." in {
    Log.getLogger() shouldBe a [Logger]
  }

}