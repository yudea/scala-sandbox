/**
  * Created by matsuzakiidea on 2016/07/21.
  */
object Marker {

  class Marker(val color: String) {
    print("Creating " + this)

    override def toString(): String = "market color " + color
  }

  object MarkerFactory {
    private val markers = Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "green" -> new Marker("green")
    )

    def getMarker(color: String) =
      if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    println(MarkerFactory getMarker ("blue"))
    println(MarkerFactory getMarker ("blue"))
    println(MarkerFactory getMarker("red"))
    println(MarkerFactory getMarker("red"))
    println(MarkerFactory getMarker("yellow"))
  }
}
