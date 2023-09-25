
package play$minuswith$minusscala



final class eop$u002Eworksheet$_ {
def args = eop$u002Eworksheet_sc.args$
def scriptPath = """play-with-scala/eop.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object eop$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new eop$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export eop$u002Eworksheet_sc.script as eop$u002Eworksheet

