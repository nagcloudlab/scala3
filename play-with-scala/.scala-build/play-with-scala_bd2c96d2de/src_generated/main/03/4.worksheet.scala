
package `03`



final class `4$u002Eworksheet$_` {
def args = `4$u002Eworksheet_sc`.args$
def scriptPath = """03/4.worksheet.sc"""
/*<script>*/
//  Using a Trait Like an Abstract Class


trait Pet:
    def speak() = println("Yo") // concrete implementation
    def comeToMaster(): Unit // abstract method

class Dog extends Pet:
    // no need to implement `speak` if you don’t want to
    def comeToMaster() = println("I'm coming!")

class Cat extends Pet:
    override def speak() = println("meow")
    def comeToMaster() = println("That’s not gonna happen.")    

abstract class FlyingPet extends Pet:
    def fly() = println("Woo-hoo, I’m flying!")    
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `4$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `4$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `4$u002Eworksheet_sc`.script as `4$u002Eworksheet`

