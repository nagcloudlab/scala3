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
