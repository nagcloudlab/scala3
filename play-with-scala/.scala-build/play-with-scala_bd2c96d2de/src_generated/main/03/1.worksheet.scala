
package `03`



final class `1$u002Eworksheet$_` {
def args = `1$u002Eworksheet_sc`.args$
def scriptPath = """03/1.worksheet.sc"""
/*<script>*/


trait Pet:
    def speak() = println("Yo")// concrete implementation
    def comeToMaster(): Unit// abstract method

trait HasLegs:
    def run() = println("I’m running!")


class Dog extends Pet, HasLegs:
    def comeToMaster() = println("I'm coming!")


val d = Dog()
d.speak()
d.comeToMaster()
d.run()
 
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `1$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `1$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `1$u002Eworksheet_sc`.script as `1$u002Eworksheet`

