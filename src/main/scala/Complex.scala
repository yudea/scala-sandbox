/**
  * Created by matsuzakiidea on 2016/07/19.
  */

object Complex {

  class Complex(val real: Int, val img: Int) {
    def +(operand: Complex): Complex = {
      new Complex(real + operand.real, img + operand.img)
    }

    override def toString(): String = {
      real + (if (img < 0) "" else "+") + img + "i"
    }
  }

  def main(args: Array[String]) {
    val c1 = new Complex(1, 2)
    val c2 = new Complex(2, -1)
    println(c1 + c2)
    println(c1.+(c2))
  }
}
