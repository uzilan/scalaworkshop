// Skapa en class Person med några lämpliga attribut i konstruktorn och använd sedan javap för att inspektera vilka metoder den har

case class Person(name: String, age: Int)

/*

$ javap Person
Compiled from "caseclass.scala"
public class Person extends java.lang.Object implements scala.ScalaObject,scala.Product,scala.Serializable{
    public static final scala.Function1 tupled();
    public static final scala.Function1 curry();
    public static final scala.Function1 curried();
    public scala.collection.Iterator productIterator();
    public scala.collection.Iterator productElements();
    public java.lang.String name();                     // name getter
    public int age();                                   // age getter
    public Person copy(java.lang.String, int);          // copy
    public int copy$default$2();
    public java.lang.String copy$default$1();
    public int hashCode();                              // hashCode
    public java.lang.String toString();                 // toString
    public boolean equals(java.lang.Object);            // equals
    public java.lang.String productPrefix();
    public int productArity();
    public java.lang.Object productElement(int);
    public boolean canEqual(java.lang.Object);          // canEquals
    public Person(java.lang.String, int);               // constructor
}


// Hur många rader kod skulle det krävas för att skriva motsvarande klass i Java?
Gisningsvis > 200 rader
*/