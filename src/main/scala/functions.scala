import util.Random

// Skapa en case class User med för- och efternamn som argument
case class User(givenName: String, surname: String)

// Skapa ett object User med följande hjälpfunktioner:
object User {

  // doWithPerson tar en User och en funktion som tar User och returnerar en String och appliceras på Usern. Funktionen ska returnera en String
  def doWithUser(u: User, doWith: (User) => String): String = {
    doWith(u)
  }

  // fullName tar en User och returnerar hans fullständiga namn
  def fullName(u: User): String = u.givenName + " " + u.surname

  // userFullName tar en User och anropar doWithUser med Usern och funktionen fullName som argument
  def userFullUserName(u: User) = doWithUser(u, fullName)

  // scrambleName tar en User och returnerar hans namn med blandade bokstäver. (Titta på scala.util.Random för lämplig funktion)
  def scrambleName(u: User): String = Random.shuffle((u.givenName + u.surname).toList).mkString
}

// Skapa ett program som:
object Users extends App {

  // importerar metoderna i objektet User mha koden import User._
  import User._

  // skapar en User kalle
  val kalle = new User("Kalle", "Persson")

  // anropar och skriver ut resultatet av userFullName med kalle
  println(userFullUserName(kalle))

  // anropar och skriver ut resultatet av doWithPerson med kalle och scrambleName som argument
  println(doWithUser(kalle, scrambleName))
}