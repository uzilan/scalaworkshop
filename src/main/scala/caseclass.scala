// Create a case class Person using adequate attributes in the constructor

case class Person(name: String, age: Int)


// Use the javap command to inspect which methods it contains

/*

$ javap Person
Compiled from "caseclass.scala"
public class Person implements scala.Product,scala.Serializable {
  public class Person implements scala.Product,scala.Serializable {
  public static scala.Function1<scala.Tuple2<java.lang.String, java.lang.Object>, Person> tupled();
  public static scala.Function1<java.lang.String, scala.Function1<java.lang.Object, Person>> curried();
  public java.lang.String name();				// name getter
  public int age();								// age getter
  public Person copy(java.lang.String, int);	// copy
  public java.lang.String copy$default$1();
  public int copy$default$2();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);	// canEqual 
  public int hashCode();						// hashCode
  public java.lang.String toString();			// toString
  public boolean equals(java.lang.Object);		// equals
  public Person(java.lang.String, int);			// constructor
}




// How much code would you expect a similar Java implementation would require? :)

constructor: 	4 rows
attributes:		2 rows
name getter: 	3 rows
age getter: 	3 rows
copy:			5 rows
can equals:		3 rows
hashCode:		5 rows
toString:		3 rows
equals:			5 rows
...

about a 100 rows?





*/