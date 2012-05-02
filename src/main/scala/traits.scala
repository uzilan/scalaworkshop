
// Skapa en trait Touchscreen med ett attribute touchscreen: String med ett lämpligt värde
trait Touchscreen {
  val touchscreen = "a touchscreen"
}

// Skapa en trait Apple med ett attribute apple: String med ett lämpligt värde
trait Apple {
  val apple = "an apple"
}

// Skapa en abstract class Thing med ett attribute stuff: List[String] och en metod som skriver ut innehållet i listan (använd List.mkString)
abstract class Thing {
  var stuff = List[String]()
  def has = getClass + " has " + stuff.mkString(" and ")
}

// Skapa en class Android som ärver från Thing och mixar Touchscreen och som lägger till touchscreen i stuff
class Android extends Thing with Touchscreen {
  stuff = List(touchscreen)
}

// Skapa en class IPhone som ärver från Thing och mixar Touchscreen och Apple och som lägger till touchscreen och apple i stuff
class IPhone extends Thing with Touchscreen with Apple {
  stuff = List(touchscreen, apple)
}

// Skapa ett object Things som ärver från App, och som skriver ut innehållet i en Android och en IPhone
object Things extends App {
  val android = new Android
  val iPhone = new IPhone

  println(android.has)
  println(iPhone.has)
}

/*

class Android has a touchscreen
class IPhone has a touchscreen and an apple

*/


