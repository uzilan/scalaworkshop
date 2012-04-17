object Loops extends App {


  // multiplication table
  for (i <- 1 to 10; j <- 1 to 10) {
    print(i * j)
    if (j % 10 == 0) print("\n") else print("\t")
  }


  // week
  val l = List("Mon", "Tue", "Wed", "Tors", "Fri", "Sat", "Sun")
  val week = for (day <- l) yield day + "day"
  println(week)


  // rr
  val s = "I have never thought I'm gonna need to give blood again. You saw me up there, right?"
  val split = s.split(" ")
  for (w <- 0 until split.length; if ((w + 1) % 3 == 0)) print (split(w) + " ")
  println



  // while loop
  var count = 0
  while (count < 3) {
    println("one more ")
    count += 1
  }
  /*
  one more
  one more
  one more
  */

  // simple for loop
  for (count <- 0 until 3) {
    println("one more again")
  }
  /*
  one more again
  one more again
  one more again
  */

  // iterate over two variables
  for (i <- 1 to 3; j <- 1 to 3) println("%d * %d = %d".format(i, j, i * j))
  /*
  1 * 1 = 1
  1 * 2 = 2
  1 * 3 = 3
  2 * 1 = 2
  2 * 2 = 4
  2 * 3 = 6
  3 * 1 = 3
  3 * 2 = 6
  3 * 3 = 9
   */

  // iterate with if
  for (i <- 1 to 50; if (i % 13 == 0)) println(i)
  /*
  13
  26
  39
  */

  // iterate over a String
  for (c <- "down") println(c)
  /*
  d
  o
  w
  n
  */

  // yield
  var numbers = for (i <- 0 to 4) yield i * 10
  println(numbers)
  /*
  Vector(0, 10, 20, 30, 40)
  */

}