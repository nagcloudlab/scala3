
package `03`



final class `3$u002Eworksheet$_` {
def args = `3$u002Eworksheet_sc`.args$
def scriptPath = """03/3.worksheet.sc"""
/*<script>*/
// Defining Abstract Fields in Traits


trait PizzaTrait:
    def maxNumToppings: Int


class SmallPizza extends PizzaTrait:
    // val maxNumToppings = 4
    // lazy val maxNumToppings =
    //     Thread.sleep(1_000)
    //     4
    var maxNumToppings = 6    


trait Foo:
    def bar: Int // abstract
    val a = 1 // concrete val
    var b = 2 // concrete var


trait SentientBeing:
    var uuid = 0// concrete

class Person extends SentientBeing:
    uuid = 1


trait Cat:
    val numLives = 9 // concrete

class BetterCat extends Cat:
    override val numLives = 10


    
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

