import math._

// Skapa en trait Shape med metoder area: Double och perimeter: Double
trait Shape {
  def area: Double
  def perimeter: Double
}

// Skapa case class Square och case class Circle som implementerar Shape och räknar ut sina area respektive omkrets
case class Square(side: Double) extends Shape {
  override def area: Double = pow(side, 2)
  override def perimeter: Double = side * 4
}

case class Circle(r: Double) extends Shape {
  override def area: Double  = Pi * pow(r, 2)
  override def perimeter: Double = 2 * Pi * r
}
