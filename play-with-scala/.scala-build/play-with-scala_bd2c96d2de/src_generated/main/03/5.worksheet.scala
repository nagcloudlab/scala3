
package `03`



final class `5$u002Eworksheet$_` {
def args = `5$u002Eworksheet_sc`.args$
def scriptPath = """03/5.worksheet.sc"""
/*<script>*/
//  Using Traits as Mixins


trait HasTail:
    def wagTail() = println("Tail is wagging")
    def stopTail() = println("Tail is stopped")

trait Pet:
    def speak() = println("Yo")
    def comeToMaster(): Unit// abstract    

class Dog(val name: String) extends Pet, HasTail:
    def comeToMaster() = println("Woo-hoo, I'm coming!")

val d = Dog("Zeus")


class Cat(val name: String) extends Pet, HasTail:
    def comeToMaster() = println("That’s not gonna happen.")
    override def speak() = println("meow")

val c = Cat("Morris")









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

