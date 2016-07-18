import java.time.{LocalDateTime, Period}
import java.time.temporal.TemporalAmount

/**
  * Created by matsuzakiidea on 2016/07/18.
  */
class DatetimeClass {
  implicit class RichLocalDateTime(base: LocalDateTime) {
    def +(amount: TemporalAmount) = {
      base.plus(amount)
    }
  }

  implicit class RichInt(base: Int) {
    def days: TemporalAmount = {
      Period.ofDays(base)
    }
    def years: TemporalAmount = {
      Period.ofYears(base)
    }
  }

  def run(): Unit = {
    val now = LocalDateTime.now()
    println("now",now)
    now.plusDays(2)
    println("after", now)
    val tomorrow = now + 2.days + 1.days + 4.days
    println("tomorrow: " + tomorrow)
    val nextYear = now + 1.years
    println("next year:" + nextYear)
    val threeYearsLater = now + 3.years
    println("three years later:" + threeYearsLater)
  }
}

object DateTimeMain {

  def main(args: Array[String]) {
    val sample = new DatetimeClass()
    sample.run()
  }
}