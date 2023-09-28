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
