
package play$minuswith$minusscala



final class `01_variables_methods$u002Eworksheet$_` {
def args = `01_variables_methods$u002Eworksheet_sc`.args$
def scriptPath = """play-with-scala/01_variables_methods.worksheet.sc"""
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

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `01_variables_methods$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `01_variables_methods$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `01_variables_methods$u002Eworksheet_sc`.script as `01_variables_methods$u002Eworksheet`

