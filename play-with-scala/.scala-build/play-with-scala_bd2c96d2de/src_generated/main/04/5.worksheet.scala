
package `04`



final class `5$u002Eworksheet$_` {
def args = `5$u002Eworksheet_sc`.args$
def scriptPath = """04/5.worksheet.sc"""
/*<script>*/
//  Implementing a Static Factory with apply


trait Animal:
    def speak(): Unit

private class Dog extends Animal:
    override def speak() = println("woof")
private class Cat extends Animal:
    override def speak() = println("meow")    

object Animal:
    def apply(s:String):Animal=
        if s=="dog" then Dog() else Cat()    


val cat=Animal("cat")
val dog=Animal("dog")

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

