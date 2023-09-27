
package `03`



final class `6$u002Eworksheet$_` {
def args = `6$u002Eworksheet_sc`.args$
def scriptPath = """03/6.worksheet.sc"""
/*<script>*/
trait HasLegs:
    def run = println("running")
trait HasTail
trait MansBestFriend

// class Pet(val name: String) extends HasLegs, HasTail, MansBestFriend
class Pet(val name: String)

val zeus = new Pet("Zeus") with MansBestFriend with HasTail with HasLegs
val cat = new Pet("Morris") with HasTail with HasLegs

cat.run

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

