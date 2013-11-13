import util.Random

// Create a case class User with given name and a sirname as arguments
case class User(givenName: String, surname: String)

// Create an object User with the following help functions:
object User {

  // doWithUser takes a User and a function that takes a User as argument and returns a String. The function should return a String
  def doWithUser(u: User, doWith: (User) => String): String = {
    doWith(u)
  }

  // fullName takes a User and returns it's full name
  def fullName(u: User): String = u.givenName + " " + u.surname

  // userFullName takes a User as argument and calls doWithUser with the User and the fullName function and returns the result
  def userFullUserName(u: User) = doWithUser(u, fullName)

  // scrambleName takes a User as argument and returns it's name with mixed letters. (Take a look at scala.util.Random)
  def scrambleName(u: User): String = Random.shuffle((u.givenName + u.surname).toList).mkString
}

// Create a program that:
object Users extends App {

  // Imports the methods in object User using import User._
  import User._

  // Creates a User Bertil
  val bertil = new User("Bertil", "Bertilsson")

  // Calls and prints the result of calling userFullName with Bertil as argument
  println(userFullUserName(bertil))

  // Calls and prints the result of calling doWithPerson with Bertil and scrambleName as arguments
  println(doWithUser(bertil, scrambleName))
}

/*

Bertil Bertilsson
sentsrterliilBoB

*/