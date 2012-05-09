
// Skapa en class Fraction med attribut num och denom i konstruktorn.
class Fraction(val num: Int, val denom: Int) {
  if (denom == 0) throw new IllegalArgumentException

  // Överlagra metoden toString i klassen
  override def toString = num + "/" + denom

  // not part of the exercise, but this is an example of how to create a method that allows adding two Fraction objects
  def +(that: Fraction): Fraction = {
    Fraction(this.num * that.denom + that.num * this.denom, this.denom * that.denom)
  }
}

// Skapa ett object Fraction i samma fil
object Fraction {
  
  // Skapa en apply factorymetod i objektet som skapar en instans av Factoryklassen
  def apply(num: Int, denom: Int): Fraction = new Fraction(num, denom)

  // Skapa en implicit converter som omvandlar Int till Fraction i objektet
  implicit def int2Fraction(i: Int): Fraction = Fraction(i, 1)
}

// Skapa ett objekt Fractions som ärver från App och som testar skapa Fractions med och utan new samt omvandlar Intar till Fractions.
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