trait Touchscreen {
  val touchscreen = "a touchscreen"
}

trait Apple {
  val apple = "an apple"
}

abstract class Thing {
  var stuff = List[String]()
  def has = getClass + " has " + stuff.mkString(" and ")
}

class Android extends Thing with Touchscreen {
  stuff = List(touchscreen)
}

class IPhone extends Thing with Touchscreen with Apple {
  stuff = List(touchscreen, apple)
}

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





