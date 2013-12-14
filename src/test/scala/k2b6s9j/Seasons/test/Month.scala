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

  it should "have a temperature of zero" in {
    January.temperature should be (0.0F)
  }

  "February" should "have 28 days." in {
    February.daysInMonth should be (28)
  }

  it should "have a temperature of 0.15" in {
    February.temperature should be (0.15F)
  }

  "March" should "have 31 days." in {
    March.daysInMonth should be (31)
  }

  it should "have a temperature" in {
    March.temperature
  }

  "April" should "have 30 days." in {
    April.daysInMonth should be (30)
  }

  it should "have a temperature" in {
    April.temperature
  }

  "May" should "have 31 days." in {
    May.daysInMonth should be (31)
  }

  it should "have a temperature" in {
    May.temperature
  }

  "June" should "have 30 days." in {
    June.daysInMonth should be (30)
  }

  it should "have a temperature" in {
    June.temperature
  }

  "July" should "have 31 days." in {
    July.daysInMonth should be (31)
  }

  it should "have a temperature" in {
    July.temperature
  }

  "August" should "have 31 days." in {
    August.daysInMonth should be (31)
  }

  it should "have a temperature" in {
    August.temperature
  }

  "September" should "have 30 days." in {
    September.daysInMonth should be (30)
  }

  it should "have a temperature" in {
    September.temperature
  }

  "October" should "have 31 days." in {
    October.daysInMonth should be (31)
  }

  it should "have a temperature" in {
    October.temperature
  }

  "November" should "have 30 days." in {
    November.daysInMonth should be (30)
  }

  it should "have a temperature" in {
    November.temperature
  }

  "December" should "have 31 days." in {
    December.daysInMonth should be (31)
  }

  it should "have a temperature of 0.15" in {
    December.temperature should be (0.15F)
  }

}