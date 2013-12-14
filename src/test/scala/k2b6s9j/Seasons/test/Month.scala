package k2b6s9j.Seasons.test

import org.scalatest._
import k2b6s9j.Seasons.months._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Month extends FlatSpec with Matchers {

  "January" should "have 31 days." in {
    January.daysInMonth should be (31)
  }

  "February" should "have 28 days." in {
    February.daysInMonth should be (28)
  }

  "March" should "have 31 days." in {
    March.daysInMonth should be (31)
  }

  "April" should "have 30 days." in {
    April.daysInMonth should be (30)
  }

  "May" should "have 31 days." in {
    May.daysInMonth should be (31)
  }

  "June" should "have 30 days." in {
    June.daysInMonth should be (30)
  }

  "July" should "have 31 days." in {
    July.daysInMonth should be (31)
  }

  "August" should "have 31 days." in {
    August.daysInMonth should be (31)
  }

  "September" should "have 30 days." in {
    September.daysInMonth should be (30)
  }

  "October" should "have 31 days." in {
    October.daysInMonth should be (31)
  }

  "November" should "have 30 days." in {
    November.daysInMonth should be (30)
  }

  "December" should "have 31 days." in {
    December.daysInMonth should be (31)
  }

}