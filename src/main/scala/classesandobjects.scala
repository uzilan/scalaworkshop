
// Skapa en class Fraction med attribut num och denom i konstruktorn.
class Fraction(val num: Int, val denom: Int) {
  if (denom == 0) throw new IllegalArgumentException

  // Överlagra metoden toString i klassen
  override def toString = num + "/" + denom

  // Ingår inte i övningen, men visar exempel på hur man kan skapa en metod som adderar två Fractions
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

  // ingår inte i övningen, men fint eller hur?
  println(f1 + f3)
}