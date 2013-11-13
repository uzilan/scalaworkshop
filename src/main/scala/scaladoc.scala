// When creating a List in Scala, the default implementation is an immutable list. In which package is it defined? Where can one find a mutable list?
// - immutable List - scala.collection.immutable.List
// - mutable List - e.g. scala.collection.mutable.LinkedList


// In Scaladoc there are definitions for classes Tuple1 and Tuple2. Are there more Tuples? How many?
// - Look at the Tuple1 code. The URL is https://github.com/scala/scala/blob/v2.10.3/src/library/scala/Tuple1.scala#L1. Remove the Tuple1.scala#L1 
//   from the address and you can see all 22 Tuple classes. 


// Why can't we find the String class definition in Scaladoc? Where can we find the methods in String?
// - Class String is part of the Java API. In Scala, this class is augmented by classes StringOps and WrappedString for example
