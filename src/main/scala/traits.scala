
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




trait Logger {
  import java.util.logging._
  private val log = Logger.getLogger(getClass.toString)
  def info(msg: String) {log.log(Level.INFO, msg)}
  def error(msg: String) {log.log(Level.SEVERE, msg)}
}

trait Printer {
  def printToOut(msg: String) = Console.out.println(msg)
  def printToErr(msg: String) = Console.err.println(msg)
}

class HtmlReader extends Logger
abstract class Parser
class HtmlParser extends Parser with Printer
class XmlParser extends Parser with Printer with Logger {
  val delegate = new Parser with Logger
}

