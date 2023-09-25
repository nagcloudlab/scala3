// val s1 = "Hello, world!"
// val s2: String = "Hello, world!"

val s = "Big Belly Burger"

s.length()
s.length
s.count(c => c == 'B')
s.count(_ == 'B')
s.dropRight(3)
s.dropWhile(_ != ' ')
s.filter(_ != ' ')
s.take(3)
s.takeRight(3)
s.takeWhile(_ != 'r')

// Method chaining / Fluent-style
val x = "scala".drop(2).take(2).capitalize
val y = "scala" drop 2 take 3
y.capitalize

//------------------------------------------------------------
// Testing String Equality
//------------------------------------------------------------

val s1 = "Hello"
val s2 = "Hello"
val s3 = "H" + "ello"

s1 == s2
s1.==(s3)
s1 == s3
s1.==(s3)

val s4: String = null
s3 == s4
s4 == s3

val s5 = "Hello"
val s6 = "hello"
s5.toUpperCase == s6.toUpperCase

val a = "Kimberly"
val b = "kimberly"

a.equalsIgnoreCase(b)
a equalsIgnoreCase b
