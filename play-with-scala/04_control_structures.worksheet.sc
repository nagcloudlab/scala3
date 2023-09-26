// for Loops and for Expressions

for i <- List(1, 2, 3) do println(i)

val range = 1 to 10

for i <- range
if i > 3
if i < 6
do println(i)

val listofInts =
  for i <- 1 to 10
  if i > 3
  if i < 6
  yield i * 10

// if/then/else-if Expressions

val a=0
val absValue = if a < 0 then -a else a

def compare(a:Int,b:Int):Int=
    if a<b then
        -1
    else if a==b then
        0
    else    
        1
end compare


// match Expressions and Pattern Matching

def isTrue(a:Matchable):Boolean = a match 
    case false | 0 | "" => false
    case _ => true


// try/catch/finally Blocks

/*
try
    // some exception-throwing code here
catch
    case e1: Exception1Type => // handle that exception
    case e2: Exception2Type => // handle that exception
finally
    // close your resources and do anything else necessary here
*/


def makeInt(s:String):Option[Int]=
    try 
        Some(s.toInt)
    catch
        case e:NumberFormatException => None    

makeInt("123")
makeInt("ibm")        


// while Loops

var i=0;

val r:Unit=while 
    i < 10
    do
    println(i)
    i += 1


r == ()



def printSomething() = 
    println("hello")
val v=printSomething()
v == ()




//  Looping over Data Structures with for

val fruits=List("apple","banana","orange")

for f <- fruits do println(f)

for f <- fruits do
 val s = f.toUpperCase
 println(s)


for i <- 0 until 10 do println(i)


for i <- 0 until fruits.length do
println(s"$i is ${fruits(i)}")


for (fruit, index) <- fruits.zipWithIndex do
println(s"$index is $fruit")


val names = Map(
"firstName" -> "Robert",
"lastName" -> "Goren"
)

for (k,v) <- names do println(s"key: $k, value: $v")


fruits.foreach(println)
fruits.foreach(f=>println(f.toUpperCase()))
fruits.foreach { f=>
    val s = f.toUpperCase()
    println(s)
}



// Using for Loops with Multiple Counters

for i <- 1 to 2; j <- 1 to 2 do println(s"i = $i, j = $j")

for
i <- 1 to 3
j <- 1 to 5
k <- 1 to 10 by 2
do
println(s"i = $i, j = $j, k = $k")


//  Using a for Loop with Embedded if Statements (Guards)

for
i <- 1 to 10
if i % 2 == 0
do
print(s"$i ")


for
i <- 1 to 10
if i > 3
if i < 6
if i % 2 == 0
do
println(i)


// Creating a New Collection from an Existing Collection with for/yield

val names1 = List("chris", "ed", "maurice")

val capNames = for name <- names1 yield name.capitalize


// [1] declare the type of `lengths`
val lengths1:List[Int] = for name <- names1 yield
// imagine that this body requires multiple lines of code
name.length


// [2] don’t declare the type of `lengths`
val lengths2 = for name <- names1 yield
// imagine that this body requires multiple lines of code
name.length



val xs = List(1,2,3)
val ys = List(4,5,6)
val zs = List(7,8,9)


val aa = for
    x <- xs
    if x > 2
    y <- ys
    z <- zs
    if y * z < 45
yield
    val b = x + y
    val c = b * z
    c


def between3and10(xs: List[Int]): List[Int] =
for
    x <- xs
    if x >= 3
    if x <= 10
yield x

between3and10(List(1,3,7,11))


// for + yield  == map

val namesUpper1 = for n <- names1 yield n.toUpperCase
val namesUpper2 = names1.map(name=>name.toUpperCase)
val namesUpper3 = names1.map(_.toUpperCase)
val namesUpper4 = names1.map {_.toUpperCase()}


// Using the if Construct Like a Ternary Operator

// int absValue = (a < 0) ? -a : a;

val a3 = 1
val absValue1 = if a3 < 0 then -a3 else a3

println(if a == 0 then "a" else "b")
var hash=1
var prime=31
var name="ibm"
hash = hash * prime + (if name == null then 0 else name.hashCode)

// Version 1: one-line style
def abs(x: Int) = if x >= 0 then x else -x
def max(a: Int, b: Int) = if a > b then a else b

// Version 2: the method body on a separate line, if you prefer
def absv2(x: Int) =
    if x >= 0 then x else -x
def maxv2(a: Int, b: Int) =
    if a > b then a else b


// Using a Match Expression Like a switch Statement    

val k=2

k match
    case 0 => println("Sunday")
    case 1 => println("Monday")
    case 2 => println("Tuesday")
    case 3 => println("Wednesday")
    case 4 => println("Thursday")
    case 5 => println("Friday")
    case 6 => println("Saturday")
    // catch the default with a variable so you can print it
    case whoa => println(s"Unexpected case: ${whoa.toString}")

