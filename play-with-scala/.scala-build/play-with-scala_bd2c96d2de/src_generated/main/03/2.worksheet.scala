
package `03`



final class `2$u002Eworksheet$_` {
def args = `2$u002Eworksheet_sc`.args$
def scriptPath = """03/2.worksheet.sc"""
/*<script>*/
//   Using a Trait as an Interface

trait HasTail:
    def startTail(): Unit
    def stopTail(): Unit

trait HasLegs:
    def startRunning(speed: Double): Unit
    def runForNSeconds(speed: Double, numSeconds: Int): Unit


class Dog extends HasTail, HasLegs:
    def startTail(): Unit = println("Tail is wagging")
    def stopTail(): Unit = println("Tail is stopped")
    def startRunning(speed: Double): Unit =
        println(s"Running at $speed miles/hour")
    def runForNSeconds(speed: Double, numSeconds: Int): Unit =
        println(s"Running at $speed miles/hour for $numSeconds seconds")


trait SentientBeing:
    def imAlive_!(): Unit = println("I’m alive!")
trait Furry        

trait Animal extends SentientBeing, Furry


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

