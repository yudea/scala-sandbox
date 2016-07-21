/**
  * Created by matsuzakiidea on 2016/07/21.
  */
object MarkerUpper {

  class Marker private(val color: String) {
    println("Creating " + this)
    override def toString(): String = "market color " + color
  }

  object Marker{
    private val markers = Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "green" -> new Marker("green")
    )

    def getMarker(color: String) =
      if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    println(Marker getMarker("blue"))
    println(Marker getMarker("blue"))
    println(Marker getMarker("red"))
    println(Marker getMarker("red"))

  }



}
