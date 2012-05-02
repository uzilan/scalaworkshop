

class Fraction(val num: Int, val denom: Int) {
  if (denom == 0) throw new IllegalArgumentException

  override def toString = num + "/" + denom

  // not part of the exercise, but this is an example of how to create a method that allows adding two Fraction objects
  def +(that: Fraction): Fraction = {
    Fraction(this.num * that.denom + that.num * this.denom, this.denom * that.denom)
  }
}

object Fraction {
  def apply(num: Int, denom: Int): Fraction = new Fraction(num, denom)

  implicit def int2Fraction(i: Int): Fraction = Fraction(i, 1)
}

object Fractions extends App {

  val f1 = new Fraction(1, 2)
  println(f1)

  val f2 = Fraction(3, 4)
  println(f2)

  val f3: Fraction = 2
  println(f3)

  // not part of the exercise, but nice right?
  println(f1 + f3)
}