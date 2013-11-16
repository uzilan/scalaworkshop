import java.io.File

object Recursion extends App {

  // Create a program which prints the names of the files in a given folder, recursively
  def listFiles(f: String) {

    def listFilesRecursively(ff: File, level: Int) {
      println("|" * level + ff.getName)
      if (ff.isDirectory) {
        for (fff <- ff.listFiles()) listFilesRecursively(fff, level + 1)
      }
    }

    listFilesRecursively(new File(f), 0)
  }

  listFiles("/Users/uzilan/projects/scala/scalaworkshop/src")

/*

src
|main
||java
||scala
|||caseclass.scala
|||classesandobjects.scala
|||functions.scala
|||loops.scala
|||recursion.scala
|||repl.scala
|||scaladoc.scala
|||shapes.scala
|||traits.scala
|test
||java
||scala
|||shapesSpec.scala

*/


  // Create a program that reverses a list recursively
  def reverseRecursive[T](l: List[T]): List[T] = l match {
    case e :: tail => reverseRecursive(tail) :+ e
    case _ => Nil
  }

  println(reverseRecursive("tjolahej".toList).mkString)
}

/*

jehalojt

*/