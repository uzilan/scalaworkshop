/*



// Use the REPL to create different variables (both anonymous and named) and combine them with each other
scala> // anonymous variable

scala> 2
res0: Int = 2

scala> // named variable

scala> val three = 3
three: Int = 3



// When can one use autocomplete in the REPL?

// ...when pressing tab after a dot, using import, method names etc.:

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



// Create a "Hello World" message using two variables

scala> val hello = "hello"
hello: java.lang.String = hello

scala> val world = "world"
world: java.lang.String = world

scala> hello + " " + world
res1: java.lang.String = hello world



// Given that val foo = "bar", what would happen if you run foo * 10?

scala> val foo = "bar"
foo: String = bar

scala> foo * 10
res2: String = barbarbarbarbarbarbarbarbarbar



















*/