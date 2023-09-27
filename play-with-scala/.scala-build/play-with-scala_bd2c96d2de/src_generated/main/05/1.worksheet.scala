
package `05`



final class `1$u002Eworksheet$_` {
def args = `1$u002Eworksheet_sc`.args$
def scriptPath = """05/1.worksheet.sc"""
/*<script>*/
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
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `1$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `1$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `1$u002Eworksheet_sc`.script as `1$u002Eworksheet`

