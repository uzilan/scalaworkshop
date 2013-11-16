import math._

// Create a trait Shape with method area: Double and perimeter: Double
trait Shape {
  def area: Double
  def perimeter: Double
}

// Create a case class Square and a case class Circle which implements Shape and it's methods
case class Square(side: Double) extends Shape {
  override def area: Double = pow(side, 2)
  override def perimeter: Double = side * 4
}

case class Circle(r: Double) extends Shape {
  override def area: Double  = Pi * pow(r, 2)
  override def perimeter: Double = 2 * Pi * r
}
