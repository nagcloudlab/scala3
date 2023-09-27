
package `04`



final class `7$u002Eworksheet$_` {
def args = `7$u002Eworksheet_sc`.args$
def scriptPath = """04/7.worksheet.sc"""
/*<script>*/

//Writing an unapply method that returns a String

// class Person(val name: String, val age: Int)
// object Person:
//     def unapply(p: Person): String = s"${p.name}, ${p.age}"

// val p = Person("Lori", 33)    
// val personAsAString = Person.unapply(p)
 

// Writing an unapply method to work with a match expression

class Person(val name: String, val age: Int)
object Person:
    def unapply(p: Person): Option[(String, Int)] = Some(p.name,p.age)

val p = Person("Lori", 33)
val deconstructedPerson: String = p match
    case Person(n, a) => s"name: $n, age: $a"
    case null => "null!"    
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `7$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `7$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `7$u002Eworksheet_sc`.script as `7$u002Eworksheet`

