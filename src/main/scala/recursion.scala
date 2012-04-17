import java.io.File

object Recursion extends App {


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


  def reverseRecursive[T](l: List[T]): List[T] = l match {
    case e :: tail => reverseRecursive(tail) :+ e
    case _ => Nil
  }

  println(reverseRecursive("tjolahej".toList).mkString)







  def fact(n: Int): Int = {
    if (n == 0) 1 else n * fact(n - 1)
  }

  println(fact(10))


  val li = 1 to 10 toList

  def findLast(list: List[Int]): Int = list match {
    case element :: Nil => element
    case _ :: tail => findLast(tail)
    case _ => throw new IllegalArgumentException
  }

  println(findLast(li))


}