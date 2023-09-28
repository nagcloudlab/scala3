
package `07$minusFP`



final class `2_Functional_Error_Handling$u002Eworksheet$_` {
def args = `2_Functional_Error_Handling$u002Eworksheet_sc`.args$
def scriptPath = """07-FP/2_Functional_Error_Handling.worksheet.sc"""
/*<script>*/
// Scala’s error handling types:

// Option/Some/None
// Try/Success/Failure
// Either/Left/Right

// Option/Some/None

// def makeInt(s: String): Option[Int] =
//   try Some(Integer.parseInt(s))
//   catch case e: NumberFormatException => None

// makeInt("1")
// makeInt("a")

// makeInt("123") match
//   case Some(i) => println(s"i = $i")
//   case None    => println("Could not create an Int")

// val listOfStrings = List("a", "1", "b", "2")
// val optionalListOfInts: Seq[Option[Int]] =
//   for s <- listOfStrings yield makeInt(s)
// optionalListOfInts.collect { case Some(value) => value }

import scala.util.control.Exception.*
import scala.util.{Try, Success, Failure}
def makeInt1(s: String): Option[Int] = allCatch.opt(Integer.parseInt(s))
def makeInt2(s: String): Try[Int] = Try(Integer.parseInt(s))
def makeInt3(s: String): Either[Throwable, Int] =
  allCatch.either(Integer.parseInt(s))

makeInt1("123")
makeInt1("abc")

makeInt2("123")
makeInt2("abc")

makeInt3("123")
makeInt3("abc")

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `2_Functional_Error_Handling$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `2_Functional_Error_Handling$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `2_Functional_Error_Handling$u002Eworksheet_sc`.script as `2_Functional_Error_Handling$u002Eworksheet`

