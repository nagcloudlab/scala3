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
