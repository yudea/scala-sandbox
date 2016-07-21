/**
  * Created by matsuzakiidea on 2016/07/20.
  */
object Car {

  class Car(val year: Int) {
    private var milesDriven: Int = 0

    def miles() = milesDriven

    def drive(distance: Int): Unit = {
      milesDriven += Math.abs(distance)
    }
  }

  def main(args: Array[String]) {
    val car = new Car(2009)
    println("car year" + car.year)
    println("driven" + car.miles())
    car.drive(1000)
    println("driven2" + car.miles())
  }
}
