import scala.collection.mutable.ListBuffer
// ----------------------------------------------------------------
// Principles of function
// ----------------------------------------------------------------

//    - A function can be stored in a variable as value
//    - A parameter of a function can be a function
//    - The return value of a function can be a function

// ----------------------------------------------------------------

val f1 = () => 123
val f2 = (x: Int) => 123 + x
val f3: (x: Int, y: Int) => Int = (x: Int, y: Int) => x + y

f1()
f2(100)
f3(12, 12)

// ----------------------------------------------------------------

val numbers = List.range(1, 10)

// def getOddNumbers(input: List[Int]): List[Int] =
//   for
//     i <- input
//     if i % 2 != 0
//   yield i

// def getEvenNumbers(input: List[Int]): List[Int] =
//   for
//     i <- input
//     if i % 2 == 0
//   yield i

// getOddNumbers(numbers)
// getEvenNumbers(numbers)

def filter(input: List[Int], predicate: (i: Int) => Boolean): List[Int] =
  for
    i <- input
    if predicate(i)
  yield i

filter(numbers, (i: Int) => true)
filter(numbers, (i: Int) => i % 2 == 0)
filter(numbers, (i: Int) => i % 2 != 0)

// ----------------------------------------------------------------
// Using Function Literals (Anonymous Functions)
// ----------------------------------------------------------------

val x = List.range(1, 10)

val evens1 = x.filter((i: Int) => i % 2 == 0)
val evens2 = x.filter((i) => i % 2 == 0)
val evens3 = x.filter(i => i % 2 == 0)
val evens4 = x.filter(_ % 2 == 0)
val evens5 = x.filter { i => i % 2 == 0 }
val evens6 = x.filter { _ % 2 == 0 }

x.foreach((i: Int) => println(i))
x.foreach(println(_))
x.foreach(println)

// Anonymous functions that have multiple parameters

val map = Map(1 -> 10, 2 -> 20, 3 -> 30)
map.transform((k, v) => k + v)

// ----------------------------------------------------------------
// Passing Functions Around as Variables
// ----------------------------------------------------------------

val double = (i: Int) => i * 2
double(2)
double(3)

val list = List.range(1, 5)
list.map(double)

val length = (s: String) => s.length
val lengths = List("Mercedes", "Hannah", "Emily").map(length)

// Functions and Methods are Generally Interchangeable

def sayHello1 = println("hello")
val sayHello2 = () => println("hello")

val isEven1: (Int) => Boolean = i => { i % 2 == 0 }
val isEven2: Int => Boolean = i => { i % 2 == 0 }
val isEven3: Int => Boolean = i => i % 2 == 0
val isEven4: Int => Boolean = _ % 2 == 0

// implicit approach
val add1 = (x: Int, y: Int) => { x + y }
val add2 = (x: Int, y: Int) => x + y

// explicit approach
val add3: (Int, Int) => Int = (x, y) => { x + y }
val add4: (Int, Int) => Int = (x, y) => x + y

val addThenDouble: (Int, Int) => Int = (x, y) =>
  val a = x + y
  2 * a

def isEvenMethod1(i: Int) = i % 2 == 0
def isEvenMethod2(i: Int) = { i % 2 == 0 }
def isEvenMethod3(i: Int): Boolean = i % 2 == 0
def isEvenMethod4(i: Int): Boolean = { i % 2 == 0 }

val list1 = List.range(1, 10)
list1.filter(isEvenMethod1)

val c = scala.math.cos
c(0)

// partially applied function

// scala.math.pow(3, 2)
// scala.math.pow(4, 2)

val square = scala.math.pow(_, 2)
square(3)
square(4)

// Storing functions in a Map

def add(i: Int, j: Int) = i + j
def multiply(i: Int, j: Int) = i * j

// store the functions in a Map
val functions = Map(
  "add" -> add,
  "multiply" -> multiply
)

val f = functions("add")
f(2, 2)