val day=k match
    case 0 => "Sunday"
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case _ => "invalid day"

day



class SwitchDemo:
    val i = 1
    val x = i match
        case 1 => "One"
        case 2 => "Two"
        case 3 => "Three"
        case _ => "Other"

val ii=12

ii match
    case 0 => println("0 received")
    case 1 => println("1 is good, too")
    case _ => println("oops")


val days = Map(
    0 -> "Sunday",
    1 -> "Monday",
    2 -> "Tuesday",
    3 -> "Wednesday",
    4 -> "Thursday",
    5 -> "Friday",
    6 -> "Saturday"
)
println(days(0))




//  Matching Multiple Conditions with One Case Statement

val v1=10
v1 match
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _ => println("too big")

val cmd = "stop"
cmd match
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")    


enum Command:
    case Start,Go,Stop,Who


import Command._
def executeCommand(cmd: Command): Unit = cmd match
    case Start | Go => println("start")
    case Stop | Who => println("stop")    


// Assigning the Result of a Match Expression to a Variable

val someNumber = scala.util.Random.nextInt()
val evenOrOdd = someNumber match
case 1 | 3 | 5 | 7 | 9 => "odd"
case 2 | 4 | 6 | 8 | 10 => "even"
case _ => "other"


def isTruee(a: Matchable): Boolean = a match
case false | 0 | "" => false
case _ => true



// Accessing the Value of the Default Case in a Match Expression

i match
case 0 => println("1")
case 1 => println("2")
case default => println(s"You gave me: $default")


i match
case 0 => println("1")
case 1 => println("2")
case what => println(s"You gave me: $what" )



// Using Pattern Matching in MatchExpressions


def test(x: Matchable): String = x match
    // constant patterns
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said 'hello'"
    case Nil => "an empty List"
    // sequence patterns
    case List(0, _, _) => "a 3-element list with 0 as the first element"
    case List(1, _*) => "list, starts with 1, has any number of elements"
    // tuples
    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, and $c"
    // constructor patterns
    case Person(first, "Alexander") => s"Alexander, first name =$first"
    case Dog("Zeus") => "found a dog named Zeus"
    // typed patterns
    case s: String => s"got a string: $s"
    case i: Int => s"got an int: $i"
    case f: Float => s"got a float: $f"
    case a: Array[Int] => s"array of int: ${a.mkString(",")}"
    case as: Array[String] => s"string array: ${as.mkString(",")}"
    case d: Dog => s"dog: ${d.name}"
    case list: List[_] => s"got a List: $list"
    case m: Map[_, _] => m.toString
    case _ => "Unknown"

end test    


case class Person(firstName: String, lastName: String)
case class Dog(name: String)

// import System.out.{println => p}
// trigger the constant 
println(test(0))
println(test(0))
println(test(true))
println(test("hello"))
println(test(Nil))
println(test(List(2, 1, 2)))
println(test((1,2,3)))

println(test(Person("Nag", "Alexander")))
println(test(Dog("Puppy")))


// Constant patterns
// Variable patterns
// Constructor patterns
// Sequence patterns
// Tuple patterns
// Typed patterns
// Variable-binding patterns



val s = "ibm"
// later in the code ...
    s.toIntOption match
    case Some(i) => println(i)
    case None => println("That wasn't an Int")


//  Using Enums and Case Classes in match Expressions    

enum Animal:
    case Bird(name: String)
    case Cat(name: String)
    case Woodpecker

import Animal.*

def getInfo(a: Animal): String = a match
    case Bird(m) => s"Got a Bird, name = $m"
    case _: Cat=> "Got a Cat (ignoring the name)"
    case Woodpecker=> "That was a Woodpecker"

println(getInfo(Bird("Fido")))
println(getInfo(Cat("Morris")))
println(getInfo(Woodpecker))    




// Adding if Expressions (Guards) to Case Statements

val i2=9

i2 match
case a if a<=9 => println("0-9 range: " + a)
case b if 10 to 19 contains b => println("10-19 range: " + b)
case c if 20 to 29 contains c => println("20-29 range: " + c)
case _ => println("Hmmm...")



i match
    case x if x == 1 => println("one, a lonely number")
    case x if (x == 2 || x == 3) => println(x)
    case _ => println("some other value")



case class Stock(symbol: String, price: BigDecimal)
val stock = Stock("AAPL", BigDecimal(132.50))

stock match
    case s if s.symbol == "AAPL" && s.price < 140 => println("buy")
    case s if s.symbol == "AAPL" && s.price > 160 => "sell"
    case _ => // do nothing