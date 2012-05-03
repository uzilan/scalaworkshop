import java.io.File

object Recursion extends App {

  // Skriv ett program som rekursivt skriver ut namn på filerna under en given katalog
  def listFiles(f: String) {

    def listFilesRecursively(ff: File, level: Int) {
      println("|" * level + ff.getName)
      if (ff.isDirectory) {
        for (fff <- ff.listFiles()) listFilesRecursively(fff, level + 1)
      }
    }

    listFilesRecursively(new File(f), 0)
  }

  listFiles("/Users/uzilandsmann/projects/scala/diversify/trollcount/src")


  // Skriv ett program som vänder på en lista rekursivt
  def reverseRecursive[T](l: List[T]): List[T] = l match {
    case e :: tail => reverseRecursive(tail) :+ e
    case _ => Nil
  }

  println(reverseRecursive("tjolahej".toList).mkString)
}