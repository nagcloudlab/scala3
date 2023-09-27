
package `05`



final class `3$u002Eworksheet$_` {
def args = `3$u002Eworksheet_sc`.args$
def scriptPath = """05/3.worksheet.sc"""
/*<script>*/
// Calling a Method on a Superclass or Trait

// class AnimalWithLegs:
//     def walk() = println("I’m walking")
//     def run() = println("I’m running")
// class Dog extends AnimalWithLegs:
//     def walkThenRun() =
//         walk()
//         run()


class AnimalWithLegs:
// the superclass 'walk' method.
    def walk() = println("Animal is walking")

class Dog extends AnimalWithLegs:
// the subclass 'walk' method.
    override def walk() =
        super.walk()
        // invoke the superclass method.
        println("Dog is walking")
 
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

