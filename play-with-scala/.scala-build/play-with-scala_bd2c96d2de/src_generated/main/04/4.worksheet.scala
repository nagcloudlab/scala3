
package `04`



final class `4$u002Eworksheet$_` {
def args = `4$u002Eworksheet_sc`.args$
def scriptPath = """04/4.worksheet.sc"""
/*<script>*/
//  Using apply Methods in Objects as Constructors

// class Person private (val name: String):
//     override def toString = name


// object Person:
// // the “constructor”
//     def apply(name: String): Person = new Person(name)



// val Regina1 = Person("Regina")
// val Regina2 = Person.apply("Regina")
// val a = List(Person("Regina"), Person("Robert"))



class Person private(var name: String, var age: Int):
    override def toString = s"$name is $age years old"

object Person:
    // three ways to build a Person
    def apply(): Person = new Person("", 0)
    def apply(name: String): Person = new Person(name, 0)
    def apply(name: String, age: Int): Person = new Person(name, age)    

println(Person())
println(Person("Regina"))
println(Person("Robert", 22))    
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

