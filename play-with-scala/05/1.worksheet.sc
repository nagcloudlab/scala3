// def methodName(paramName1: type1, paramName2: type2, ...): ReturnType
// =
// // the method body
// // goes here

def printHello(name: String) = println(s"Hello, $name")
def printString(s: String) = println(s)


class Foo:
    final def foo = "foo"

// class FooFoo extends Foo:
    //override def foo = "foo foo"    

// with return type
def isBetween(a: Int, x: Int, y: Int): Boolean = a >= x && a <= y
def max(a: Int, b: Int): Int = if a > b then a else b    

// without return type
def isBetweenV2(a: Int, x: Int, y: Int) = a >= x && a <= y
def maxV2(a: Int, b: Int) = if a > b then a else b

def isBetweenV3(a: Int, x: Int, y: Int): Boolean =
    a >= x && a <= y

def maxV3(a: Int, b: Int): Int =
    if a > b then a else b


def sum(xs: List[Int]): Int = xs match
    case Nil => 0
    case x :: tail => x + sum(tail)    

def allThoseBetween3and10(xs: List[Int]): List[Int] =
    for
        x <- xs
        if x >= 3
        if x <= 10
    yield
     x    