// ----------------------------------------------------------------
// HOF ( Higher Order Function)
// ----------------------------------------------------------------

// design issues
// 1. code tangling
// 2. code scattaring

// solution  in FP ==> using Higher Order Function ( HOF )

val hello = () => {
  println("hello")
}

val hi = () => {
  println("Hi")
}

val withEmojiHOF = (f: () => Unit) => {
  val o = () => {
    f()
    println("😊")
  }
  o
}

hello()
withEmojiHOF(hello)()

hi()
val hiWithSmile = withEmojiHOF(hi)
hiWithSmile()

def exec(callback: Int => Unit) =
// invoke the function we were given, giving it an Int parameter
  callback(1)

val plusOne1 = (i: Int) => println(i + 1)
def plusOne2(i: Int) = println(i + 1)

exec(plusOne1)

val plusTen = (i: Int) => println(i + 10)

exec(plusTen)

def executeXTimes(callback: () => Unit, numTimes: Int): Unit =
  for i <- 1 to numTimes do callback()

val sayHello = () => println("Hello")
executeXTimes(sayHello, 3)

def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int): Unit =
  val result = f(x, y)
  println(result)

val sum = (x: Int, y: Int) => x + y
val multiply = (x: Int, y: Int) => x * y

executeAndPrint(sum, 1, 2)
executeAndPrint(multiply, 3, 3)

// ----------------------------------------------------------------
//Using Partially Applied Functions
// ----------------------------------------------------------------

val sum1 = (a: Int, b: Int, c: Int) => a + b + c

val addTo3 = sum1(1, 2, _)
addTo3(10)

// Real-world use
def wrap(prefix: String, html: String, suffix: String) =
  prefix + html + suffix

val wrapWithDiv = wrap("<div>", _, "</div>")
wrapWithDiv("<p>Hello, world</p>")
wrapWithDiv("""<img src="/images/foo.png" />""")

//----------------------------------------------------------------

// def greeting(language: String): (String => String) = (name: String) =>
//   val englishFunc = () => s"Hello, $name"
//   val spanishFunc = () => s"Buenos dias, $name"
//   language match
//     case "english" => englishFunc()
//     case "spanish" => spanishFunc()

// val enGreeting = greeting("english")
// enGreeting("Nag")

//----------------------------------------------------------------
// Creating Partial Functions
//----------------------------------------------------------------

// val divide = (x: Int) => 42 / x
// divide(2)
// divide(0)

// val divide = new PartialFunction[Int, Int] {
//   def apply(x: Int) = 4 / x
//   def isDefinedAt(x: Int): Boolean = x != 0
// }

// divide.isDefinedAt(0)
// divide.isDefinedAt(1)

// val result = if divide.isDefinedAt(0) then Some(divide(0)) else None

// val divide2: PartialFunction[Int, Int] =
//   case d if d != 0 => 42 / d

// val result = if divide2.isDefinedAt(1) then Some(divide2(1)) else None

val convert1to5 = new PartialFunction[Int, String] {
  val nums = Array("one", "two", "three", "four", "five")
  def apply(i: Int) = nums(i - 1)
  def isDefinedAt(i: Int) = i > 0 && i < 6
}

// converts 6 to "six", etc., up to 10
val convert6to10 = new PartialFunction[Int, String] {
  val nums = Array("six", "seven", "eight", "nine", "ten")
  def apply(i: Int) = nums(i - 6)
  def isDefinedAt(i: Int) = i > 5 && i < 11
}

val handle1To10 = convert1to5 orElse convert6to10

handle1To10(1)
handle1To10(7)

// Partial functions in the collections classes

val divide: PartialFunction[Int, Int] =
  case d: Int if d != 0 => 42 / d

// List(0, 1, 2).map(divide)
List(0, 1, 2).collect(divide)
List(42, "cat").collect { case (i: Int) => i + 1 }

val possibleNums = List(Some(1), None, Some(3), None)
possibleNums.collect { case Some(i) => i }
