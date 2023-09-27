
package `02`



final class `05_classes_4$u002Eworksheet$_` {
def args = `05_classes_4$u002Eworksheet_sc`.args$
def scriptPath = """02/05_classes_4.worksheet.sc"""
/*<script>*/
//  Generating Boilerplate Code with Case Classes

// class Student private (val id: Int, val name: String):
//     override def toString(): String = ???
//     override def equals(x: Any): Boolean = ???
//     override def hashCode(): Int = ???
// object Student:
//     def apply(id: Int, name: String)= new Student(id, name)
//     def unapply(s:Student) : Option[(Int,String)]= 
//         Some((s.id, s.name))


case class Student(id: Int, name: String)

val s1 = Student(1, "s1")
val s2 = Student(1, "s1")

s1
s1 == s2
s1.hashCode()
s2.hashCode()
s1.copy()

s1 match
    case Student(id,name) => println(s"$id, $name")

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `05_classes_4$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `05_classes_4$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `05_classes_4$u002Eworksheet_sc`.script as `05_classes_4$u002Eworksheet`

