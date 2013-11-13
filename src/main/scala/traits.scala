
// Create a trait Touchscreen with attribute touchscreen: String with value "a touchscreen"
trait Touchscreen {
  val touchscreen = "a touchscreen"
}

// Create a trait Apple with attribute apple: String with value "an apple"
trait Apple {
  val apple = "an apple"
}

// Create an abstract class Thing with an attribute stuff: List[String]() and a method that writes the contents of the list (use the List.mkString method)
abstract class Thing {
  var stuff = List[String]()
  def has = getClass + " has " + stuff.mkString(" and ")
}

// Create a class Android that inherits from Thing and mixes Touchscreen, and adds touchscreen to stuff
class Android extends Thing with Touchscreen {
  stuff = List(touchscreen)
}

// Create a class IPhone that inherits from Thing and mixes Touchscreen and Apple, and adds touchscreen and apple to stuff
class IPhone extends Thing with Touchscreen with Apple {
  stuff = List(touchscreen, apple)
}

// Create an object things that inherits from App, which prints the contents in an Android and an IPhone instances
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


