
package `02`



final class `05_classes_3$u002Eworksheet$_` {
def args = `05_classes_3$u002Eworksheet_sc`.args$
def scriptPath = """02/05_classes_3.worksheet.sc"""
/*<script>*/
//  Setting Uninitialized var Field Types

class Address(val city: String, val state: String, val zip: String)
class Person(var username: String, var password: String):
    var age=0
    var firstName: String = ""
    var lastName: String = ""
    var address: Option[Address] = None

val p = Person("alvinalexander", "secret")
p.address = Some(Address("Talkeetna", "AK", "99676"))

p.address.foreach {a=>
    println(s"${a.city}, ${a.state}, ${a.zip}")
}
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `05_classes_3$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `05_classes_3$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `05_classes_3$u002Eworksheet_sc`.script as `05_classes_3$u002Eworksheet`

