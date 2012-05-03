object Loops extends App {


  // Skriv ett program som skriver ut multiplikationstabellen
  for (i <- 1 to 10; j <- 1 to 10) {
    print(i * j)
    if (j % 10 == 0) print("\n") else print("\t")
  }


  // Skriv en for loop som tar en lista med förkortningar av veckodagarna (Mon, Tis, Ons, ...) och skapar en lista med fullständiga namn mha for och yield
  val l = List("Mon", "Tis", "Ons", "Tors", "Fre", "Lör", "Sön")
  val week = for (day <- l) yield day + "dag"
  println(week)


  // Skriv ut, mha en for loop, vart tredje ord ur meningen: "I have never thought I'm gonna need to give blood again. You saw me up there, right?"
  val s = "I have never thought I'm gonna need to give blood again. You saw me up there, right?"
  val split = s.split(" ")
  for (w <- 0 until split.length; if ((w + 1) % 3 == 0)) print(split(w) + " ")
}