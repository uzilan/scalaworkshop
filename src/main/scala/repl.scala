/*


// Använd REPL:en för att skapa olika variabler (både automatiska och namngivna) och kombinera dem med varandra

scala> // anonym variabel

scala> 2
res0: Int = 2

scala> // namngiven variabel

scala> val three = 3
three: Int = 3



// När kan man använda autocomplete i REPL:en?

// autocomplete när man klickar på tab efter en punkt, vid import, metodnamn, mm:

scala> "test".
+                     asInstanceOf          charAt                codePointAt           codePointBefore       codePointCount
compareTo             compareToIgnoreCase   concat                contains              contentEquals         endsWith
equalsIgnoreCase      getBytes              getChars              indexOf               intern                isEmpty
isInstanceOf          lastIndexOf           length                matches               offsetByCodePoints    regionMatches
replace               replaceAll            replaceFirst          split                 startsWith            subSequence
substring             toCharArray           toLowerCase           toString              toUpperCase           trim

scala> "test".length
res5: Int = 4

scala> import java.util.L
LinkedHashMap        LinkedHashSet        LinkedList           List                 ListIterator         ListResourceBundle
Locale               LocaleISOData

scala> import java.util.List
import java.util.List



// Skapa ett "Hello World" meddelande mha två variabler

scala> val hello = "hello"
hello: java.lang.String = hello

scala> val world = "world"
world: java.lang.String = world

scala> hello + " " + world
res1: java.lang.String = hello world



// Givet att val tjo = "tjohej", vad händer om man skriver tjo * 10?

scala> val tjo = "tjohej"
tjo: java.lang.String = tjohej

scala> tjo * 10
res2: String = tjohejtjohejtjohejtjohejtjohejtjohejtjohejtjohejtjohejtjohej



















*/