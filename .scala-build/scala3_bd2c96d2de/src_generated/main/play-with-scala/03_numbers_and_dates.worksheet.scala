
package play$minuswith$minusscala



final class `03_numbers_and_dates$u002Eworksheet$_` {
def args = `03_numbers_and_dates$u002Eworksheet_sc`.args$
def scriptPath = """play-with-scala/03_numbers_and_dates.worksheet.sc"""
/*<script>*/
Char.MinValue.toInt
Char.MaxValue.toInt
Byte.MinValue
Byte.MaxValue
Short.MinValue
Short.MaxValue
Int.MinValue
Int.MaxValue
Long.MinValue
Long.MaxValue
Float.MinValue
Float.MaxValue
Double.MinValue
Double.MaxValue

//-------------------------------------------------------
//Underscores in Numeric Literals
//-------------------------------------------------------

val x1 = 1_000
val x2 = 100_000
val x3 = 1_000_000

// Long (can also use lowercase ‘L’, but I find that confusing)
val x4 = 1_000_000L

// Double
val x5 = 1_123.45
val x6 = 1_123.45d
val x7 = 1_123.45d
val x8 = 1_234e2

// Float
val x9 = 3_456.7f
val x10 = 3_456.7f
val x11 = 1_234e2f

// BigInt and BigDecimal
val x12: BigInt = 1_000_000
val x13: BigDecimal = 1_234.56

val x = 1_000 + 1
if x > 1_000 && x < 1_000_000 then println(x)


x match
  case 1_000 => println("got 1,000")
  case _     => println("got something else")


for 
  i <- 1 to 1_000
  if i > 999
do println(i)   

// Integer.parseInt("1_000") // NumberFormatException
// "1_000".toInt // NumberFormatException



//-------------------------------------------------------
//Parsing a Number from a String
//-------------------------------------------------------


"1".toByte
"1".toShort
"1".toInt
"1".toLong
"1".toFloat
"1".toDouble
// "one".toInt // java.lang.NumberFormatException


"1".toByteOption
"1".toShortOption
"1".toIntOption
"1".toLongOption
"1".toFloatOption
"1".toDoubleOption
"one".toIntOption


val b1 = BigInt("1")
val b2 = BigDecimal("1.234")


// val b3 = BigInt("yo") // NumberFormatException
// val b4 = BigDecimal("dude!") // NumberFormatException


Integer.parseInt("1", 2)
Integer.parseInt("10", 2)
Integer.parseInt("100", 2)
Integer.parseInt("1", 8)
Integer.parseInt("10", 8)
Integer.parseInt("12",16)


def makeIntV1(s: String) = s.toInt
makeIntV1("123")
// makeIntV1("abc")


def makeIntV2(s:String):Option[Int]=
    try Some(s.toInt)
    catch case e: NumberFormatException => None

makeIntV2("123")    
makeIntV2("abc")

import scala.util.Try
def makeIntV3(s:String):Option[Int]=Try(s.toInt).toOption
makeIntV3("123")
makeIntV3("abc")
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `03_numbers_and_dates$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `03_numbers_and_dates$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `03_numbers_and_dates$u002Eworksheet_sc`.script as `03_numbers_and_dates$u002Eworksheet`

