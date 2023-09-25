val a = 12
var b = 12
b = 13

val c = a + b

val d = { a + b }

val e = {
  val i = 10
  val j = 20
  a + b + i + j
}

def add(x: Int, y: Int): Int = x + y
add(1, 2)

def addAgain(x: Int, y: Int) =
  val i = 10
  val j = 20
  x + y + i + j

addAgain(1, 2)
addAgain(10, 20)

def sayHello(name: String) = println(s"hello $name")
sayHello("ibm")

def sayHi = println("Hi")
sayHi

val i = 10
val j = 20

// if-else as statement
var v1 = 0
if i < j then v1 = 100
else v1 = 200

println(v1)

// if-else as expressions

val v2 = if (i < j) 100 else 200

def max(x: Int, y: Int) = if (x > y) x else y

def min(x: Int, y: Int) =
  if (x < y)
    x
  else
    y

max(12, 13)
min(12, 13)

val p = 12
val q = 0

val divided =
  try p / q
  catch case ae: ArithmeticException => 0
