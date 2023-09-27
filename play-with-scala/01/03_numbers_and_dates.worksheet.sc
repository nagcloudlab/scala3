import java.util.Date
import java.util.Locale


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


def makeIntV2(s: String): Option[Int] =
  try Some(s.toInt)
  catch case e: NumberFormatException => None

makeIntV2("123")  
makeIntV2("abc")


import scala.util.{Try, Success,Failure}

def makeIntV3(s: String):Try[Int]=Try(s.toInt) 

makeIntV3("123")
makeIntV3("abc")



//-------------------------------------------------------
// Converting Between Numeric Types (Casting)
//-------------------------------------------------------


val n1=6
val n2=4
val r=n1/n2.toFloat


val b: Byte = 1
b.toShort
b.toInt
b.toLong
b.toFloat
b.toDouble

val d1 = 100.0
d1.toFloat
d1.toLong
d1.toInt
d1.toShort
d1.toByte


val n=456
n.isValidByte
val byteVal=n.toByte



val d2: Double = 65_535.0
d2.isValidByte
d2.isValidChar
d2.isValidShort
d2.isValidInt


val d3 = 1.5
d3.isValidInt
d3.isValidShort
d3.isValidByte


val b3: Byte = 1
b3.asInstanceOf[Short]
b3.asInstanceOf[Int]
b3.asInstanceOf[Long]
b3.asInstanceOf[Float]
b3.asInstanceOf[Double]


val i: Int = 101
val l: Long = 102
val s = "103"
val b11 = BigInt(i)
val b22 = BigInt(l)
val b33 = BigInt(s)



BigDecimal(100)
BigDecimal(100L)
BigDecimal(100.0)
BigDecimal(100f)
BigDecimal("100")
BigDecimal(BigInt(100))


BigDecimal(100).toBigIntExact
BigDecimal(100.5).toBigIntExact
BigDecimal(100).toIntExact
// BigDecimal(100.5).toIntExact
// BigDecimal(100.5).toLongExact
// BigDecimal(100.5).toByteExact
// BigDecimal(100.5).toShortExact



//-------------------------------------------------------
// Overriding the Default Numeric Type
//-------------------------------------------------------


val a1 = 1
val a2: Byte = 1
val a3: Short = 1
val a4: Int = 1
val a5: Long = 1
val a6: Float = 1
val a7: Double = 1

// or

val a8 = 0: Byte
val a9 = 0: Int
val a10 = 0: Short
val a11 = 0: Double
val a12 = 0: Float


val a13 = 1L
val a14 = 1L
val a16 = 1d
val a17 = 1d
val a18 = 1f

val a19 = 0x20
val a20 = 0x20L

// var/val name=[initial value]

// var/val [name]: [Type] = [initial value]
// or
// var/val [name] = [initial value]: [Type]


class Foo:
  var a:Short=0
  var b:Short=_
  var s:String=_

val fooObj=Foo()
fooObj.a
fooObj.b
fooObj.s


val ss="ibm"
val o=ss: Object


//-------------------------------------------------------
// Replacements for ++ and −−
// -------------------------------------------------------


var c1=1
c1 += 1 // c1=c1+1
c1


var c2 = 1
c2 *= 4
c2
c2 /= 2
c2


val c3 = 1
// c3 += 1


var c4 = 1.2
c4 += 1
c4 *= 2
c4

// var p=0;
// p++



//-------------------------------------------------------
//  Comparing Floating-Point Numbers
//-------------------------------------------------------

0.1 + 0.1
0.1 + 0.2


val e1 = 0.3
val e2 = 0.1 + 0.2
e1 == e2

// def ~=(x:Double,y:Double,tolerance:Double):Boolean =
//   if (x - y).abs < tolerance then true else false

// ~=(0.3, 0.1 + 0.2, 0.0001)
// ~=(0.1 + 0.2, 0.3, 0.0001)

// extension (x:Double) def ~=(y:Double):Boolean= (x - y).abs < 0.5

// extension (x: Double)
//   def ~=(y: Double): Boolean =
//     if (x - y).abs < 0.5 then true else false

extension (x: Double)
  def ~=(y: Double): Boolean =
    // allow a +/- 10% variance
    val xHigh = if x > 0 then x * 1.1 else x * 0.9
    val xLow = if x > 0 then x * 0.9 else x * 1.1
    if y >= xLow && y <= xHigh then true else false

e1.~=(e2)
e1 ~= e2


// BigDecimal Is Often Used for Currency

0.10 + 0.20
BigDecimal(0.10) + BigDecimal(0.20)
BigDecimal("0.1") + BigDecimal("0.2")
BigDecimal("0.2") * BigDecimal("0.7")


//-------------------------------------------------------
// Formatting Numbers and Currency
//-------------------------------------------------------


import java.text.NumberFormat

// val formatter = NumberFormat.getIntegerInstance
// formatter.format(10_000)
// formatter.format(1_000_000) // String = 1,000,000

// val formatter = NumberFormat.getIntegerInstance(Locale.GERMANY)
// formatter.format(1_000)
// formatter.format(10_000)
// formatter.format(1_000_000)

// val formatter = NumberFormat.getCurrencyInstance
// formatter.format(123.456789)
// formatter.format(12_345.6789)
// formatter.format(1_234_567.89)


//-------------------------------------------------------
// Creating New Date and Time Instances
//-------------------------------------------------------

import java.time._


LocalDate.now
LocalTime.now
LocalDateTime.now
Instant.now
ZonedDateTime.now


val squirrelDay1 = LocalDate.of(2020, 1, 21)
val squirrelDay2 = LocalDate.of(2020, Month.JANUARY, 21)
val squirrelDay3 = LocalDate.of(2020, 1, 1).plusDays(20)



// LocalTime.of(hour: Int, minute: Int)
// LocalTime.of(hour: Int, minute: Int, second: Int)

LocalTime.of(0, 1)
LocalTime.of(1, 1)
LocalTime.of(23, 59)


val zdt =
  ZonedDateTime.of(LocalDate.now, LocalTime.now, ZoneId.of("America/New_York"))


ZoneId.of("Europe/Paris")
ZoneId.of("Asia/Tokyo")
ZoneId.of("America/New_York")
ZoneId.of("UTC+1")


//-------------------------------------------------------
//  Calculating the Difference Between Two Dates
//-------------------------------------------------------

import java.time.LocalDate
import java.time.temporal.ChronoUnit.DAYS
val now = LocalDate.of(2019, 1, 20)
val xmas = LocalDate.of(2019, 12, 25)

DAYS.between(now, xmas)

import java.time.LocalDate
import java.time.temporal.ChronoUnit.*
val now1 = LocalDate.of(2019, 1, 20) // 2019-01-20
val nextXmas = LocalDate.of(2020, 12, 25) // 2020-12-25
val years: Long = YEARS.between(
  now1,
  nextXmas
)



//-------------------------------------------------------
// Formatting Dates
//-------------------------------------------------------

import java.time.LocalDate
import java.time.format.DateTimeFormatter
val date = LocalDate.now // 2021-02-04
val fmt = DateTimeFormatter.BASIC_ISO_DATE
fmt.format(date)


//-------------------------------------------------------
// Parsing Strings into Dates
// -------------------------------------------------------

import java.time.LocalDate
val d = LocalDate.parse("2020-12-10")

import java.time.format.DateTimeFormatter
val df = DateTimeFormatter.ofPattern("yyyy/MM/dd")
val da = LocalDate.parse("2020/12/10", df)

