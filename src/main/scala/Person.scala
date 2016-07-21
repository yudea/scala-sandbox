/**
  * Created by matsuzakiidea on 2016/07/20.
  */
object Person {

  class Person(val firstname: String, val lastname: String){
    private var position: String =  _

    println("Creating " + this.toString())

    def this (firstname: String, lastname: String, positionHeld: String){
      this (firstname, lastname)
      position = positionHeld
    }

    override def toString(): String = {
      firstname + " " + lastname + " holds " + position + " position "
    }
  }

  def main(args: Array[String]) {
    val john = new Person("John", "Smith", "Analyst")
    println(john)
    val bill = new Person("Bill", "Walker")
    println(bill)
  }
}
