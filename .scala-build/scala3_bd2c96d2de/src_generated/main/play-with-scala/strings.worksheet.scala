
package play$minuswith$minusscala



final class strings$u002Eworksheet$_ {
def args = strings$u002Eworksheet_sc.args$
def scriptPath = """play-with-scala/strings.worksheet.sc"""
/*<script>*/
import scala.util.matching.Regex

val p = "Hello, world!"
val q: String = "Hello, world!"

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

s1.==(s3)
s1 == s2

s1.==(s3)
s1 == s3

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

val i: String = null
val j: String = null

// i.toUpperCase == j.toUpperCase

//------------------------------------------------------------
// Creating Multiline Strings
//------------------------------------------------------------

val foo = """this is a multiline
        String
        """

println(foo)

val speech1 = """Four score and
               |seven years ago""".stripMargin

println(speech1)

val speech2 = """Four score and
                #seven years ago""".stripMargin('#')

println(speech2)

val speech3 = """Four score and |seven years ago
               |our fathers...""".stripMargin.replaceAll("\n", " ")

println(speech3)

//------------------------------------------------------------
// Splitting Strings
//------------------------------------------------------------

"hello world".split(" ")
"hello world".split(" ").foreach(word => println(word))
"hello world".split(" ").foreach(println)

val s7 = "eggs, milk, butter, Cocoa Puffs"

s7.split(",").map(_.trim()).foreach(println)

s7 split "," map (_.trim()) foreach println

"Relax, nothing is under control".split("\\s+").foreach(println)

"hello world".split(" ").foreach(println)
"hello world".split(' ').foreach(println)

//------------------------------------------------------------
//  Substituting Variables into Strings
//------------------------------------------------------------

val name = "Nag"
val age = 40
val weight = 75

println(s"$name is $age years old and weighs $weight Kg.")
println(s"Age next year: ${age + 1}")
println(s"You are 33 years old: ${age == 33}")

case class Student(name: String, score: Double)
val stud = Student("foo", 12.00)

println(s"${stud.name} has a score of ${stud.score}")
println(s"$stud.name has a score of $stud.score")

println(f"$name is $age years old and weighs $weight%.2f Kg.")

s"foo\nbar"
raw"foo\nbar"

//------------------------------------------------------------
// Formatting String Output
//------------------------------------------------------------

val h = "Hello"
f"'$h%s'"
f"'$h%10s'"
f"'$h%-10s'"

f"'${h}%s'"
f"'${h}%10s'"
f"'${h}%-10s'"

//------------------------------------------------------------
// Processing a String One Character at a Time
//------------------------------------------------------------

val s8 = "hello"

val uppers81 = for c <- s8 yield c.toUpper
val uppers82 = s8.map(c => c.toUpper)
val uppers83 = s8.map(_.toUpper)
val uppers84WithoutCharA = s8.filter(_ != 'a').map(_.toUpper)

for c <- s8 do println(c)
"hello".foreach(println)

"hello".getBytes.foreach(println)

val result1 = for
  c <- "Hello World"
  if c != 'l'
yield c.toUpper
// or
val result2 = "Hello World"
  .filter(_ != 'l')
  .map(_.toUpper)

val xx = "HELLO".map(c => {
  val i: Int = c.toByte + 32
  i.toChar
})
// or
val yy = "HELLO" map { c =>
  val i: Int = c.toByte + 32
  i.toChar
}

val zz = "HELLO" filter { c1 =>
  c1 != 'L'
}

def checksum(s: String): Int =
  val MOD_ADLER = 65521
  var a = 1
  var b = 0
  // loop through each byte, updating `a` and `b`
  s.getBytes.foreach { byte =>
    a = (byte + a) % MOD_ADLER
    b = (b + a) % MOD_ADLER
  }
  b * 65535 + a

end checksum

checksum("hello")

//------------------------------------------------------------
// Finding Patterns in Strings
//------------------------------------------------------------

// val numPattern = Regex("[0-9]+")
val numPattern = "[0-9]+".r

val address = "123 Main Street Suite 101"

val match1 = numPattern.findFirstIn(address)
val matches = numPattern.findAllIn(address)
matches.foreach(println)

val matches2 = numPattern.findAllIn(address).toVector

val address2 = "No address given"
numPattern.findFirstIn(address2)

//------------------------------------------------------------
// Replacing Patterns in Strings
//------------------------------------------------------------

"123 Main Street".replaceAll("[0-9]", "x")

val regex = "[0-9]".r
val newAddress = regex.replaceAllIn("123 Main Street", "x")

val regex2 = "H".r
val result = regex2.replaceFirstIn("Hello world", "J")

val pattern = "([0-9]+) ([A-Za-z]+)".r
// val pattern(count, fruit) = "100 bananas"

// match "movies 80301"
val MoviesZipRE = "movies (\\d{5})".r // match "movies near boulder, co"
val MoviesNearCityStateRE = "movies near ([a-z]+), ([a-z]{2})".r

//   "movies 80301"
//   "movies 99676"
//   "movies near boulder, co"
//   "movies near talkeetna, ak"

val textUserTyped = "movies near boulder, co"

textUserTyped match
  case MoviesZipRE(zip) => println(s"searching by zip: $zip")
  case MoviesNearCityStateRE(city, state) =>
    println(s"searching by city and state: $city and $state")
  case _ => None

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object strings$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new strings$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export strings$u002Eworksheet_sc.script as strings$u002Eworksheet

