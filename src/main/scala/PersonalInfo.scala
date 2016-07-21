/**
  * Created by matsuzakiidea on 2016/07/19.
  */
object PersonalInfo extends App{
  def getPersonalIfo(primaryKey: Int) = {
    ("Venkat", "Subramaniam", "venkats@yahoo.co.jp")
  }

  val (firstname, lastname, emailAdress) = getPersonalIfo(1)

  println("Firstname is" + firstname)
  println("email address" + emailAdress)

}
