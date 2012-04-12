/*
scala // automatic vals

scala> 2 + 2
res0: Int = 4

scala> res0 * 5
res1: Int = 20



scala> // val och var

scala> var a = "b"
a: java.lang.String = b

scala> a = "a"
a: java.lang.String = a

scala> val katt = "hund"
katt: java.lang.String = hund

scala> katt = "katt"
<console>:8: error: reassignment to val
       katt = "katt"
            ^



scala> // functions

scala> def times3(value: Int): Int = {
     |    value * 3
     | }
times3: (value: Int)Int

scala> times3(8)
res2: Int = 24

scala> def times2(value: Int): Int = value * 2
times2: (value: Int)Int

scala> times2(9)
res3: Int = 18




scala> // autocomplete

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

























*/