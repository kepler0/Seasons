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

  it should "have a temperature of zero." in {
    January.temperature should be (0.0F)
  }

  "February" should "have 28 days." in {
    February.daysInMonth should be (28)
  }

  it should "have a temperature of 0.15." in {
    February.temperature should be (0.15F)
  }

  "March" should "have 31 days." in {
    March.daysInMonth should be (31)
  }

  it should "have a temperature of 0.75." in {
    March.temperature should be (0.75F)
  }

  "April" should "have 30 days." in {
    April.daysInMonth should be (30)
  }

  it should "have a temperature of one." in {
    April.temperature should be (1.0F)
  }

  "May" should "have 31 days." in {
    May.daysInMonth should be (31)
  }

  it should "have a temperature of 1.25." in {
    May.temperature should be (1.25F)
  }

  "June" should "have 30 days." in {
    June.daysInMonth should be (30)
  }

  it should "have a temperature of 1.75." in {
    June.temperature should be (1.75F)
  }

  "July" should "have 31 days." in {
    July.daysInMonth should be (31)
  }

  it should "have a temperature of 2.0." in {
    July.temperature should be (2.0F)
  }

  "August" should "have 31 days." in {
    August.daysInMonth should be (31)
  }

  it should "have a temperature of 1.75." in {
    August.temperature should be (1.75F)
  }

  "September" should "have 30 days." in {
    September.daysInMonth should be (30)
  }

  it should "have a temperature of 1.25." in {
    September.temperature should be (1.25F)
  }

  "October" should "have 31 days." in {
    October.daysInMonth should be (31)
  }

  it should "have a temperature of one." in {
    October.temperature should be (1.0F)
  }

  "November" should "have 30 days." in {
    November.daysInMonth should be (30)
  }

  it should "have a temperature of 0.75." in {
    November.temperature should be (0.75F)
  }

  "December" should "have 31 days." in {
    December.daysInMonth should be (31)
  }

  it should "have a temperature of 0.15." in {
    December.temperature should be (0.15F)
  }

}