
package `04`



final class `2$u002Eworksheet$_` {
def args = `2$u002Eworksheet_sc`.args$
def scriptPath = """04/2.worksheet.sc"""
/*<script>*/
// Creating Singletons with object


object CashRegister:
    def open() = println("opened")
    def close() = println("closed")

object StringUtils:
    def isNullOrEmpty(s: String): Boolean =
    if s==null || s.trim.equals("") then true else false
    def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
    def rightTrim(s: String): String = s.replaceAll("\\s+$", "")
    def capitalizeAllWordsInString(s: String): String =
    s.split(" ").map(_.capitalize).mkString(" ")
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `2$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `2$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `2$u002Eworksheet_sc`.script as `2$u002Eworksheet`

