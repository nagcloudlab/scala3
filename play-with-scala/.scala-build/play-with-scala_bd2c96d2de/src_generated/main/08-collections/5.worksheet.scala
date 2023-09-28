
package `08$minuscollections`



final class `5$u002Eworksheet$_` {
def args = `5$u002Eworksheet_sc`.args$
def scriptPath = """08-collections/5.worksheet.sc"""
/*<script>*/
// val a = Map(
//   "AL" -> "Alabama",
//   "AK" -> "Alaska"
// )

// create a map
val a = Map(1 -> "a")
// adding elements
val b = a + (2 -> "b")
val c = b ++ Map(3 -> "c", 4 -> "d")
val d = c ++ List(5 -> "e", 6 -> "f")

d.keySet
d.keysIterator
d.max

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `5$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `5$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `5$u002Eworksheet_sc`.script as `5$u002Eworksheet`

