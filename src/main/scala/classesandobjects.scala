
// Create a class Fraction with attributes num and denom in the constructor
class Fraction(val num: Int, val denom: Int) {
  if (denom == 0) throw new IllegalArgumentException

  // Override method toString inside the class
  override def toString = num + "/" + denom

  // Not a part of this exercise, but demonstrates how to create a method to add two Fraction objects
  def +(that: Fraction): Fraction = {
    Fraction(this.num * that.denom + that.num * this.denom, this.denom * that.denom)
  }
}

// Create an object Fraction in the same file
object Fraction {
  
  // Create an Apply factory method inside the object, which creates instances of the Fraction class
  def apply(num: Int, denom: Int): Fraction = new Fraction(num, denom)

  // Create an implicit converter which converts Int to Fraction instances inside the object
  implicit def int2Fraction(i: Int): Fraction = Fraction(i, 1)
}

// Create an object Fractions which inherits from App, which tests creating Fractions with and without new, as well as converting Ints into Fractions
object Fractions extends App {

  val f1 = new Fraction(1, 2)
  println(f1)

  val f2 = Fraction(3, 4)
  println(f2)

  val f3: Fraction = 2
  println(f3)

  // Not a part of this exercise, but quite elegant, isn't it?
  println(f1 + f3)
}