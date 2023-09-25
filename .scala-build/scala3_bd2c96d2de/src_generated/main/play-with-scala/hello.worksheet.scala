
package play$minuswith$minusscala



final class hello$u002Eworksheet$_ {
def args = hello$u002Eworksheet_sc.args$
def scriptPath = """play-with-scala/hello.worksheet.sc"""
/*<script>*/
/*


 */

println("Hello world!")

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object hello$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new hello$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export hello$u002Eworksheet_sc.script as hello$u002Eworksheet

