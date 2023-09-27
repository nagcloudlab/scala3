
package `02`



final class `05_classes_5$u002Eworksheet$_` {
def args = `05_classes_5$u002Eworksheet_sc`.args$
def scriptPath = """02/05_classes_5.worksheet.sc"""
/*<script>*/

//  Defining Auxiliary Constructors for CaseClasses

case class Person(var name: String, var age: Int)


object Person:
    def apply()=new Person("<no name",0)
    def apply(name:String)=new Person(name,0)

val p = Person("John Smith", 30)
val p2=Person()
val p3=Person("John Smith")
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `05_classes_5$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `05_classes_5$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `05_classes_5$u002Eworksheet_sc`.script as `05_classes_5$u002Eworksheet`

