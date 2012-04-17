import util.Random

case class User(givenName: String, surname: String)

object User {

  def doWithUser(u: User, doWith: (User) => String): String = {
    doWith(u)
  }

  def fullName(u: User): String = u.givenName + " " + u.surname

  def scrambleName(u: User): String = Random.shuffle((u.givenName + u.surname).toList).mkString

  def userFullUserName(u: User) = doWithUser(u, fullName)
}

object Users extends App {

  val kalle = new User("Kalle", "Persson")

  import User._

  println(userFullUserName(kalle))
  println(doWithUser(kalle, scrambleName))

}