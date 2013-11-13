object Loops extends App {

  // Create a program that prints the multiplication table
  for (i <- 1 to 10; j <- 1 to 10) {
    print(i * j)
    if (j % 10 == 0) print("\n") else print("\t")
  }

/*

1	  2	  3	  4	  5	  6	  7	  8	  9	  10
2	  4	  6	  8	  10	12	14	16	18	20
3	  6	  9	  12	15	18	21	24	27	30
4	  8	  12	16	20	24	28	32	36	40
5	  10	15	20	25	30	35	40	45	50
6	  12	18	24	30	36	42	48	54	60
7	  14	21	28	35	42	49	56	63	70
8	  16	24	32	40	48	56	64	72	80
9	  18	27	36	45	54	63	72	81	90
10	20	30	40	50	60	70	80	90	100

*/


  // Create a for loop that takes a list with weekdays in short format (Sun, Mon, Tues, ...) and creates a list with complete weekday names (Sunday, Monday, Tuesday, ...) using **for** and **yield**
  val l = List("Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur")
  val week = for (day <- l) yield day + "day"
  println(week)

/*

List(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday)

*/


  // Using a for loop, print every third word in the string:
  // "I have never thought I'm gonna need to give blood again. You saw me up there, right?"
  val s = "I have never thought I'm gonna need to give blood again. You saw me up there, right?"
  val split = s.split(" ")
  for (w <- 0 until split.length; if ((w + 1) % 3 == 0)) print(split(w) + " ")
}

/*

never gonna give You up

(http://en.wikipedia.org/wiki/Rickrolling)

*/