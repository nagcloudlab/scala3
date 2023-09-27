
package `03`



final class `9$u002Eworksheet$_` {
def args = `9$u002Eworksheet_sc`.args$
def scriptPath = """03/9.worksheet.sc"""
/*<script>*/

// Using Traits to Create Modules

trait AddService:
    def add(a: Int, b: Int) = a + b
    def getInt:Int
trait MultiplyService:
    def multiply(a: Int, b: Int) = a * b

// object AddService extends AddService
// AddService.add(12,12)    

object MathService extends AddService, MultiplyService:
    def getInt: Int = 100
    
import MathService._

add(12,12)
multiply(12,12)
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `9$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `9$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `9$u002Eworksheet_sc`.script as `9$u002Eworksheet`

