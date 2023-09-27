
package `04`



final class `3$u002Eworksheet$_` {
def args = `3$u002Eworksheet_sc`.args$
def scriptPath = """04/3.worksheet.sc"""
/*<script>*/
//  Creating Static Members with Companion Objects

// Pizza class
class Pizza (var crustType: String):
    override def toString = s"Crust type is $crustType"

// companion object
object Pizza:
    val CRUST_TYPE_THIN = "THIN" // static fields
    val CRUST_TYPE_THICK = "THICK"
    def getPrice = 0.0 // static method    

println(Pizza.CRUST_TYPE_THIN)
println(Pizza.getPrice)   



// class Foo:
//     private val secret = 42
// object Foo:
// // access the private class field `secret`
//     def doubleFoo(foo: Foo) = foo.secret * 2    

// val f = Foo()
// println(Foo.doubleFoo(f))

object Foo:
    private val obj = "Foo’s object"

class Foo:
// access the private object field `obj`
    def printObj = println(s"I can see ${Foo.obj}")

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `3$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `3$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `3$u002Eworksheet_sc`.script as `3$u002Eworksheet`

