
package play$minuswith$minusscala



final class `02_strings$u002Eworksheet$_` {
def args = `02_strings$u002Eworksheet_sc`.args$
def scriptPath = """play-with-scala/02_strings.worksheet.sc"""
/*<script>*/
import scala.util.matching.Regex

val s1 = "Hello, world!"
val s2: String = "Hello, world!"

val s3 = "Big Belly Burger"
s3.length()
s3.length

s3.count(c => c == 'B')
s3.count(_ == 'B')

s3.dropRight(3)
s3.dropWhile(_ != ' ')
s3.filter(_ != ' ')
s3.take(3)
s3.takeRight(3)
s3.takeWhile(_ != 'r')

val s8 = "scala".drop(2).take(2).capitalize
val s9 = "scala" drop 2 take 3
s9.capitalize

//------------------------------------------------------------
// Testing String Equality
//------------------------------------------------------------

val s10 = "Hello"
val s11 = "Hello"
val s12 = "H" + "ello"

s10.==(s11)
s10 == s11

s10.==(s12)
s10 == s12

val s13: String = null
s12 == s13
s13 == s12

val s14 = "Hello"
val s16 = "hello"
s14.toUpperCase == s16.toUpperCase

val s17 = "Kimberly"
val s18 = "kimberly"

s17.equalsIgnoreCase(s18)
s17 equalsIgnoreCase s18

//------------------------------------------------------------
// Creating Multiline Strings
//------------------------------------------------------------

val s19 = """this is a multiline
        String
        """

println(s19)

val s20 = """Four score and
               |seven years ago""".stripMargin

println(s20)

val s21 = """Four score and
                #seven years ago""".stripMargin('#')

println(s21)

val s22 = """Four score and |seven years ago
               |our fathers...""".stripMargin.replaceAll("\n", " ")

println(s22)

//------------------------------------------------------------
// Splitting Strings
//------------------------------------------------------------

"hello world".split(" ")
"hello world".split(" ").foreach(word => println(word))
"hello world".split(" ").foreach(println)

val s23 = "eggs, milk, butter, Cocoa Puffs"

s23.split(",").map(_.trim()).foreach(println)

s23 split "," map (_.trim()) foreach println

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

val s24 = "hello"

val uppers1 = for c <- s24 yield c.toUpper
val uppers2 = s24.map(c => c.toUpper)
val uppers3 = s24.map(_.toUpper)
val uppers4 = s24.filter(_ != 'a').map(_.toUpper)

for c <- "hello" do println(c)
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

def doSomething(s: String): Int =
  val MOD_ADLER = 65521
  var a = 1
  var b = 0
  // loop through each byte, updating `a` and `b`
  s.getBytes.foreach { byte =>
    a = (byte + a) % MOD_ADLER
    b = (b + a) % MOD_ADLER
  }
  b * 65535 + a

end doSomething

doSomething("hello")

//------------------------------------------------------------
// Finding Patterns in Strings
//------------------------------------------------------------

// val numPattern = Regex("[0-9]+")
val numPattern = "[0-9]+".r
val address1 = "123 Main Street Suite 101"

val match1 = numPattern.findFirstIn(address1)
val matches1 = numPattern.findAllIn(address1)
matches1.foreach(println)

val matches2 = numPattern.findAllIn(address1).toVector

val address2 = "No address given"
numPattern.findFirstIn(address2)

//------------------------------------------------------------
// Replacing Patterns in Strings
//------------------------------------------------------------

"123 Main Street".replaceAll("[0-9]", "x")

val regex1 = "[0-9]".r
val newAddress = regex1.replaceAllIn("123 Main Street", "x")

val regex2 = "H".r
val result = regex2.replaceFirstIn("Hello world", "J")

// val regex3 = "([0-9]+) ([A-Za-z]+)".r
// @unchecked val regex3(count, fruit) = "100 bananas"

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

//------------------------------------------------------------
//  Accessing a Character in a String
//------------------------------------------------------------

"hello".charAt(0)
"hello" (0)
"hello".apply(0)

//------------------------------------------------------------

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `02_strings$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `02_strings$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `02_strings$u002Eworksheet_sc`.script as `02_strings$u002Eworksheet`

