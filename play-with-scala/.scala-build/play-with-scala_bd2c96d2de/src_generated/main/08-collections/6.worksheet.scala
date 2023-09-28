
package `08$minuscollections`



final class `6$u002Eworksheet$_` {
def args = `6$u002Eworksheet_sc`.args$
def scriptPath = """08-collections/6.worksheet.sc"""
/*<script>*/
//tuple

def getValues() =
  (1, 2, 3, "hello", true)

getValues()

var t1 = ("hello", "World")
t1._1
t1(0)
t1._2
t1(1)

case class Stock(symbol: String, price: Double)
val aapl = Stock("AAPL", 123.45)

val t = Tuple.fromProduct(aapl)
t

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `6$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `6$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `6$u002Eworksheet_sc`.script as `6$u002Eworksheet`

